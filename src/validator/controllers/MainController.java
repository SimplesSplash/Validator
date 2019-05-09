/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator.controllers;

import validator.interfaces.Observer;
import java.io.File;
import validator.model.FileWorker;
import validator.model.Model;
import validator.view.UI;

/**
 *
 * @author alex1
 */
public class MainController implements Observer {

    private UI ui;

    private Model model;

    private FileWorker fileWorker;

    public FileWorker getFileWorker() {
        return fileWorker;
    }

    public void setFileWorker(FileWorker fileWorker) {
        this.fileWorker = fileWorker;
    }

    public MainController(UI ui, Model model, FileWorker fileWorker) {
        this.ui = ui;
        this.model = model;
        this.fileWorker = fileWorker;
    }

    public void updateXmlFile(File file) {
        this.model.setXmlFile(file);
    }

    public void updateXsdFile(File file) {
        this.model.setXsdFile(file);
    }

     public  void updateSchemas(){
         this.model.updateSchemas();
     }
    
    @Override
    public void startValidation() {
        this.model.valid();
    }

    public UI getUi() {
        return ui;
    }

    public void setUi(UI ui) {
        this.ui = ui;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void updateModel() {
        if (ui.getData().containsKey("selectedXmlFile")) {
            updateXmlFile((File) ui.getData().get("selectedXmlFile"));

        }
        if (ui.getData().containsKey("indexOfSelectedXsdFile")) {
            Integer index= (int) ui.getData().get("indexOfSelectedXsdFile");
            File xsdFile= model.getSchemas()[index];
            updateXsdFile(xsdFile);

        }
        if (ui.getData().containsKey("updatingSchemas")) {
            updateSchemas();
        }
        
        if(ui.getData().containsKey("saveFile")){
             Integer index= (int) ui.getData().get("saveFile");
            File savingFile= model.getSchemas()[index];
            String result=fileWorker.saveFile(savingFile.getAbsolutePath(), (String) ui.getData().get("text"));
            ui.getData().put("result", result);
        }
        if(ui.getData().containsKey("startValidation")){
            startValidation();
        }
        
    }

    @Override
    public void updateView() {
        if (ui.getData().containsKey("selectedXmlFile")){
            File xmlFile= (File) ui.getData().get("selectedXmlFile");
            ui.getData().put("xmlText", fileWorker.readFile(xmlFile));
        }
        if (ui.getData().containsKey("indexOfSelectedXsdFile")){
            File xsdFile=model.getXsdFile();
            ui.getData().put("xsdText", fileWorker.readFile(xsdFile));
        }
       
        if (ui.getData().containsKey("updatingSchemas")) {
            ui.getData().put("schemas", model.getSchemas());
        }
        if (ui.getData().containsKey("startValidation")){
            ui.getData().put("validationResult", model.getValidationResult());
        }
    }

}
