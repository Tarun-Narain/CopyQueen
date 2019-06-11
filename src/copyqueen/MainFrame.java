/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyqueen;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Tarun Narain
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private int number=3;
    public MainFrame() {
        initComponents();
    }

    public class changer extends Thread{
            public void run()
            {
            while(true)
            {
            jLabel1.setForeground(Color.red);
                System.out.println("Starting in" +number );
                    jLabel1.setText("Starting typing in "+number +" Seconds.");
                    number--;
                    try{
                    this.sleep(1000);
                    }catch(Exception e)
                    {}
            if(number<1){
                jLabel1.setForeground(Color.red);
            jLabel1.setText("Typing Started");
            TypeText(); 
            jLabel1.setText("Press Start");
            number=3;
            jLabel1.setForeground(Color.black);
           
            break;
           
            }
            }
            } 

        private void TypeText() {
            try{
           String type=jTextArea1.getText();
            System.out.println("Typed  : "+type);
            for(char c: type.toCharArray())
         type(c);     
            }catch(Exception e)
            {
                jTextArea1.setText(e.toString());
            }
        }

        private void type(char c) {
          try{ Robot robot=new Robot();
              switch (c) {
        case 'a': doType(KeyEvent.VK_A); break;
        case 'b': doType(KeyEvent.VK_B); break;
        case 'c': doType(KeyEvent.VK_C); break;
        case 'd': doType(KeyEvent.VK_D); break;
        case 'e': doType(KeyEvent.VK_E); break;
        case 'f': doType(KeyEvent.VK_F); break;
        case 'g': doType(KeyEvent.VK_G); break;
        case 'h': doType(KeyEvent.VK_H); break;
        case 'i': doType(KeyEvent.VK_I); break;
        case 'j': doType(KeyEvent.VK_J); break;
        case 'k': doType(KeyEvent.VK_K); break;
        case 'l': doType(KeyEvent.VK_L); break;
        case 'm': doType(KeyEvent.VK_M); break;
        case 'n': doType(KeyEvent.VK_N); break;
        case 'o': doType(KeyEvent.VK_O); break;
        case 'p': doType(KeyEvent.VK_P); break;
        case 'q': doType(KeyEvent.VK_Q); break;
        case 'r': doType(KeyEvent.VK_R); break;
        case 's': doType(KeyEvent.VK_S); break;
        case 't': doType(KeyEvent.VK_T); break;
        case 'u': doType(KeyEvent.VK_U); break;
        case 'v': doType(KeyEvent.VK_V); break;
        case 'w': doType(KeyEvent.VK_W); break;
        case 'x': doType(KeyEvent.VK_X); break;
        case 'y': doType(KeyEvent.VK_Y); break;
        case 'z': doType(KeyEvent.VK_Z); break;
        case 'A': doType( KeyEvent.VK_A,KeyEvent.VK_SHIFT); break;
        case 'B': doType( KeyEvent.VK_B,KeyEvent.VK_SHIFT); break;
        case 'C': doType( KeyEvent.VK_C,KeyEvent.VK_SHIFT); break;
        case 'D': doType( KeyEvent.VK_D,KeyEvent.VK_SHIFT); break;
        case 'E': doType( KeyEvent.VK_E,KeyEvent.VK_SHIFT); break;
        case 'F': doType( KeyEvent.VK_F,KeyEvent.VK_SHIFT); break;
        case 'G': doType( KeyEvent.VK_G,KeyEvent.VK_SHIFT); break;
        case 'H': doType( KeyEvent.VK_H,KeyEvent.VK_SHIFT); break;
        case 'I': doType( KeyEvent.VK_I,KeyEvent.VK_SHIFT); break;
        case 'J': doType( KeyEvent.VK_J,KeyEvent.VK_SHIFT); break;
        case 'K': doType( KeyEvent.VK_K,KeyEvent.VK_SHIFT); break;
        case 'L': doType( KeyEvent.VK_L,KeyEvent.VK_SHIFT); break;
        case 'M': doType( KeyEvent.VK_M,KeyEvent.VK_SHIFT); break;
        case 'N': doType( KeyEvent.VK_N,KeyEvent.VK_SHIFT); break;
        case 'O': doType( KeyEvent.VK_O,KeyEvent.VK_SHIFT); break;
        case 'P': doType( KeyEvent.VK_P,KeyEvent.VK_SHIFT); break;
        case 'Q': doType( KeyEvent.VK_Q,KeyEvent.VK_SHIFT); break;
        case 'R': doType( KeyEvent.VK_R,KeyEvent.VK_SHIFT); break;
        case 'S': doType( KeyEvent.VK_S,KeyEvent.VK_SHIFT); break;
        case 'T': doType( KeyEvent.VK_T,KeyEvent.VK_SHIFT); break;
        case 'U': doType( KeyEvent.VK_U,KeyEvent.VK_SHIFT); break;
        case 'V': doType(KeyEvent.VK_V,KeyEvent.VK_SHIFT); break;
        case 'W': doType( KeyEvent.VK_W,KeyEvent.VK_SHIFT); break;
        case 'X': doType(KeyEvent.VK_X,KeyEvent.VK_SHIFT); break;
        case 'Y': doType( KeyEvent.VK_Y,KeyEvent.VK_SHIFT); break;
        case 'Z': doType( KeyEvent.VK_Z,KeyEvent.VK_SHIFT); break;
        case '`': doType(KeyEvent.VK_BACK_QUOTE, KeyEvent.VK_SLASH); break;
        case '0': doType(KeyEvent.VK_0); break;
        case '1': doType(KeyEvent.VK_1); break;
        case '2': doType(KeyEvent.VK_2); break;
        case '3': doType(KeyEvent.VK_3); break;
        case '4': doType(KeyEvent.VK_4); break;
        case '5': doType(KeyEvent.VK_5); break;
        case '6': doType(KeyEvent.VK_6); break;
        case '7': doType(KeyEvent.VK_7); break;
        case '8': doType(KeyEvent.VK_8); break;
        case '9': doType(KeyEvent.VK_9); break;
        case '-': doType(KeyEvent.VK_MINUS); break;
        case '=': doType(KeyEvent.VK_EQUALS); break;
        case '~': doType( KeyEvent.VK_BACK_QUOTE); break;
        case '!': doType(KeyEvent.VK_1, KeyEvent.VK_SHIFT); break;
        case '@': doType(KeyEvent.VK_2, KeyEvent.VK_SHIFT); break;
        case '#': doType(KeyEvent.VK_3, KeyEvent.VK_SHIFT); break;
        case '$': doType(KeyEvent.VK_4, KeyEvent.VK_SHIFT); break;
        case '%': doType(KeyEvent.VK_5, KeyEvent.VK_SHIFT); break;
        case '^': doType(KeyEvent.VK_CIRCUMFLEX, KeyEvent.VK_SLASH); break;
        case '&': doType(KeyEvent.VK_7, KeyEvent.VK_SHIFT); break;
        case '*': doType(KeyEvent.VK_8, KeyEvent.VK_SHIFT); break;
        case '(': doType(KeyEvent.VK_9, KeyEvent.VK_SHIFT); break;
        case ')': doType(KeyEvent.VK_0, KeyEvent.VK_SHIFT); break;
        case '_': doType(KeyEvent.VK_MINUS, KeyEvent.VK_SHIFT); break;
        case '+': doType(KeyEvent.VK_EQUALS, KeyEvent.VK_SHIFT); break;
        case '\t': doType(KeyEvent.VK_TAB); break;
        case '\n': doType(KeyEvent.VK_ENTER); break;
        case '[': doType(KeyEvent.VK_OPEN_BRACKET); break;
        case ']': doType(KeyEvent.VK_CLOSE_BRACKET); break;
        case '{': doType(KeyEvent. VK_OPEN_BRACKET,KeyEvent.VK_SHIFT ); break;
        case '}': doType( KeyEvent. VK_CLOSE_BRACKET,KeyEvent.VK_SHIFT); break;
        case '|': doType(KeyEvent. VK_BACK_SLASH,KeyEvent.VK_SHIFT); break;
        case ';': doType(KeyEvent.VK_SEMICOLON); break;
        case ':': doType(KeyEvent.VK_COLON, KeyEvent.VK_SHIFT); break;
        case '\'': doType(KeyEvent.VK_QUOTE); break;
        case '"': doType(KeyEvent.VK_QUOTEDBL, KeyEvent.VK_SHIFT); break;
        case ',': doType(KeyEvent.VK_COMMA); break;
        case '<': doType(KeyEvent.VK_COMMA, KeyEvent.VK_SHIFT); break;
        case '.': doType(KeyEvent.VK_PERIOD); break;
        case '>': doType(KeyEvent.VK_PERIOD, KeyEvent.VK_SHIFT); break;
        case '/': doType(KeyEvent.VK_SLASH, KeyEvent.VK_SLASH); break;
        case '?': doType( KeyEvent.VK_SLASH,KeyEvent.VK_SHIFT); break;
        case ' ': doType(KeyEvent.VK_SPACE); break;
        default:
                throw new IllegalArgumentException("Cannot type character " + c);
        }
             
            System.out.println("KeyPressed : "+ KeyEvent.getExtendedKeyCodeForChar(c)+"   :   "+c);
          }catch(Exception e){
          jTextArea1.setText(e.toString());
          }
        }
private void doType(int k1)
{
try{
                Robot robot=new Robot();
                        robot.keyPress(k1);
         robot.delay(20);
                        robot.keyRelease(k1);
                        robot.delay(20);
                }catch(Exception e)
                {jTextArea1.setText(e.toString());}
}
        private void doType(int k1, int k2) {
                try{
                Robot robot=new Robot();
                        robot.keyPress(k2);
                        robot.keyPress(k1);
         robot.delay(20);
                        robot.keyRelease(k1);
                        robot.keyRelease(k2);
                        robot.delay(20);
                }catch(Exception e)
                {jTextArea1.setText(e.toString());}
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("All Hail To The Copy Queen");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Press Start");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Developed By Tarun Narain , github.com/Tarun-Narain");

        jLabel3.setText("Paste the Text or Code Here, Press Start and Click(focus) where you want it to type.");

        jLabel4.setText("Feel Free to Fork it on Github.com/Tarun-Narain/CopyQueen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
       try {
      changer change=new changer();
      change.start();
            
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
       
    }//GEN-LAST:event_jTextArea1FocusLost

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
          
                         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables


}
