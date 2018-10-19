/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarynetbean.newpackage.Swing;

import dictionarynetbean.newpackage.Swing.AddWords;
import dictionarynetbean.newpackage.Swing.DeleteWords;
import dictionarynetbean.newpackage.Swing.EditWords;
import dictionarynetbean.newpackage.Dictionary;
import dictionarynetbean.newpackage.Word;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author VX15
 */
public class Window1 extends javax.swing.JFrame {
    Dictionary dictionary = new Dictionary();
    DataBase data = new DataBase();
    /**
     * Creates new form Window
     */
    public Window1() {
        initComponents();
        unitData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        label1 = new java.awt.Label();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        speak = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist = new javax.swing.JList();
        text = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        area = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        edit = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        add = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        tran = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        label1.setText("label1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        speak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/volum.png"))); // NOI18N
        speak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakActionPerformed(evt);
            }
        });
        jPanel1.add(speak, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 40, 40));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/Layer 0.png"))); // NOI18N
        jLabel2.setText("TỪ ĐIỂN ANH - VIỆT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 390, 70));

        jlist.setBackground(new java.awt.Color(204, 204, 255));
        jlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlistValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlist);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, 310));

        text.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textCaretUpdate(evt);
            }
        });
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 30));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/Search (1).png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 30, 30));

        jLabel1.setText("Search:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 30, -1));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 260, 0));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        area.setBackground(new java.awt.Color(255, 255, 204));
        area.setOpaque(true);
        jScrollPane3.setViewportView(area);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 140, 539, 310));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/traanslate_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 480));

        edit.setText("Menu");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/edit.png"))); // NOI18N
        jMenuItem2.setText("Edit word");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        edit.add(jMenuItem2);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/add.png"))); // NOI18N
        add.setText("Add word");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        edit.add(add);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/delete.png"))); // NOI18N
        delete.setText("Delete word");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        edit.add(delete);

        tran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/traanslate_1.png"))); // NOI18N
        tran.setText("Translate");
        tran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranActionPerformed(evt);
            }
        });
        edit.add(tran);
        edit.add(jSeparator1);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionarynetbean/newpackage/Swing/close.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        edit.add(exit);

        jMenuBar1.add(edit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unitData() {
        dictionary.map.clear();
        jlist.clearSelection();
        DefaultListModel model= new DefaultListModel();
        String s = text.getText();
        dictionary.map = data.searchtd(s);
        dictionary.map.forEach((String key,String value)->
        {
            model.addElement(key);
        }
        );
        jlist.setModel(model);
        area.setText("");
    }
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        EditWords edit = new EditWords();
        edit.setVisible(true);
        edit.setLocation(400,200);
        edit.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        unitData();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        int click = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "EXIT", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            super.dispose();
        }
        
    }//GEN-LAST:event_exitActionPerformed

    private void jlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlistValueChanged
        // TODO add your handling code here:
        area.setText(data.Explain((String)jlist.getSelectedValue()));
    }//GEN-LAST:event_jlistValueChanged

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        AddWords add = new AddWords();
        add.setVisible(true);
        add.setLocation(400,200);
        add.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        unitData();
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DeleteWords delete = new DeleteWords();
        delete.setVisible(true);
        delete.setLocation(400,300);
        delete.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        unitData();
    }//GEN-LAST:event_deleteActionPerformed

    private void textCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textCaretUpdate
        // TODO add your handling code here:
        DefaultListModel model = new DefaultListModel();
        String s = text.getText();
        dictionary.map = data.searchtd(s);
        dictionary.map.forEach((String key,String value)->
        {
            model.addElement(key);
        }
        );
        jlist.setModel(model);
        area.setText("");
    }//GEN-LAST:event_textCaretUpdate

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        String s = text.getText();
        if(s.equals("")){
            JOptionPane.showMessageDialog(null, "Nhập từ cần tìm!");
        }
        else if(data.search(s)){
            DefaultListModel model = new DefaultListModel();
            model.addElement(s);
            area.setText(data.Explain(s));
            jlist.setModel(model);
        }
        else{
            int click = JOptionPane.showConfirmDialog(null, "Không tìm thấy từ trong từ điển! "
                + "\n Bạn có muốn thêm từ vào từ điển không?", "Not Found", JOptionPane.YES_NO_OPTION);
            if (click == JOptionPane.YES_OPTION) {
                AddWords add = new AddWords();
                add.setVisible(true);
                add.setLocation(400,300);
                add.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                unitData();
            }
        }
    }//GEN-LAST:event_searchActionPerformed

    private void speakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakActionPerformed
        // TODO add your handling code here:
        String s = null;
        if(jlist.getSelectedValue() != null){
            s = (String)jlist.getSelectedValue();
        }
        else s = text.getText();
        Speaking sp = new Speaking();
        sp.speak(s);
    }//GEN-LAST:event_speakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        text.setText("");
        area.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranActionPerformed
        // TODO add your handling code here:
        Translate tran = new Translate();
        tran.setVisible(true);
        tran.setLocation(400,200);
        tran.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_tranActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Translate tran = new Translate();
        tran.setVisible(true);
        tran.setLocation(400,200);
        tran.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Window1 win = new Window1();
                win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                win.setVisible(true);
                win.setLocation(200, 100);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add;
    private javax.swing.JLabel area;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList jlist;
    private java.awt.Label label1;
    private javax.swing.JButton search;
    private javax.swing.JButton speak;
    private javax.swing.JTextField text;
    private javax.swing.JMenuItem tran;
    // End of variables declaration//GEN-END:variables

}
