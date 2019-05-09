/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator.view;

import validator.model.Model;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import validator.controllers.MainController;
import validator.interfaces.Observable;
import validator.model.FileWorker;
import validator.interfaces.Observer;

/**
 *
 * @author alex1
 */
public class UI extends javax.swing.JFrame implements Observable {

    private List<Observer> observers= new ArrayList<>();

    private Map<String, Object> data = new HashMap<>();

    public UI() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXmlTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXsdTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxWithSchemasOnValidationPanel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jComboBoxWithSchemasOnAlbumPanel = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Валидатор");

        jXmlTextArea.setEditable(false);
        jXmlTextArea.setColumns(20);
        jXmlTextArea.setRows(5);
        jScrollPane1.setViewportView(jXmlTextArea);

        jXsdTextArea.setEditable(false);
        jXsdTextArea.setColumns(20);
        jXsdTextArea.setRows(5);
        jScrollPane2.setViewportView(jXsdTextArea);

        jButton1.setText("Выбрать XML файл");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Валидация");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBoxWithSchemasOnValidationPanel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Документ не выбран--" }));
        jComboBoxWithSchemasOnValidationPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxWithSchemasOnValidationPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxWithSchemasOnValidationPanelFocusGained(evt);
            }
        });
        jComboBoxWithSchemasOnValidationPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxWithSchemasOnValidationPanelActionPerformed(evt);
            }
        });

        jLabel1.setText("Выбранный XML файл:");

        jLabel2.setText("Выбранный XSD файл:");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel3.setText("Результат валидации:");

        jLabel6.setText("Список доступных схем:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxWithSchemasOnValidationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxWithSchemasOnValidationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        jTabbedPane1.addTab("Валидация", jPanel1);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jComboBoxWithSchemasOnAlbumPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxWithSchemasOnAlbumPanelFocusGained(evt);
            }
        });
        jComboBoxWithSchemasOnAlbumPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxWithSchemasOnAlbumPanelActionPerformed(evt);
            }
        });

        jButton3.setText("Открыть файл для редактирования");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Редактируемый файл:");

        jLabel5.setText("Список доступных схем:");

        jButton5.setText("Сохранить файл");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxWithSchemasOnAlbumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 511, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBoxWithSchemasOnAlbumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(0, 456, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Альбом схем", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jFileChooser1.setDialogTitle("Выбор файла для валидации");
        jFileChooser1.setFileSelectionMode(jFileChooser1.FILES_ONLY);
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("XML files", "xml"));
        File selectedXmlFile;
        jFileChooser1.showOpenDialog(UI.this);
        if (jFileChooser1.getSelectedFile() == null) {
            return;
        } else {
            selectedXmlFile = jFileChooser1.getSelectedFile();
        }
        data.put("selectedXmlFile", selectedXmlFile);
        notifyObservers();

        if (data.get("xmlText") == null) {
            JOptionPane.showMessageDialog(jPanel1,
                    "Ошибка при чтении", "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            jXmlTextArea.setText((String) data.get("xmlText"));
        }
        data.clear();

    }//GEN-LAST:event_jButton1ActionPerformed

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void addData(String key, Object value) {
        data.put(key, value);
    }

    public void removeData(String key) {
        data.remove(key);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.updateModel();
        }
    }

    public JComboBox<String> getjComboBoxWithSchemasOnAlbumPanel() {
        return jComboBoxWithSchemasOnAlbumPanel;
    }

    public JComboBox<String> getjComboBoxWithSchemasOnValidationPanel() {
        return jComboBoxWithSchemasOnValidationPanel;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String setXmlText(String text) {
        return text;
    }

    public String setXsdText(String text) {
        return text;
    }

    public JTextArea getjXmlTextArea() {
        return jXmlTextArea;
    }

    public JTextArea getjXsdTextArea() {
        return jXsdTextArea;
    }

    @Override
    public void addObservers(List<Observer> obs) {

        this.observers.addAll(obs);

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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jTextArea4.setText("");
       data.put("startValidation", null);
       notifyObservers();
        jTextArea4.append((String) data.get("validationResult"));
        if ("Не удалось создать схему для валидации".equals(jTextArea4.getText())) {
            JOptionPane.showMessageDialog(jPanel1, "Некорректный файл схемы", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
        if ("Ошибка валидации".equals(jTextArea4.getText())) {
            JOptionPane.showMessageDialog(jPanel1, "Ошибка валидации", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxWithSchemasOnAlbumPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxWithSchemasOnAlbumPanelActionPerformed
         if (jComboBoxWithSchemasOnAlbumPanel.getSelectedIndex() != -1) {
            data.put("indexOfSelectedXsdFile", jComboBoxWithSchemasOnAlbumPanel.getSelectedIndex());
            notifyObservers();
            if (data.get("xsdText") == null) {
                JOptionPane.showMessageDialog(jPanel1,
                        "Ошибка при чтении", "Ошибка",
                        JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_jComboBoxWithSchemasOnAlbumPanelActionPerformed

    //Кнопка "Открыть файл для редактирования"
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jTextArea3.setText("");
        if (data.get("xsdText") == null) {
            JOptionPane.showMessageDialog(jPanel1,
                    "Не выбран файл", "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            jTextArea3.setText((String) data.get("xsdText"));
            
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxWithSchemasOnValidationPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxWithSchemasOnValidationPanelActionPerformed


        if (jComboBoxWithSchemasOnValidationPanel.getSelectedIndex() != -1) {
            data.put("indexOfSelectedXsdFile", jComboBoxWithSchemasOnValidationPanel.getSelectedIndex());
            notifyObservers();
            if (data.get("xsdText") == null) {
                JOptionPane.showMessageDialog(jPanel1,
                        "Ошибка при чтении", "Ошибка",
                        JOptionPane.ERROR_MESSAGE);
            } else{
                jXsdTextArea.setText((String) data.get("xsdText"));
            }
        }
    }//GEN-LAST:event_jComboBoxWithSchemasOnValidationPanelActionPerformed

    //Метод, обновляющий список схем при наведении на выпадающий список
    //на вкладке "Валидация"
    private void jComboBoxWithSchemasOnValidationPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxWithSchemasOnValidationPanelFocusGained
        // TODO add your handling code here:
        jComboBoxWithSchemasOnValidationPanel.removeAllItems();
        data.put("updatingSchemas", null);
        notifyObservers();
        File[] schemas = (File[]) data.get("schemas");
        for (File schema : schemas) {
            jComboBoxWithSchemasOnValidationPanel.addItem(schema.getName());
        }

        data.clear();

    }//GEN-LAST:event_jComboBoxWithSchemasOnValidationPanelFocusGained
    //Метод, обновляющий список схем при наведении на выпадающий список
    //на вкладке "Альбом схем"
    private void jComboBoxWithSchemasOnAlbumPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxWithSchemasOnAlbumPanelFocusGained

        jComboBoxWithSchemasOnAlbumPanel.removeAllItems();
        data.put("updatingSchemas", null);
        notifyObservers();
        File[] schemas = (File[]) data.get("schemas");
        for (File schema : schemas) {
            jComboBoxWithSchemasOnAlbumPanel.addItem(schema.getName());
        }
       
    }//GEN-LAST:event_jComboBoxWithSchemasOnAlbumPanelFocusGained

    //Кнопка "Сохранить"
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        data.put("saveFile", data.get("indexOfSelectedXsdFile"));
        data.put("text", jTextArea3.getText());
        notifyObservers();
        JOptionPane.showMessageDialog(jPanel2, (String) data.get("result"), "Результат сохранения", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Model model1 = new Model();
            UI ui = new UI();
            FileWorker fileWorler = new FileWorker();
            Observer mainController = new MainController(ui, model1, fileWorler);
            ui.addObserver(mainController);
            model1.addObserver(mainController);
            ui.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBoxWithSchemasOnAlbumPanel;
    private javax.swing.JComboBox<String> jComboBoxWithSchemasOnValidationPanel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jXmlTextArea;
    private javax.swing.JTextArea jXsdTextArea;
    // End of variables declaration//GEN-END:variables

    

}
