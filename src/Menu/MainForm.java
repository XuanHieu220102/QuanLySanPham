/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import DangNhap.DangNhap;
import Tile.QuanLyTilePane;
import Tivi.QuanLyTiviPanel;
import INTERIORMANAGER.QuanLyInteriorPane;
import PRODUCTMANAGER.Interior;
import PRODUCTMANAGER.TV;
import PRODUCTMANAGER.Tile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import THONGKE.ThongKePanel;

/**
 *
 * @author ASUS
 */
public class MainForm extends javax.swing.JFrame {

    private QuanLyTiviPanel qQuanlyTivi;
    private QuanLyTilePane qQuanLyTile;
    private QuanLyInteriorPane qQuanLyInterior;
    private ThongKePanel qThongKePane;
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;
    List<TV> listtv;
    List<Interior> listinterior;
    List<Tile> listtile;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButtonQLTiVi = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButtonTile = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jButtonThongKe = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jButtonLogOut = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHeThong = new javax.swing.JMenu();
        jMenuItemDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemThoat = new javax.swing.JMenuItem();
        jMenuQLSP = new javax.swing.JMenu();
        jMenuItemTivi = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemInterior = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemTile = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuTroGiup = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);
        jToolBar1.add(jSeparator11);
        jToolBar1.add(jSeparator6);

        jButtonQLTiVi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonQLTiVi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-tv-show-20.png"))); // NOI18N
        jButtonQLTiVi.setText("Quản lý TiVi");
        jButtonQLTiVi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonQLTiVi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonQLTiVi.setFocusable(false);
        jButtonQLTiVi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonQLTiVi.setMaximumSize(new java.awt.Dimension(120, 40));
        jButtonQLTiVi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonQLTiVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLTiViActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonQLTiVi);

        jSeparator7.setFocusCycleRoot(true);
        jToolBar1.add(jSeparator7);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-hangar-20.png"))); // NOI18N
        jButton3.setText("Quản lý Interior");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(120, 40));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator8);

        jButtonTile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonTile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-tile-20.png"))); // NOI18N
        jButtonTile.setText("Quản lý Tile");
        jButtonTile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonTile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTile.setFocusable(false);
        jButtonTile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTile.setMargin(new java.awt.Insets(20, 14, 20, 14));
        jButtonTile.setMaximumSize(new java.awt.Dimension(120, 40));
        jButtonTile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTileActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonTile);
        jToolBar1.add(jSeparator10);

        jButtonThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-select-all-20.png"))); // NOI18N
        jButtonThongKe.setText("    Thống Kê   ");
        jButtonThongKe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonThongKe.setFocusable(false);
        jButtonThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonThongKe.setMargin(new java.awt.Insets(20, 40, 20, 40));
        jButtonThongKe.setMaximumSize(new java.awt.Dimension(120, 40));
        jButtonThongKe.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongKeActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonThongKe);
        jToolBar1.add(jSeparator12);

        jButtonLogOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/icons8-log-out-20.png"))); // NOI18N
        jButtonLogOut.setText("Đăng Xuất");
        jButtonLogOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogOut.setFocusable(false);
        jButtonLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLogOut.setMargin(new java.awt.Insets(3, 14, 3, 14));
        jButtonLogOut.setMaximumSize(new java.awt.Dimension(120, 40));
        jButtonLogOut.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonLogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonLogOut);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/75e8953d9cb645e81ca7.jpg"))); // NOI18N
        tplMainBoard.addTab("Home", jLabel1);

        jMenuHeThong.setText("Hệ Thống");

        jMenuItemDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemDangXuat.setText("Đăng xuất");
        jMenuItemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDangXuatActionPerformed(evt);
            }
        });
        jMenuHeThong.add(jMenuItemDangXuat);
        jMenuHeThong.add(jSeparator1);

        jMenuItemThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemThoat.setText("Thoát");
        jMenuItemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThoatActionPerformed(evt);
            }
        });
        jMenuHeThong.add(jMenuItemThoat);

        jMenuBar1.add(jMenuHeThong);

        jMenuQLSP.setText("Quản Lý Sản Phẩm");
        jMenuQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuQLSPActionPerformed(evt);
            }
        });

        jMenuItemTivi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemTivi.setText("Quản lý Tivi");
        jMenuItemTivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTiviActionPerformed(evt);
            }
        });
        jMenuQLSP.add(jMenuItemTivi);
        jMenuQLSP.add(jSeparator2);

        jMenuItemInterior.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemInterior.setText("Quản lý Iterator");
        jMenuItemInterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInteriorActionPerformed(evt);
            }
        });
        jMenuQLSP.add(jMenuItemInterior);
        jMenuQLSP.add(jSeparator4);

        jMenuItemTile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemTile.setText("Quản lý Tile");
        jMenuItemTile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTileActionPerformed(evt);
            }
        });
        jMenuQLSP.add(jMenuItemTile);
        jMenuQLSP.add(jSeparator5);

        jMenuBar1.add(jMenuQLSP);

        jMenuTroGiup.setText("Trợ Giúp");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Nội dung");
        jMenuTroGiup.add(jMenuItem5);
        jMenuTroGiup.add(jSeparator3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Giới thiệu");
        jMenuTroGiup.add(jMenuItem6);
        jMenuTroGiup.add(jSeparator9);

        jMenuBar1.add(jMenuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tplMainBoard)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplMainBoard))
        );

        tplMainBoard.getAccessibleContext().setAccessibleName("Home");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemThoatActionPerformed

    private void jButtonQLTiViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLTiViActionPerformed
        jMenuItemTiviActionPerformed(evt);
    }//GEN-LAST:event_jButtonQLTiViActionPerformed

    private void jMenuQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuQLSPActionPerformed


    }//GEN-LAST:event_jMenuQLSPActionPerformed

    private void jMenuItemTiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTiviActionPerformed
        if (qQuanlyTivi == null) {
            qQuanlyTivi = new QuanLyTiviPanel();
//            ImageIcon icon = new ImageIcon(getClass().getResource("ICON/tv"));
//            tplMainBoard.addTab("Quan ly Tivi",icon, qQuanlyTivi,"Quan Ly Tivi");
            tplMainBoard.addTab("Quản lý Tivi", qQuanlyTivi);
        }
        tplMainBoard.setSelectedComponent(qQuanlyTivi);
    }//GEN-LAST:event_jMenuItemTiviActionPerformed

    private void jMenuItemTileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTileActionPerformed
        if (qQuanLyTile == null) {
            qQuanLyTile = new QuanLyTilePane();
            tplMainBoard.addTab("Quản lý Tile", qQuanLyTile);
        }
        tplMainBoard.setSelectedComponent(qQuanLyTile);
    }//GEN-LAST:event_jMenuItemTileActionPerformed

    private void jButtonTileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTileActionPerformed
        jMenuItemTileActionPerformed(evt);
    }//GEN-LAST:event_jButtonTileActionPerformed

    private void jMenuItemInteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInteriorActionPerformed
        if (qQuanLyInterior == null) {
            qQuanLyInterior = new QuanLyInteriorPane();
            tplMainBoard.addTab("Quản lý Interior", qQuanLyInterior);
        }
        tplMainBoard.setSelectedComponent(qQuanLyInterior);
    }//GEN-LAST:event_jMenuItemInteriorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jMenuItemInteriorActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jMenuItemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDangXuatActionPerformed
        jButtonLogOutActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemDangXuatActionPerformed

    private void jButtonThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongKeActionPerformed
        listtv = readFileTivi();
        listinterior = readFileInterior();
        listtile = readFileTile();
        List<TV> listTV = new ArrayList<>();
        List<Interior> listIn = new ArrayList<>();
        List<Tile> listTl = new ArrayList<>();
        for (TV temp : listtv) {
            if (temp.getProduct_total() <= 5) {
                listTV.add(temp);
            }
        }
        for (Interior temp : listinterior) {
            if (temp.getProduct_total() <= 5) {
                listIn.add(temp);
            }
        }
        for (Tile temp : listtile) {
            if (temp.getProduct_total() <= 5) {
                listTl.add(temp);
            }
        }
        writeFile(listTV, listIn, listTl);
        if (qThongKePane == null) {
            qThongKePane = new ThongKePanel();
            tplMainBoard.addTab("Thống kê sản phẩm", qThongKePane);
        }
        tplMainBoard.setSelectedComponent(qThongKePane);
    }//GEN-LAST:event_jButtonThongKeActionPerformed
    public List<Interior> readFileInterior() {
        List<Interior> ds = new ArrayList<>();
        try {
            fr = new FileReader("src\\INTERIORMANAGER\\Interior.bin");
            br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
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
                ds.add(new Interior(ID, name, price, total, material, w, color));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public List<TV> readFileTivi() {
        List<TV> ds = new ArrayList<>();
        try {
            fr = new FileReader("src\\Tivi\\Product.bin");
            br = new BufferedReader(fr);
            String line = " ";
            while (true) {
                line = br.readLine();
                if (line == null) {
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
                ds.add(new TV(ID, name, price, total, os, rso, tm));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public List<Tile> readFileTile() {
        List<Tile> ds = new ArrayList<>();
        try {
            fr = new FileReader("src\\Tile\\Tile.bin");
            br = new BufferedReader(fr);
            String line = " ";
            while (true) {
                line = br.readLine();
                if (line == null) {
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
                ds.add(new Tile(ID, name, price, total, type, w, h, color));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }

    public void writeFile(List<TV> listTV, List<Interior> listInteror, List<Tile> listTile) {
        try {
            fw = new FileWriter("src\\THONGKE\\report.bin");
            bw = new BufferedWriter(fw);
            for (TV temp : listTV) {
                bw.write(temp.toString());
                bw.newLine();
            }
            for (Interior temp : listInteror) {
                bw.write(temp.toString());
                bw.newLine();
            }
            for (Tile temp : listTile) {
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonQLTiVi;
    private javax.swing.JButton jButtonThongKe;
    private javax.swing.JButton jButtonTile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHeThong;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemDangXuat;
    private javax.swing.JMenuItem jMenuItemInterior;
    private javax.swing.JMenuItem jMenuItemThoat;
    private javax.swing.JMenuItem jMenuItemTile;
    private javax.swing.JMenuItem jMenuItemTivi;
    private javax.swing.JMenu jMenuQLSP;
    private javax.swing.JMenu jMenuTroGiup;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
