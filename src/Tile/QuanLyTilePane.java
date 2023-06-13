/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Tile;
import PRODUCTMANAGER.Tile;
import PRODUCTMANAGER.TV;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QuanLyTilePane extends javax.swing.JPanel {
    List<Tile> list;
    DefaultTableModel model;
    String[] colums = new String[]{"ID","NAME","PRICE","TOTAL","TYPE","SIZE","COLOR"};
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;
    /**
     * Creates new form QuanLyTilePane
     */
    public QuanLyTilePane() {
        initComponents();
        initData();
        inittable();
    }
    
    void initData(){
        list = readFile();
//        Tile t1 = new Tile("TL01","A",150000,10,"A",15,10,"Red");
//        Tile t2 = new Tile("TL02","B",250000,12,"B",12,10,"Blue");
//        list.add(t1);
//        list.add(t2);
//        writeFile();
    }
    
    private void inittable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colums);
        list.forEach(item->{
            model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getTile_type(),item.getTile_w() + "*"+ item.getTile_h(),item.getTile_color()});
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

        jPanel1 = new javax.swing.JPanel();
        jButtonEDIT = new javax.swing.JButton();
        jButtonDELETE = new javax.swing.JButton();
        jButtonSortByName = new javax.swing.JButton();
        jButtonSortByPrice = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonCanSort = new javax.swing.JButton();
        jButtonADD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPRODUCTID = new javax.swing.JTextField();
        jTextFieldNAME = new javax.swing.JTextField();
        jTextFieldPRICE = new javax.swing.JTextField();
        jTextFieldTOTAL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTYPE = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButtonNEW = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTable = new javax.swing.JTable();
        jComboBoxColor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldWidth = new javax.swing.JTextField();
        jTextFieldHeight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonSEARCH = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonCSEARCH = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonEDIT.setBackground(new java.awt.Color(255, 153, 255));
        jButtonEDIT.setText("SỬA");
        jButtonEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDITActionPerformed(evt);
            }
        });

        jButtonDELETE.setBackground(new java.awt.Color(255, 153, 255));
        jButtonDELETE.setText("XÓA");
        jButtonDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELETEActionPerformed(evt);
            }
        });

        jButtonSortByName.setBackground(new java.awt.Color(255, 153, 255));
        jButtonSortByName.setText("SẮP XẾP THEO TÊN");
        jButtonSortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortByNameActionPerformed(evt);
            }
        });

        jButtonSortByPrice.setBackground(new java.awt.Color(255, 153, 255));
        jButtonSortByPrice.setText("SẮP XẾP THEO GIÁ");
        jButtonSortByPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortByPriceActionPerformed(evt);
            }
        });

        jButtonCanSort.setBackground(new java.awt.Color(255, 153, 255));
        jButtonCanSort.setText("HỦY SẮP XẾP");
        jButtonCanSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanSortActionPerformed(evt);
            }
        });

        jButtonADD.setBackground(new java.awt.Color(255, 153, 255));
        jButtonADD.setText("THÊM");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonADD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSortByPrice)
                            .addComponent(jButtonSortByName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButtonCanSort)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButtonADD)
                .addGap(27, 27, 27)
                .addComponent(jButtonEDIT)
                .addGap(18, 18, 18)
                .addComponent(jButtonDELETE)
                .addGap(76, 76, 76)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButtonSortByName)
                .addGap(18, 18, 18)
                .addComponent(jButtonSortByPrice)
                .addGap(18, 18, 18)
                .addComponent(jButtonCanSort)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Price");

        jLabel4.setText("Total");

        jLabel5.setText("Type");

        jComboBoxTYPE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H" }));

        jLabel6.setText("Color");

        jButtonNEW.setBackground(new java.awt.Color(0, 255, 51));
        jButtonNEW.setText("MỚI");
        jButtonNEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNEWActionPerformed(evt);
            }
        });

        jtbTable.setBackground(new java.awt.Color(187, 238, 237));
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

        jComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Blue", "Yellow", "Orange", "Green", "Pink", "Black" }));

        jLabel7.setText("Size");

        jLabel8.setText("*");

        jButtonSEARCH.setBackground(new java.awt.Color(102, 255, 102));
        jButtonSEARCH.setText("TÌM KIẾM");
        jButtonSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSEARCHActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setText("Nhập tên sản phẩm muốn tìm kiếm");

        jButtonCSEARCH.setBackground(new java.awt.Color(102, 255, 102));
        jButtonCSEARCH.setText("HỦY TÌM KIẾM");
        jButtonCSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCSEARCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPRODUCTID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(21, 21, 21)
                                                .addComponent(jComboBoxTYPE, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(24, 24, 24)
                                                .addComponent(jTextFieldWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonNEW)
                                        .addGap(35, 35, 35))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jButtonSEARCH)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCSEARCH)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSEARCH)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCSEARCH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPRODUCTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTYPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNEW))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        try{
            if(jTextFieldPRODUCTID.getText().equals("") || jTextFieldNAME.getText().equals("") || jTextFieldPRICE.getText().equals("") || jTextFieldTOTAL.getText().equals("") || jTextFieldWidth.getText().equals("") || jTextFieldHeight.getText().equals("")){
               JOptionPane.showConfirmDialog(this, "Vui long nhap day du thong tin","Thong bao",JOptionPane.OK_CANCEL_OPTION);
            }
            Tile t = new Tile();
            t.setProduct_ID(jTextFieldPRODUCTID.getText());
            t.setProduct_name(jTextFieldNAME.getText());
            t.setProduct_price(Integer.parseInt(jTextFieldPRICE.getText()));
            t.setProduct_total(Integer.parseInt(jTextFieldTOTAL.getText()));
            t.setTile_type(jComboBoxTYPE.getSelectedItem().toString());
            t.setTile_w(Float.parseFloat(jTextFieldWidth.getText()));
            t.setTile_w(Float.parseFloat(jTextFieldHeight.getText()));
            t.setTile_color(jComboBoxColor.getItemAt(jComboBoxColor.getSelectedIndex()));
            boolean isExisted = false;
            for(int i=0;i<list.size();i++){
                Tile tl = list.get(i);
                if(tl.getProduct_ID().equals(t.getProduct_ID())){
                    JOptionPane.showMessageDialog(this, "ID is existed");
                    isExisted = true;
                    break;
                }
            }
            if(!isExisted){
                list.add(t);
                UpdateTable(list);
                JOptionPane.showMessageDialog(this,"Object add success");
                writeFile();
            }
               
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonNEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNEWActionPerformed
        jTextFieldPRODUCTID.setText("");
        jTextFieldNAME.setText("");
        jTextFieldPRICE.setText("");
        jTextFieldTOTAL.setText("");
        jComboBoxTYPE.setSelectedIndex(0);
        jTextFieldWidth.setText("");
        jTextFieldHeight.setText("");
        jComboBoxColor.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonNEWActionPerformed

    private void jtbTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTableMousePressed
        int selectedRow = jtbTable.getSelectedRow();
        if(selectedRow >= 0){
            Tile t = list.get(selectedRow);
            jTextFieldPRODUCTID.setText(t.getProduct_ID());
            jTextFieldNAME.setText(t.getProduct_name());
            jTextFieldPRICE.setText(""+t.getProduct_price());
            jTextFieldTOTAL.setText(""+ t.getProduct_total());
            jComboBoxTYPE.setSelectedItem(t.getTile_type());
            jTextFieldWidth.setText(""+t.getTile_w());
            jTextFieldHeight.setText(""+t.getTile_h());
            jComboBoxColor.setSelectedItem(t.getTile_color());
        } 
    }//GEN-LAST:event_jtbTableMousePressed

    private void jButtonEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITActionPerformed
        try {
            if(jTextFieldPRODUCTID.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please click product need to fix");
                return;
            }
            if(JOptionPane.showConfirmDialog(this,"Do you want to fix product:" + jTextFieldPRODUCTID.getText(),"Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
                return;
            }
            boolean isInsert = false;
            for(int i=0;i<list.size();i++){
                Tile item = list.get(i);
                if(item.getProduct_ID().equals(jTextFieldPRODUCTID.getText())){
                    item.setProduct_name(jTextFieldNAME.getText());
                    item.setProduct_price(Integer.parseInt(jTextFieldPRICE.getText()));
                    item.setProduct_total(Integer.parseInt(jTextFieldTOTAL.getText()));
                    item.setTile_type(jComboBoxTYPE.getItemAt(jComboBoxTYPE.getSelectedIndex()));
                    item.setTile_w(Float.parseFloat(jTextFieldWidth.getText()));
                    item.setTile_h(Float.parseFloat(jTextFieldHeight.getText()));
                    item.setTile_color(jComboBoxColor.getItemAt(jComboBoxColor.getSelectedIndex()));
                    isInsert = true;
                }
            }
            if(isInsert){
                JOptionPane.showMessageDialog(this, "Product is insert");
                model.setRowCount(0);
                UpdateTable(list);
                writeFile();
                jButtonNEWActionPerformed(evt);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonEDITActionPerformed

    private void jButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELETEActionPerformed
        try {
            if(jTextFieldPRODUCTID.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please click product need to delete");
                return;
            }
            if(JOptionPane.showConfirmDialog(this,"Do you want to delete product:" + jTextFieldPRODUCTID.getText(),"Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
                return;
            }
            boolean isDeleted = false;
            for(int i=0;i<list.size();i++){
                Tile item = list.get(i);
                if(item.getProduct_ID().equals(jTextFieldPRODUCTID.getText())){
                    list.remove(i);
                    isDeleted = true;
                    break;
                }
            }
            if(isDeleted){
                JOptionPane.showMessageDialog(this, "Product is deleted");
                model.setRowCount(0);
                UpdateTable(list);
                writeFile();
                jButtonNEWActionPerformed(evt);
            }else{
                JOptionPane.showMessageDialog(this, "Product not found");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonDELETEActionPerformed

    private void jButtonSortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortByNameActionPerformed
        list.sort((o1, o2) -> CharSequence.compare(o1.getProduct_name(),o2.getProduct_name()));
        UpdateTable(list);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSortByNameActionPerformed

    private void jButtonSortByPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortByPriceActionPerformed
        list.sort((o1,o2) -> Long.compare(o1.getProduct_price(), o2.getProduct_price()));
        UpdateTable(list);
    }//GEN-LAST:event_jButtonSortByPriceActionPerformed

    private void jButtonCanSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanSortActionPerformed
        List<Tile> ds = new ArrayList<>();
        ds = readFile();
        model.setRowCount(0);
        ds.forEach(item ->{
            model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getTile_type(),item.getTile_w() + "*"+ item.getTile_h(),item.getTile_color()});
        });
        model.fireTableDataChanged();       
    }//GEN-LAST:event_jButtonCanSortActionPerformed

    private void jButtonSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSEARCHActionPerformed
        List<Tile> searchList = new ArrayList<>();
        if(jTextFieldSearch.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Input Name need to search:");
            return;
        }
        for(int i=0;i<list.size();i++){
            Tile temp = list.get(i);
            if(jTextFieldSearch.getText().equals(temp.getProduct_name())){
                searchList.add(temp);
            }
        }
        if(searchList.isEmpty()){
            JOptionPane.showMessageDialog(this, "Not Existed");
            return;
        }
        UpdateTable(searchList);
    }//GEN-LAST:event_jButtonSEARCHActionPerformed

    private void jButtonCSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCSEARCHActionPerformed
        UpdateTable(list);
        jTextFieldSearch.setText("");
    }//GEN-LAST:event_jButtonCSEARCHActionPerformed
    public void writeFile(){
        try {
            fw = new FileWriter("src\\Tile\\Tile.bin");
            bw = new BufferedWriter(fw);
            for(Tile temp: list){
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

    public List<Tile> readFile(){
            List<Tile> ds = new ArrayList<>();
            try {
                fr = new FileReader("src\\Tile\\Tile.bin");
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
                    String type = txt[4];
                    float w = Float.parseFloat(txt[5]);
                    float h = Float.parseFloat(txt[6]);
                    String color = txt[7]; 
                    ds.add(new Tile(ID, name , price, total, type, w, h,color));
                }
                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ds;
        }
    private void UpdateTable(List<Tile> list){
        model.setRowCount(0);
        list.forEach(item ->{
                    model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getTile_type(),item.getTile_w() + "*"+ item.getTile_h(),item.getTile_color()});
        });
        model.fireTableDataChanged();
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonCSEARCH;
    private javax.swing.JButton jButtonCanSort;
    private javax.swing.JButton jButtonDELETE;
    private javax.swing.JButton jButtonEDIT;
    private javax.swing.JButton jButtonNEW;
    private javax.swing.JButton jButtonSEARCH;
    private javax.swing.JButton jButtonSortByName;
    private javax.swing.JButton jButtonSortByPrice;
    private javax.swing.JComboBox<String> jComboBoxColor;
    private javax.swing.JComboBox<String> jComboBoxTYPE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldHeight;
    private javax.swing.JTextField jTextFieldNAME;
    private javax.swing.JTextField jTextFieldPRICE;
    private javax.swing.JTextField jTextFieldPRODUCTID;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldTOTAL;
    private javax.swing.JTextField jTextFieldWidth;
    private javax.swing.JTable jtbTable;
    // End of variables declaration//GEN-END:variables
}
