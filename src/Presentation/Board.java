/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Application.Winner;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Board extends javax.swing.JFrame implements Observer {

    private String symbol="X";
    
    
    public Board() {
        initComponents();
        setSize(1200, 600);
        //setLocationRelativeTo(null) ;
        //jButton1.setBackground(Color.white);
        //jLabel1.setText("Turn player X");
}

    private void Player(){
        //Observer n=new Observer();
        
        if(symbol.equalsIgnoreCase("X")){
            symbol ="O";
            //n = notifyObservers();
            jLabel1.setText("Turn player O");
            //n.update(P1_3, "AAA");
        }
        else{
            symbol ="X";
            jLabel1.setText("Turn player X");
        }}
    private void winning()
                   {
        String m;
        Winner winner = new Winner();
        
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();

        String b4 = jButton4.getText ();
        String b5 = jButton5.getText ();
        String b6 = jButton6.getText ();

        String b7 = jButton7.getText ();
        String b8 = jButton8.getText ();
        String b9 = jButton9.getText ();
        
        
        if((b1 =="X") && b2 ==("X") && b3 ==("X"))
        {
        jButton1.setBackground(Color.DARK_GRAY) ;
        jButton2.setBackground(Color.DARK_GRAY) ;
        jButton3.setBackground(Color.DARK_GRAY) ;
        
        m= winner.message("X");
        JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
        TicTacToeGame main = new TicTacToeGame();
        main.show();
        dispose();
        
        
            }
        if((b4 =="X") && b5 ==("X") && b6 ==("X"))
        {
        jButton4.setBackground(Color.DARK_GRAY) ;
        jButton5.setBackground(Color.DARK_GRAY) ;
        jButton6.setBackground(Color.DARK_GRAY) ;
        m= winner.message("X");
        JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
        TicTacToeGame main = new TicTacToeGame();
        main.show();
        dispose();
            }
        if((b7 =="X") && b8 ==("X") && b9 ==("X"))
        {
            jButton7.setBackground(Color.DARK_GRAY) ;
            jButton8.setBackground(Color.DARK_GRAY) ;
            jButton9.setBackground(Color.DARK_GRAY) ;
            m= winner.message("X");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
            }
        if(( b1 =="X") && b4 ==("X") && b7 ==("X"))
        {
            jButton1.setBackground(Color.DARK_GRAY) ;
            jButton4.setBackground(Color.DARK_GRAY) ;
            jButton7.setBackground(Color.DARK_GRAY) ;
            m= winner.message("X");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
            }
        if(( b2 =="X") && b5 ==("X") && b8 ==("X"))
        {
            jButton2.setBackground(Color.DARK_GRAY) ;
            jButton5.setBackground(Color.DARK_GRAY) ;
            jButton8.setBackground(Color.DARK_GRAY) ;
            m= winner.message("X");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
            }
        if(( b3 =="X") && b6 ==("X") && b9 ==("X"))
        {
            jButton3.setBackground(Color.DARK_GRAY) ;
            jButton6.setBackground(Color.DARK_GRAY) ;
            jButton9.setBackground(Color.DARK_GRAY) ;
            m= winner.message("X");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
            }
        if(( b1 =="X") && b5 ==("X") && b9 ==("X"))
        {
            jButton1.setBackground(Color.DARK_GRAY) ;
            jButton5.setBackground(Color.DARK_GRAY) ;
            jButton9.setBackground(Color.DARK_GRAY) ;
            m= winner.message("X");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
            }
        if(( b3 =="X") && b5 ==("X") && b7 ==("X"))
        {
            jButton3.setBackground(Color.DARK_GRAY) ;
            jButton5.setBackground(Color.DARK_GRAY) ;
            jButton7.setBackground(Color.DARK_GRAY) ;
            m= winner.message("X");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
            }
        
        if((b1 =="O") && b2 ==("O") && b3 ==("O"))
        {
        jButton1.setBackground(Color.DARK_GRAY) ;
        jButton2.setBackground(Color.DARK_GRAY) ;
        jButton3.setBackground(Color.DARK_GRAY) ;
        m= winner.message("O");
        JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
        TicTacToeGame main = new TicTacToeGame();
        main.show();
        dispose();
            }
        if((b4 =="O") && b5 ==("O") && b6 ==("O"))
        {
        jButton4.setBackground(Color.DARK_GRAY) ;
        jButton5.setBackground(Color.DARK_GRAY) ;
        jButton6.setBackground(Color.DARK_GRAY) ;
        m= winner.message("O");
        JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
        TicTacToeGame main = new TicTacToeGame();
        main.show();
        dispose();
        
            }
        if((b7 =="O") && b8 ==("O") && b9 ==("O"))
        {
            jButton7.setBackground(Color.DARK_GRAY) ;
            jButton8.setBackground(Color.DARK_GRAY) ;
            jButton9.setBackground(Color.DARK_GRAY) ;
            m= winner.message("O");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
        
            }
        if(( b1 =="O") && b4 ==("O") && b7 ==("O"))
        {
            jButton1.setBackground(Color.DARK_GRAY) ;
            jButton4.setBackground(Color.DARK_GRAY) ;
            jButton7.setBackground(Color.DARK_GRAY) ;
            m= winner.message("O");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
        
            }
        if(( b2 =="O") && b5 ==("O") && b8 ==("O"))
        {
            jButton2.setBackground(Color.DARK_GRAY) ;
            jButton5.setBackground(Color.DARK_GRAY) ;
            jButton8.setBackground(Color.DARK_GRAY) ;
            m= winner.message("O");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
        
            }
        if(( b3 =="O") && b6 ==("O") && b9 ==("O"))
        {
            jButton3.setBackground(Color.DARK_GRAY) ;
            jButton6.setBackground(Color.DARK_GRAY) ;
            jButton9.setBackground(Color.DARK_GRAY) ;
            m= winner.message("O");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
        
            }
        if(( b1 =="O") && b5 ==("O") && b9 ==("O"))
        {
            jButton1.setBackground(Color.DARK_GRAY) ;
            jButton5.setBackground(Color.DARK_GRAY) ;
            jButton9.setBackground(Color.DARK_GRAY) ;
            m= winner.message("O");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
        
            }
        if(( b3 =="O") && b5 ==("O") && b7 ==("O"))
        {
            jButton3.setBackground(Color.DARK_GRAY) ;
            jButton5.setBackground(Color.DARK_GRAY) ;
            jButton7.setBackground(Color.DARK_GRAY) ;
            m= winner.message("O");
            JOptionPane.showMessageDialog(this,m,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE) ;
            TicTacToeGame main = new TicTacToeGame();
            main.show();
            dispose();
        
            }
        
                  
                   
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic tac toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 3, 3));

        jButton1.setBackground(java.awt.SystemColor.controlLtHighlight);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 102));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton1.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton1.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton2.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton2.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton3.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton3.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton4.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton4.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton5.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton5.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton6.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton6.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton7.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton7.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton8.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton8.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(symbol);
        if(symbol.equalsIgnoreCase("X")){

            jButton9.setForeground(Color.LIGHT_GRAY);}
        else{
            jButton9.setForeground(Color.GRAY);}

        Player();
        winning();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
