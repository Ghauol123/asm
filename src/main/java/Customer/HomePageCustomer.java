/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customer;

import View.admin.customer.Customer;
import View.admin.movie.Movie;
import java.beans.PropertyChangeEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class HomePageCustomer extends javax.swing.JFrame {
    /**
     * Creates new form HomePageCustomer
     */
    public HomePageCustomer() {
        initComponents();
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
        JTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtSearch1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name Movie", "Title", "Age limit", "Price"
            }
        ));
        JTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable1MouseClicked(evt);
            }
        });
        JTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(JTable1);

        jButton1.setText("Print Movie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search Movie:");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buy Movie");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Search Title");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch)
                    .addComponent(jButton3)
                    .addComponent(jTextField2)
                    .addComponent(jButton4)
                    .addComponent(txtSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(12, 12, 12)
                        .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void printFiletoArraylist(){
        ArrayList<Movie> mv = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream("D:\\run\\htdocs\\asm\\a.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            mv = (ArrayList<Movie>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void JTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JTable1PropertyChange
        if ("tableCellEditor".equals(evt.getPropertyName()) || "tableCellRenderer".equals(evt.getPropertyName())) {
    DefaultTableModel model = (DefaultTableModel) JTable1.getModel();

    // Xóa tất cả các hàng đang có trong bảng
    model.setRowCount(0);

    // Đọc đối tượng phim từ file và thêm vào bảng
    try {
        InputStream fis = new FileInputStream("D:\\run\\htdocs\\asm\\a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Movie> mv = (ArrayList<Movie>) ois.readObject();
        ois.close();
        fis.close();
        for (Movie movie : mv) {
            Object[] row = new Object[]{movie.getName(),movie.getTitle(),movie.getAge(),movie.getPrice()};
            model.addRow(row);
        }
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
    }//GEN-LAST:event_JTable1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JTable1PropertyChange(new PropertyChangeEvent(JTable1, "tableCellEditor", null, null));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Movie> mv = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
        model.setRowCount(0);
        String name = txtSearch.getText();
        try {
            FileInputStream fileIn = new FileInputStream("D:\\run\\htdocs\\asm\\a.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            mv = (ArrayList<Movie>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < mv.size(); i++) {
            Movie movie = mv.get(i);
            if (movie.getName().trim().toLowerCase().startsWith(name.toLowerCase())) {
                Object[] row = new Object[]{movie.getName(),movie.getTitle(),movie.getAge(),movie.getPrice()};
                model.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ArrayList<Movie> mv = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
        model.setRowCount(0);
        String name = txtSearch1.getText();
        try {
            FileInputStream fileIn = new FileInputStream("D:\\run\\htdocs\\asm\\a.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            mv = (ArrayList<Movie>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < mv.size(); i++) {
            Movie movie = mv.get(i);
            if (movie.getTitle().trim().toLowerCase().startsWith(name.toLowerCase())) {
                Object[] row = new Object[]{movie.getName(),movie.getTitle(),movie.getAge(),movie.getPrice()};
                model.addRow(row);             
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ArrayList<Movie> mv = new ArrayList<>();
        ArrayList<Customer> cus = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
        model.setRowCount(0);
        String name = txtSearch1.getText();
        try {
            FileInputStream fileIn = new FileInputStream("D:\\run\\htdocs\\asm\\a.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            mv = (ArrayList<Movie>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
          int selectedRow = JTable1.getSelectedRow();
        Movie selectedMovie = mv.get(selectedRow);
        int ageLimit = selectedMovie.getAge();
//        if(ageLimit)

        try {
            FileInputStream fileIn = new FileInputStream("D:\\run\\htdocs\\asm\\c.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            cus = (ArrayList<Customer>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable1MouseClicked
        // TODO add your handling code here:
         int rowIndex = JTable1.getSelectedRow();
    }//GEN-LAST:event_JTable1MouseClicked

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
            java.util.logging.Logger.getLogger(HomePageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch1;
    // End of variables declaration//GEN-END:variables
}
