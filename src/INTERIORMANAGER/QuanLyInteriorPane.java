/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package INTERIORMANAGER;
import PRODUCTMANAGER.Interior;
import PRODUCTMANAGER.TV;
import PRODUCTMANAGER.TVimpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;
/**
 *
 * @author ASUS
 */
public class QuanLyInteriorPane extends javax.swing.JPanel {
    private List<Interior> list = new ArrayList();
    private DefaultTableModel model;
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;
    private String[] colums = new String[]{"PRODUCT ID","NAME","PRICE","TOTAL","MATERIAL","WEIGHT","COLOR"};
    
    /**
     * Creates new form ProductFrame
     */
    
    private void initData(){
        list =readFile();
    }
    
    private void inittable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colums);
        list.forEach(item->{
            model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getInterior_Material(),item.getInterior_Weight(),item.getInterior_Color()});
        });
        jtbTable.setModel(model);
    }
    /**
     * Creates new form QuanLyTiviPanel
     */
    /**
     * Creates new form QuanLyInteriorPane
     */
    public QuanLyInteriorPane() {
        initComponents();
        initData();
        inittable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtTOTAL = new javax.swing.JTextField();
        txtMaterial = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbTable = new javax.swing.JTable();
        jButtonADD = new javax.swing.JButton();
        jButtonEDIT = new javax.swing.JButton();
        jButtonDEL = new javax.swing.JButton();
        jButtonNEW = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonSEARCH = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonSORTBYNAME = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButtonSORTBYGIA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonCanelSort = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPRODUCTID = new javax.swing.JTextField();
        txtNAME = new javax.swing.JTextField();
        txtPRICE = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setText("Quản lý Interior");

        txtMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialActionPerformed(evt);
            }
        });

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        jtbTable.setBackground(new java.awt.Color(173, 241, 228));
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
        jScrollPane2.setViewportView(jtbTable);

        jButtonADD.setBackground(new java.awt.Color(204, 255, 102));
        jButtonADD.setText("Thêm");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });

        jButtonEDIT.setBackground(new java.awt.Color(204, 255, 102));
        jButtonEDIT.setText("Sửa");
        jButtonEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDITActionPerformed(evt);
            }
        });

        jButtonDEL.setBackground(new java.awt.Color(204, 255, 102));
        jButtonDEL.setText("Xóa");
        jButtonDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELActionPerformed(evt);
            }
        });

        jButtonNEW.setBackground(new java.awt.Color(204, 255, 102));
        jButtonNEW.setText("Resert");
        jButtonNEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNEWActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jButtonSEARCH.setBackground(new java.awt.Color(153, 255, 255));
        jButtonSEARCH.setText("Tìm kiếm");
        jButtonSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSEARCHActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jButtonSORTBYNAME.setBackground(new java.awt.Color(153, 255, 255));
        jButtonSORTBYNAME.setText("Sắp xếp theo tên");
        jButtonSORTBYNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSORTBYNAMEActionPerformed(evt);
            }
        });

        jLabel4.setText("Price");

        jLabel5.setText("Total");

        jButtonSORTBYGIA.setBackground(new java.awt.Color(153, 255, 255));
        jButtonSORTBYGIA.setText("Sắp xếp theo giá");
        jButtonSORTBYGIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSORTBYGIAActionPerformed(evt);
            }
        });

        jLabel6.setText("Interior_Material");

        jButtonCanelSort.setBackground(new java.awt.Color(153, 255, 255));
        jButtonCanelSort.setText("Hủy sắp xếp");
        jButtonCanelSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanelSortActionPerformed(evt);
            }
        });

        jLabel7.setText("Interior_Weight");

        jLabel8.setText("Interior_Color");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButtonADD)
                        .addGap(75, 75, 75)
                        .addComponent(jButtonEDIT)
                        .addGap(77, 77, 77)
                        .addComponent(jButtonDEL)
                        .addGap(63, 63, 63)
                        .addComponent(jButtonNEW)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPRODUCTID, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtNAME)
                    .addComponent(txtPRICE)
                    .addComponent(txtTOTAL))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtWeight)
                    .addComponent(txtColor))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonSORTBYNAME)
                .addGap(38, 38, 38)
                .addComponent(jButtonSORTBYGIA)
                .addGap(35, 35, 35)
                .addComponent(jButtonCanelSort)
                .addGap(285, 285, 285)
                .addComponent(jButtonSEARCH)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPRODUCTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNEW)
                    .addComponent(jButtonDEL)
                    .addComponent(jButtonEDIT)
                    .addComponent(jButtonADD))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSEARCH)
                    .addComponent(jButtonSORTBYNAME)
                    .addComponent(jButtonSORTBYGIA)
                    .addComponent(jButtonCanelSort))
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterialActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void jtbTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTableMousePressed
        int selectedRow = jtbTable.getSelectedRow();
        if(selectedRow >= 0){
            Interior in = list.get(selectedRow);
            txtPRODUCTID.setText(in.getProduct_ID());
            txtNAME.setText(in.getProduct_name());
            txtPRICE.setText(""+in.getProduct_price());
            txtTOTAL.setText(""+in.getProduct_total());
            txtMaterial.setText(in.getInterior_Material());
            txtWeight.setText(""+in.getInterior_Weight());
            txtColor.setText(in.getInterior_Color());
        }
    }//GEN-LAST:event_jtbTableMousePressed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
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
            if(txtMaterial.getText().equals("")){
                error.append("\nOperatingSystem has not been entered");
            }
            if(txtWeight.getText().equals("")){
                error.append("\nResolution has not been entered");
            }
            if(txtColor.getText().equals("")){
                error.append("\nTrademark has not been entered");
            }
            if(!error.isEmpty()){
                JOptionPane.showMessageDialog(this,error.toString());
                return;
            }
            Interior in = new Interior();
            in.setProduct_ID(txtPRODUCTID.getText());
            in.setProduct_name(txtNAME.getText());
            in.setProduct_price(Integer.parseInt(txtPRICE.getText()));
            in.setProduct_total(Integer.parseInt(txtTOTAL.getText()));
            in.setInterior_Material(txtMaterial.getText());
            in.setInterior_Weight(Float.parseFloat(txtWeight.getText()));
            in.setInterior_Color(txtColor.getText());
            boolean isExisted = false;
            for(int i=0;i<list.size();i++){
                Interior t = list.get(i);
                if(t.getProduct_ID().equals(in.getProduct_ID())){
                    JOptionPane.showMessageDialog(this, "ID is existed");
                    isExisted = true;
                    break;
                }
            }
            if(!isExisted){
                list.add(in);
                UpdateTable(list);
                JOptionPane.showMessageDialog(this,"Object add success");
                writeFile();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonADDActionPerformed

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
                Interior item = list.get(i);
                if(item.getProduct_ID().equals(txtPRODUCTID.getText())){
                    item.setProduct_name(txtNAME.getText());
                    item.setProduct_price(Integer.parseInt(txtPRICE.getText()));
                    item.setProduct_total(Integer.parseInt(txtTOTAL.getText()));
                    item.setInterior_Material(txtMaterial.getText());
                    item.setInterior_Weight(Float.parseFloat(txtWeight.getText()));
                    item.setInterior_Color(txtColor.getText());
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

    private void jButtonDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELActionPerformed
        try {
            if(txtPRODUCTID.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please click product need to delete");
                return;
            }
            if(JOptionPane.showConfirmDialog(this,"Do you want to delete product:" + txtPRODUCTID.getText(),"Confirm",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
                return;
            }
            boolean isDeleted = false;
            for(int i=0;i<list.size();i++){
                Interior item = list.get(i);
                if(item.getProduct_ID().equals(txtPRODUCTID.getText())){
                    list.remove(i);
                    isDeleted = true;
                    break;
                }
            }
            if(isDeleted){
                JOptionPane.showMessageDialog(this, "Product is deleted");
                model.setRowCount(0);
                list.forEach(item ->{
                    model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getInterior_Material(),item.getInterior_Weight(),item.getInterior_Color()});
                });
                model.fireTableDataChanged();
                writeFile();
                jButtonNEWActionPerformed(evt);
            }else{
                JOptionPane.showMessageDialog(this, "Product not found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonDELActionPerformed

    private void jButtonNEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNEWActionPerformed
        txtNAME.setText("");
        txtPRODUCTID.setText("");
        txtPRICE.setText("");
        txtTOTAL.setText("");
        txtMaterial.setText("");
        txtWeight.setText("");
        txtColor.setText("");
    }//GEN-LAST:event_jButtonNEWActionPerformed

    private void jButtonSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSEARCHActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEARCHIN().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButtonSEARCHActionPerformed

    private void jButtonSORTBYNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSORTBYNAMEActionPerformed
        list.sort((o1, o2) -> CharSequence.compare(o1.getProduct_name(),o2.getProduct_name()));
        UpdateTable(list);
    }//GEN-LAST:event_jButtonSORTBYNAMEActionPerformed

    private void jButtonSORTBYGIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSORTBYGIAActionPerformed
        list.sort((o1,o2) -> Double.compare(o1.getProduct_price(), o2.getProduct_price()));
        UpdateTable(list);
    }//GEN-LAST:event_jButtonSORTBYGIAActionPerformed

    private void jButtonCanelSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanelSortActionPerformed
        List<Interior> ds = new ArrayList<>();
        ds = readFile();
        model.setRowCount(0);
        UpdateTable(ds);
    }//GEN-LAST:event_jButtonCanelSortActionPerformed
    
    private void UpdateTable(List<Interior> list){
        model.setRowCount(0);
        list.forEach(item ->{
                    model.addRow(new Object[]{item.getProduct_ID(),item.getProduct_name(),item.getProduct_price(),item.getProduct_total(),item.getInterior_Material(),item.getInterior_Weight(),item.getInterior_Color()});
        });
        model.fireTableDataChanged();
    }
    public void writeFile(){
            try {
                fw = new FileWriter("src\\INTERIORMANAGER\\Interior.bin");
                bw = new BufferedWriter(fw);
                for(Interior temp: list){
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
        
        public List<Interior> readFile(){
            List<Interior> ds = new ArrayList<>();
            try {
                fr = new FileReader("src\\INTERIORMANAGER\\Interior.bin");
                br = new BufferedReader(fr);
                String line = "";
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
                    String material = txt[4];
                    float w = Float.parseFloat(txt[5]);
                    String color = txt[6];
                    ds.add(new Interior(ID, name , price, total, material, w,color));
                }
                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ds;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonCanelSort;
    private javax.swing.JButton jButtonDEL;
    private javax.swing.JButton jButtonEDIT;
    private javax.swing.JButton jButtonNEW;
    private javax.swing.JButton jButtonSEARCH;
    private javax.swing.JButton jButtonSORTBYGIA;
    private javax.swing.JButton jButtonSORTBYNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jtbTable;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtNAME;
    private javax.swing.JTextField txtPRICE;
    private javax.swing.JTextField txtPRODUCTID;
    private javax.swing.JTextField txtTOTAL;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
