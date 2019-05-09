/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator.model;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Валерия
 */
public class FileWorker {
    

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

