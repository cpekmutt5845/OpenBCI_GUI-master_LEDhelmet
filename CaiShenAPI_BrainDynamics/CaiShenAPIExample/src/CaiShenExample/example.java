/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaiShenExample;


import javax.swing.DefaultListModel;
import CaiShen.CaiShenHighLevelAPI;
import CaiShen.ElectrodeRef;
import CaiShen.LedColor;
import CaiShen.LightingMode;
import CaiShen.Mode;
import CaiShen.CaiShenException;

/**
 *
 * @author poppy
 */
public class example extends javax.swing.JFrame {

    /**
     * Creates new form example
     */
    
    CaiShenHighLevelAPI api;
    
    DefaultListModel<String> unselectedModel = new DefaultListModel<>();
    DefaultListModel<String> selectedModel = new DefaultListModel<>();
   
    int testIndex = 0;
    
    private void resetList(){
        unselectedModel.clear();
        for(int i=0;i<ElectrodeRef.values().length;i++){
            unselectedModel.addElement(ElectrodeRef.values()[i].name());
        }
        selectedModel.clear();
    }
    
    private void updateChannelsConfigurations(){
        resetList();
        
        ElectrodeRef[] electrodeRefArray = api.getEnabledElectrodeList();
        for(int i=0;i<electrodeRefArray.length;i++){
            selectedModel.addElement(electrodeRefArray[i].name());
            unselectedModel.removeElement(electrodeRefArray[i].name());
        }
        electrodeConfigList.setSelectedIndex(api.getCurrentConfigId());
    }
    
