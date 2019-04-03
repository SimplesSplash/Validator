/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 *
 * @author alex1
 */
public class Model {

    /**
     * Валидация документа по XSD Схеме с помощью класса Validator.
     * Изменен ErrorHandler для того, чтобы валидатор находил все ошибки
     * в документе, а не только первую.
     * @param schemaloc Путь к файлу XSD схемы
     * @param file Путь к файлу, который будет валидироваться
     * @return Возвращает String С результатом валидации
     */
    public String valid(String schemaloc, String file) {
        String result;
        result = "";
        // 1. Поиск и создание экземпляра фабрики для языка XML Schema

        SchemaFactory factory
                = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

        // 2. Компиляция схемы

        File schemaLocation = new File(schemaloc);

        Schema schema;
        try {
            schema = factory.newSchema(schemaLocation);
        } catch (org.xml.sax.SAXException ex) {
            return "Не удалось создать схему для валидации";

        }
        // 3. Создание валидатора для схемы
        Validator validator = schema.newValidator();
        
        final ArrayList<String> exceptions = new ArrayList<>();
        // 4. Установка нового ErrorHandler
        validator.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) throws SAXException {
                 exceptions.add("Строка "+exception.getLineNumber()+", Символ "+exception.getColumnNumber()+":\n"+exception.getMessage()+"\n");
            }

            @Override
            public void fatalError(SAXParseException exception) throws SAXException {
                exceptions.add("Строка "+exception.getLineNumber()+", Символ "+exception.getColumnNumber()+":\n"+exception.getMessage()+"\n");
            }

            @Override
            public void error(SAXParseException exception) throws SAXException {
                 exceptions.add("Строка "+exception.getLineNumber()+", Символ "+exception.getColumnNumber()+":\n"+exception.getMessage()+"\n");
            }
        });

        // 5. Разбор проверяемого документа
        Source source = new StreamSource(file);

        // 6. Валидация документа
        try {
            validator.validate(source);

            if (!exceptions.isEmpty()) {
                for (String e : exceptions) {
                    result += e + "\n";
                }
            } else {
                result = "Файл успешно прошел валидацию.";
            }
        } catch (SAXException | IOException e) {
            return "Ошибка валидации";
        }
        return result;

    }

   

    /**
     * Посимвольно читает заданный файл.
     * @param file Это файл, который необходимо прочитать
     * @return Возвращает String с сожержимым файла 
     */
    public String readFile(File file) {
        StringBuilder temp = new StringBuilder();
        String text;

        try (FileReader reader = new FileReader(file.getAbsolutePath())) {

            int c;

            while ((c = reader.read()) != -1) {
                temp.append((char) c);

            }
            text = temp.toString();
            return text;
        } catch (IOException ex) {
            text = null;

        }
        return text;

    }
   

    /**
     * Этот метод проверяет папку Album и возвращает список всех файлов внутри  
     * @return Возвращает массив файлов в папке Album
     */
    public File[] getSchemas() {
        File albumsDir = new File("Album");
        File[] schemas = albumsDir.listFiles();
     
        return schemas;
    }

    /**
     * Метод, записывающий текст в файл с помощью класса FileWriter.
     * @param path Путь к файлу, в который будет производиться запись
     * @param text Информация, которая будет записана
     * @return
     */
    public String saveFile(String path, String text){
        String result;
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(text);
            writer.close();
            result="Файл успешно сохранен";
        } catch (IOException ex) {
           result="Ошибка при записи";
        }
        
        return result;
    }
}
