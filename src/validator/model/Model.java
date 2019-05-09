/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import validator.interfaces.Observable;
import validator.interfaces.Observer;

/**
 *
 * @author alex1
 */
public class Model implements Observable {

    private File xmlFile;

    private File xsdFile;
    
    private File[] schemas; 
    
    private String validationResult;

    public String getValidationResult() {
        return validationResult;
    }

    public Model() {
        this.schemas=getSchemas();
    }

    private List<Observer> observers= new ArrayList<>();

    public File getXmlFile() {
        return xmlFile;
    }

    public void setXmlFile(File xmlFile) {
        this.xmlFile = xmlFile;
        this.notifyObservers();
    }

    public File getXsdFile() {
        return xsdFile;
    }

    public void setXsdFile(File xsdFile) {
        this.xsdFile = xsdFile;
        this.notifyObservers();
    }

    /**
     * Валидация документа по XSD Схеме с помощью класса Validator. Изменен
     * ErrorHandler для того, чтобы валидатор находил все ошибки в документе, а
     * не только первую.
     *
     * @return Возвращает String С результатом валидации
     */
    public void valid() {
       validationResult="";
        // 1. Поиск и создание экземпляра фабрики для языка XML Schema

        SchemaFactory factory
                = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

        // 2. Компиляция схемы
        File schemaLocation = new File(xsdFile.getAbsolutePath());

        Schema schema;
        try {
            schema = factory.newSchema(schemaLocation);
        } catch (org.xml.sax.SAXException ex) {
            validationResult= "Не удалось создать схему для валидации";
            notifyObservers();
            return;
        }
        // 3. Создание валидатора для схемы
        Validator validator = schema.newValidator();

        final ArrayList<String> exceptions = new ArrayList<>();
        // 4. Установка нового ErrorHandler
        validator.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) throws SAXException {
                exceptions.add("Строка " + exception.getLineNumber()
                        + ", Символ " + exception.getColumnNumber() + ":\n"
                        + exception.getMessage() + "\n");
            }

            @Override
            public void fatalError(SAXParseException exception) throws SAXException {
                exceptions.add("Строка " + exception.getLineNumber()
                        + ", Символ " + exception.getColumnNumber()
                        + ":\n" + exception.getMessage() + "\n");
            }

            @Override
            public void error(SAXParseException exception) throws SAXException {
                exceptions.add("Строка " + exception.getLineNumber()
                        + ", Символ " + exception.getColumnNumber()
                        + ":\n" + exception.getMessage() + "\n");
            }
        });

        // 5. Разбор проверяемого документа
        Source source = new StreamSource(xmlFile.getAbsolutePath());

        // 6. Валидация документа
        try {
            validator.validate(source);

            if (!exceptions.isEmpty()) {
                for (String e : exceptions) {
                    validationResult += e + "\n";
                }
            } else {
                validationResult = "Файл успешно прошел валидацию.";
            }
        } catch (SAXException | IOException e) {
            validationResult= "Ошибка валидации";
            notifyObservers();
            return;
        }
       notifyObservers();

    }

    /**
     * Этот метод проверяет папку Album и обновляет массив всех файлов внутри
     *
     */
    public void updateSchemas() {
        File albumsDir = new File("Album");
        this.schemas = albumsDir.listFiles();
        notifyObservers();
    }

    @Override
    public void addObservers(List<Observer> obs) {

        this.observers.addAll(obs);

    }

    public File[] getSchemas() {
        return schemas;
    }

    @Override
    public void removeObservers(List<Observer> obs) {
        this.observers.removeAll(obs);
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.updateView();
        }
    }
}