    public example() {
        api = new CaiShenHighLevelAPI();
        initComponents();
        resetList();
        unselectedList.setModel(unselectedModel);
        selectedList.setModel(selectedModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        loggingText = new javax.swing.JTextArea();
        electrodeConfigList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        setLedColorBtn = new javax.swing.JButton();
        getLedColorBtn = new javax.swing.JButton();
        ipText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        connectBtn = new javax.swing.JButton();
        disconnectBtn = new javax.swing.JButton();
        getBattBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        standbyBtn = new javax.swing.JButton();
        powerSavingBtn = new javax.swing.JButton();
        highPowerBtn = new javax.swing.JButton();
        getModeBtn = new javax.swing.JButton();
        getLightingModeBtn = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        unselectedList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        selectedList = new javax.swing.JList<>();
        selectBtn = new javax.swing.JButton();
        unselectBtn = new javax.swing.JButton();
        writeElectrodeConfigBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BrainDynamics - CaiShen API Example");

        loggingText.setColumns(20);
        loggingText.setRows(5);
        jScrollPane1.setViewportView(loggingText);

        electrodeConfigList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        electrodeConfigList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electrodeConfigListActionPerformed(evt);
            }
        });

        jLabel1.setText("Electrode Config");

        setLedColorBtn.setText("Set LED Color");
        setLedColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLedColorBtnActionPerformed(evt);
            }
        });

        getLedColorBtn.setText("Get LED Color");
        getLedColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getLedColorBtnActionPerformed(evt);
            }
        });

        ipText.setText("10.10.10.1");
        ipText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Remote IP:");

        connectBtn.setText("Connect");
        connectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBtnActionPerformed(evt);
            }
        });

        disconnectBtn.setText("Disconnect");
        disconnectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectBtnActionPerformed(evt);
            }
        });

        getBattBtn.setText("Get Batt");
        getBattBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBattBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("LED Color");

        jLabel4.setText("Batt");

        jLabel5.setText("Mode");

        standbyBtn.setText("Standby");
        standbyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standbyBtnActionPerformed(evt);
            }
        });

        powerSavingBtn.setText("Power Saving");
        powerSavingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerSavingBtnActionPerformed(evt);
            }
        });

        highPowerBtn.setText("High Power");
        highPowerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highPowerBtnActionPerformed(evt);
            }
        });

        getModeBtn.setText("Get Mode");
        getModeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getModeBtnActionPerformed(evt);
            }
        });

        getLightingModeBtn.setText("Get Lighting Mode");
        getLightingModeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getLightingModeBtnActionPerformed(evt);
            }
        });

        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        unselectedList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "T4", "F8", "Fp2", "Fp1", "F7", "T3", "T5", "O1", "O2", "T6", "F4", "F3", "P3", "Pz", "P4", "Fz", "C4", "C3", "Cz" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(unselectedList);

        jScrollPane3.setViewportView(selectedList);

        selectBtn.setText(">>");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        unselectBtn.setText("<<");
        unselectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unselectBtnActionPerformed(evt);
            }
        });

        writeElectrodeConfigBtn.setText("Write Electrode Config");
        writeElectrodeConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeElectrodeConfigBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Lighting Mode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(connectBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disconnectBtn)
                                .addGap(0, 13, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(electrodeConfigList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectBtn)
                                    .addComponent(unselectBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(writeElectrodeConfigBtn))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(setLedColorBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getLedColorBtn))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(standbyBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getModeBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(powerSavingBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(highPowerBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getLightingModeBtn))
                            .addComponent(getBattBtn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(connectBtn)
                    .addComponent(disconnectBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn)
                    .addComponent(standbyBtn)
                    .addComponent(getModeBtn))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powerSavingBtn)
                    .addComponent(highPowerBtn)
                    .addComponent(getLightingModeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(electrodeConfigList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(selectBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unselectBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setLedColorBtn)
                            .addComponent(getLedColorBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(writeElectrodeConfigBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getBattBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void electrodeConfigListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electrodeConfigListActionPerformed
        api.setCurrentConfigId(Byte.valueOf(electrodeConfigList.getSelectedItem().toString()));
        updateChannelsConfigurations();
    }//GEN-LAST:event_electrodeConfigListActionPerformed

    private void getLedColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getLedColorBtnActionPerformed
        try {
            loggingText.append("Get LED Color\n");
            LedColor[] ledColor = api.getLowLevelAPI().getLed();
            loggingText.append("OK\n");
            loggingText.append("LED num: "+ledColor.length+"\n");
            for(int i=0;i<ledColor.length;i++){
                loggingText.append(i+" > "+ledColor[i].toString()+"\n");
            }
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_getLedColorBtnActionPerformed

    private void ipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipTextActionPerformed

    private void connectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectBtnActionPerformed
        try{
            api.connect(ipText.getText());
            updateChannelsConfigurations();
            loggingText.append("Connected\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_connectBtnActionPerformed

    private void disconnectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectBtnActionPerformed
        try{
            api.disconnect();
            loggingText.append("Disonnected\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_disconnectBtnActionPerformed

    private void setLedColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLedColorBtnActionPerformed
        try {
            loggingText.append("Set LED Color\n");
            
            for(int i=0;i<ElectrodeRef.values().length;i++)
            {
                if(i==testIndex)
                {
                    api.setElectrodeColor(ElectrodeRef.values()[i].name(),(byte) 255,(byte) 50, (byte)50);
                }
                else
                {
                    api.setElectrodeColor(ElectrodeRef.values()[i].name(),(byte) 0,(byte) 250, (byte) 0);
                }
            }
            
            testIndex++;
            if(testIndex==ElectrodeRef.values().length)
                testIndex = 0;
            
            api.printEnabledElectrodeColor();
            
            if(api.updateCaiShenColor())
                loggingText.append("OK\n");
            else
                loggingText.append("rrrERROR\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_setLedColorBtnActionPerformed

    private void getBattBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBattBtnActionPerformed
        try {
            loggingText.append("Get Batt\n");
            double batt = api.getBatteryLevel();
            loggingText.append("OK\n");
            loggingText.append("batt: "+batt+" mV\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_getBattBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        try{
            loggingText.append("Set Mode Start\n");
            if (api.start())
            loggingText.append("OK\n");
            else
            loggingText.append("ERROR\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void getLightingModeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getLightingModeBtnActionPerformed
        try {
            loggingText.append("Get Lighting Mode\n");
            LightingMode mode = api.getLightingMode();
            loggingText.append("OK\n");
            loggingText.append("lighting mode: "+mode.name()+"\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_getLightingModeBtnActionPerformed

    private void getModeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getModeBtnActionPerformed
        try {
            loggingText.append("Get Mode\n");
            Mode mode = api.getMode();
            loggingText.append("OK\n");
            loggingText.append("mode: "+mode.name()+"\n");
        } catch (CaiShenException ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_getModeBtnActionPerformed

    private void highPowerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highPowerBtnActionPerformed
        try{
            loggingText.append("Set Lighting Mode High Power\n");
            if(api.setHighPowerMode())
            loggingText.append("OK\n");
            else
            loggingText.append("ERROR\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_highPowerBtnActionPerformed

    private void powerSavingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerSavingBtnActionPerformed
        try{
            loggingText.append("Set Lighting Mode Power Saving\n");
            if(api.setPowerSavingMode())
            loggingText.append("OK\n");
            else
            loggingText.append("ERROR\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_powerSavingBtnActionPerformed

    private void standbyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standbyBtnActionPerformed
        try{
            loggingText.append("Set Mode Standby\n");
            if(api.standby())
            loggingText.append("OK\n");
            else
            loggingText.append("ERROR\n");
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_standbyBtnActionPerformed

    private void unselectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unselectBtnActionPerformed
        int selectedIndex = selectedList.getSelectedIndex();
        
        if(selectedIndex<0) return;
        
        String electrode = selectedModel.getElementAt(selectedIndex);
        
        api.disableElectrode(electrode);
        updateChannelsConfigurations();
    }//GEN-LAST:event_unselectBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        int unselectedIndex = unselectedList.getSelectedIndex();
        
        if(unselectedIndex<0) return;
        
        String electrode = unselectedModel.getElementAt(unselectedIndex);
        
        api.enableElectrode(electrode);
        updateChannelsConfigurations();
    }//GEN-LAST:event_selectBtnActionPerformed

    private void writeElectrodeConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeElectrodeConfigBtnActionPerformed
        try {
            loggingText.append("Write Electrode Config\n");
            api.printEnabledElectrodeList();
            if(api.writeAllConfig()){
                loggingText.append("OK\n");
            } else {
                loggingText.append("ERROR\n");
            }
        } catch (Exception ex) {
            loggingText.append(ex.getMessage()+"\n");
        }
    }//GEN-LAST:event_writeElectrodeConfigBtnActionPerformed

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
            java.util.logging.Logger.getLogger(example.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(example.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(example.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(example.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new example().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectBtn;
    private javax.swing.JButton disconnectBtn;
    private javax.swing.JComboBox<String> electrodeConfigList;
    private javax.swing.JButton getBattBtn;
    private javax.swing.JButton getLedColorBtn;
    private javax.swing.JButton getLightingModeBtn;
    private javax.swing.JButton getModeBtn;
    private javax.swing.JButton highPowerBtn;
    private javax.swing.JTextField ipText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea loggingText;
    private javax.swing.JButton powerSavingBtn;
    private javax.swing.JButton selectBtn;
    private javax.swing.JList<String> selectedList;
    private javax.swing.JButton setLedColorBtn;
    private javax.swing.JButton standbyBtn;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton unselectBtn;
    private javax.swing.JList<String> unselectedList;
    private javax.swing.JButton writeElectrodeConfigBtn;
    // End of variables declaration//GEN-END:variables
}
