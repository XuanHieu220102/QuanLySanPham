/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PRODUCTMANAGER;
import PRODUCTMANAGER.DELETE;
import PRODUCTMANAGER.TV;
import PRODUCTMANAGER.TVimpl;
import Tivi.SEARCH;
import java.awt.Color;
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Collections;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class ProductFrame extends javax.swing.JFrame {
    private List<TV> list = new ArrayList();
    private DefaultTableModel model;
    private TVimpl ds = new TVimpl();
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;
    private String[] colums = new String[]{"PRODUCT ID","NAME","PRICE","TOTAL","OPERATINGSYSTEM","RESOLUTION","TRADEMARK"};
    /**
     * Creates new form ProductFrame
     */
    public ProductFrame() {
        initComponents();
        setLocationRelativeTo(null);
        initData();
        inittable();
    }
    
    private void initData(){
//        list.add(new TV("01","Smart Tivi Samsung 4K",42000000, 5,"Androi","1680 * 720","Sam Sung"));
//        list.add(new TV("02","Smart Tivi Sony 4K",45000000, 10,"Linux","1880 * 1220","Sony"));
//        list.add(new TV("03","Smart Tivi LG 4K",40000000, 8,"IOS","1480 * 920","LG"));
        list =readFile();
    }
    
    private void inittable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colums);
        list.forEach(item->{
            model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getTv_operatingSystem(),item.getTv_resolution(),item.getTv_trademark()});
        });
        jtbTable.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTable = new javax.swing.JTable();
        JlabelPRODUCTID = new javax.swing.JLabel();
        JlabelNAME = new javax.swing.JLabel();
        JlabelPRICE = new javax.swing.JLabel();
        JlabelTOTAL = new javax.swing.JLabel();
        JlabelOPERATINGSYSTEM = new javax.swing.JLabel();
        JlabelRESOLUTION = new javax.swing.JLabel();
        JlabelTRADEMARK = new javax.swing.JLabel();
        txtPRODUCTID = new javax.swing.JTextField();
        txtNAME = new javax.swing.JTextField();
        txtPRICE = new javax.swing.JTextField();
        txtTOTAL = new javax.swing.JTextField();
        txtOPERATINGSYSTEM = new javax.swing.JTextField();
        txtRESOLUTION = new javax.swing.JTextField();
        txtTRADEMARK = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JButtonADD = new javax.swing.JButton();
        jButtonEDIT = new javax.swing.JButton();
        jButtonDELETE = new javax.swing.JButton();
        jButtonSORT = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonSortName = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonSEARCH = new javax.swing.JButton();
        jButtonUPDATE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTable);

        JlabelPRODUCTID.setText("ID");

        JlabelNAME.setText("NAME");

        JlabelPRICE.setText("PRICE");

        JlabelTOTAL.setText("TOTAL");

        JlabelOPERATINGSYSTEM.setText("OPERATING SYSTEM");

        JlabelRESOLUTION.setText("RESOLUTION");

        JlabelTRADEMARK.setText("TRADEMARK");

        txtPRODUCTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPRODUCTIDActionPerformed(evt);
            }
        });

        JButtonADD.setBackground(new java.awt.Color(255, 255, 204));
        JButtonADD.setText("ADD");
        JButtonADD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonADD.setFocusPainted(false);
        JButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonADDActionPerformed(evt);
            }
        });

        jButtonEDIT.setBackground(new java.awt.Color(255, 255, 204));
        jButtonEDIT.setForeground(new java.awt.Color(51, 0, 51));
        jButtonEDIT.setText("EDIT");
        jButtonEDIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDITActionPerformed(evt);
            }
        });

        jButtonDELETE.setBackground(new java.awt.Color(255, 255, 204));
        jButtonDELETE.setText("DELETE");
        jButtonDELETE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELETEActionPerformed(evt);
            }
        });

        jButtonSORT.setBackground(new java.awt.Color(255, 255, 204));
        jButtonSORT.setText("SORTBYPRICE");
        jButtonSORT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSORTActionPerformed(evt);
            }
        });

        jButtonNew.setBackground(new java.awt.Color(255, 255, 204));
        jButtonNew.setText("NEW");
        jButtonNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonSortName.setBackground(new java.awt.Color(255, 255, 204));
        jButtonSortName.setText("SORTNAME");
        jButtonSortName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSortName.setFocusPainted(false);
        jButtonSortName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortNameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setText("CSORT");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonSEARCH.setBackground(new java.awt.Color(255, 255, 204));
        jButtonSEARCH.setText("SEARCH");
        jButtonSEARCH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSEARCH.setFocusPainted(false);
        jButtonSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSEARCHActionPerformed(evt);
            }
        });

        jButtonUPDATE.setText("UPDATE");
        jButtonUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUPDATEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jSeparator1))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JlabelPRODUCTID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPRODUCTID, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JlabelNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(101, 101, 101)
                                .addComponent(JlabelOPERATINGSYSTEM)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOPERATINGSYSTEM, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txtRESOLUTION)
                                    .addComponent(txtTRADEMARK)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JlabelPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JlabelTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPRICE, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(txtTOTAL))
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JlabelTRADEMARK)
                                    .addComponent(JlabelRESOLUTION, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonDELETE)
                                    .addComponent(JButtonADD, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSORT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSortName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jButtonUPDATE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelPRODUCTID)
                    .addComponent(JlabelOPERATINGSYSTEM)
                    .addComponent(txtPRODUCTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOPERATINGSYSTEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelNAME)
                    .addComponent(JlabelRESOLUTION)
                    .addComponent(txtRESOLUTION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelPRICE)
                    .addComponent(JlabelTRADEMARK)
                    .addComponent(txtTRADEMARK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelTOTAL))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonADD)
                    .addComponent(jButtonEDIT)
                    .addComponent(jButtonSEARCH)
                    .addComponent(jButtonSortName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDELETE)
                    .addComponent(jButtonNew)
                    .addComponent(jButton1)
                    .addComponent(jButtonSORT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUPDATE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPRODUCTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPRODUCTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPRODUCTIDActionPerformed
    
    private void JButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonADDActionPerformed
        try {
            StringBuilder error = new StringBuilder();
            if(txtPRODUCTID.getText().equals("")){
                error.append("ProductID has not been entered");
            }
            if(txtNAME.getText().equals("")){
                error.append("\nName has not been entered");
            }
            if(txtPRICE.getText().equals("")){
                error.append("\nPrice has not been entered");
            }
            if(txtTOTAL.getText().equals("")){
                error.append("\nTotal has not been entered");
            }
            if(txtOPERATINGSYSTEM.getText().equals("")){
                error.append("\nOperatingSystem has not been entered");
            }
            if(txtRESOLUTION.getText().equals("")){
                error.append("\nResolution has not been entered");
            }
            if(txtTRADEMARK.getText().equals("")){
                error.append("\nTrademark has not been entered");
            }
            if(!error.isEmpty()){
                JOptionPane.showMessageDialog(this, error.toString());
                return;
            }
            TV tv = new TV();
            tv.setProduct_ID(txtPRODUCTID.getText());
            tv.setProduct_name(txtNAME.getText());
            tv.setProduct_price(Integer.parseInt(txtPRICE.getText()));
            tv.setProduct_total(Integer.parseInt(txtTOTAL.getText()));
            tv.setTv_operatingSystem(txtOPERATINGSYSTEM.getText());
            tv.setTv_resolution(txtRESOLUTION.getText());
            tv.setTv_trademark(txtTRADEMARK.getText());
            boolean isExisted = false;
            for(int i=0;i<list.size();i++){
                TV t = list.get(i);
                if(t.getProduct_ID().equals(tv.getProduct_ID())){
                    JOptionPane.showMessageDialog(this, "ID is existed");
                    isExisted = true;
                    break;
                }
            }
            if(!isExisted){
                list.add(tv);
                UpdateTable(list);
                JOptionPane.showMessageDialog(this,"Object add success");
                writeFile();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error" + e.getMessage());
        }
    }//GEN-LAST:event_JButtonADDActionPerformed

    private void jButtonEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITActionPerformed
        try {
            if(txtPRODUCTID.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please click product need to fix");
                return;
            }
            if(JOptionPane.showConfirmDialog(this,"Do you want to fix product:" + txtPRODUCTID.getText(),"Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
                return;
            }
            boolean isInsert = false;
            for(int i=0;i<list.size();i++){
                TV item = list.get(i);
                if(item.getProduct_ID().equals(txtPRODUCTID.getText())){
                    item.setProduct_name(txtNAME.getText());
                    item.setProduct_price(Integer.parseInt(txtPRICE.getText()));
                    item.setProduct_total(Integer.parseInt(txtTOTAL.getText()));
                    item.setTv_operatingSystem(txtOPERATINGSYSTEM.getText());
                    item.setTv_resolution(txtRESOLUTION.getText());
                    item.setTv_trademark(txtTRADEMARK.getText());
                    isInsert = true;
                }
            }
            if(isInsert){
                JOptionPane.showMessageDialog(this, "Product is insert");
                model.setRowCount(0);
                UpdateTable(list);
                writeFile();
                jButtonNewActionPerformed(evt);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonEDITActionPerformed

    private void jButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELETEActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELETE().setVisible(true);
            }
        });
        UpdateTable(list);
    }//GEN-LAST:event_jButtonDELETEActionPerformed

    private void jButtonSORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSORTActionPerformed
        Collections.sort(list,new SortedTV());
        UpdateTable(list);
    }//GEN-LAST:event_jButtonSORTActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        txtNAME.setText("");
        txtPRODUCTID.setText("");
        txtPRICE.setText("");
        txtTOTAL.setText("");
        txtOPERATINGSYSTEM.setText("");
        txtRESOLUTION.setText("");
        txtTRADEMARK.setText("");
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jtbTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTableMousePressed
        int selectedRow = jtbTable.getSelectedRow();
        if(selectedRow >= 0){
            TV tv = list.get(selectedRow);
            txtPRODUCTID.setText(tv.getProduct_ID());
            txtNAME.setText(tv.getProduct_name());
            txtPRICE.setText(""+tv.getProduct_price());
            txtTOTAL.setText(""+tv.getProduct_total());
            txtOPERATINGSYSTEM.setText(tv.getTv_operatingSystem());
            txtRESOLUTION.setText(tv.getTv_resolution());
            txtTRADEMARK.setText(tv.getTv_trademark());
        }       
    }//GEN-LAST:event_jtbTableMousePressed

    private void jButtonSortNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortNameActionPerformed
        list.sort((o1, o2) -> CharSequence.compare(o1.getProduct_name(),o2.getProduct_name()));
        UpdateTable(list);
    }//GEN-LAST:event_jButtonSortNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<TV> ds = new ArrayList<>();
        ds = readFile();
        model.setRowCount(0);
        ds.forEach(item ->{
            model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getTv_operatingSystem(),item.getTv_resolution(),item.getTv_trademark()});
        });
        model.fireTableDataChanged();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void UpdateTable(List<TV> list){
        model.setRowCount(0);
        list.forEach(item ->{
                    model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getTv_operatingSystem(),item.getTv_resolution(),item.getTv_trademark()});
        });
        model.fireTableDataChanged();
    }
    private void jButtonSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSEARCHActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEARCH().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButtonSEARCHActionPerformed

    private void jButtonUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUPDATEActionPerformed
        List<TV> ds = new ArrayList<>();
        ds = readFile();
        model.setRowCount(0);
        ds.forEach(item ->{
            model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getTv_operatingSystem(),item.getTv_resolution(),item.getTv_trademark()});
        });
        model.fireTableDataChanged();        
    }//GEN-LAST:event_jButtonUPDATEActionPerformed
    class SortedTV implements Comparator<TV>{

	@Override
	public int compare(TV o1, TV o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getProduct_price() - o2.getProduct_price());
	}	
    }
    
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
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }
        public void writeFile(){
            try {
                fw = new FileWriter("src\\PRODUCTMANAGER\\Product.bin");
                bw = new BufferedWriter(fw);
                for(TV temp: list){
                    bw.write(temp.toString());
                    bw.newLine();
                }
                System.out.println("Success");
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        public List<TV> readFile(){
            List<TV> ds = new ArrayList<>();
            try {
                fr = new FileReader("src\\PRODUCTMANAGER\\Product.bin");
                br = new BufferedReader(fr);
                String line = " ";
                while(true){
                    line = br.readLine();
                    if(line == null){
                        break;
                    }
                    String[] txt = line.split("--");
                    String ID = txt[0];
                    String name = txt[1];
                    int price = Integer.parseInt(txt[2]);
                    int total = Integer.parseInt(txt[3]);
                    String os = txt[4];
                    String rso = txt[5];
                    String tm = txt[6];
                    ds.add(new TV(ID, name , price, total, os, rso, tm));
                }
                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ds;
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonADD;
    private javax.swing.JLabel JlabelNAME;
    private javax.swing.JLabel JlabelOPERATINGSYSTEM;
    private javax.swing.JLabel JlabelPRICE;
    private javax.swing.JLabel JlabelPRODUCTID;
    private javax.swing.JLabel JlabelRESOLUTION;
    private javax.swing.JLabel JlabelTOTAL;
    private javax.swing.JLabel JlabelTRADEMARK;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDELETE;
    private javax.swing.JButton jButtonEDIT;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSEARCH;
    private javax.swing.JButton jButtonSORT;
    private javax.swing.JButton jButtonSortName;
    private javax.swing.JButton jButtonUPDATE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jtbTable;
    private javax.swing.JTextField txtNAME;
    private javax.swing.JTextField txtOPERATINGSYSTEM;
    private javax.swing.JTextField txtPRICE;
    private javax.swing.JTextField txtPRODUCTID;
    private javax.swing.JTextField txtRESOLUTION;
    private javax.swing.JTextField txtTOTAL;
    private javax.swing.JTextField txtTRADEMARK;
    // End of variables declaration//GEN-END:variables

//    private static class RunnableImpl implements Runnable {
//
//        public RunnableImpl() {
//        }
//
//        public void run() {
//            new SEARCH().setVisible(true);
//        }
//    }

}
