


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author VASUDHA
 */
public class Seats extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Seats
     */
    public Seats() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WINDOW");

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WINDOW");

        jButton2.setBackground(new java.awt.Color(255, 0, 204));
        jButton2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton2)
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: //logout
        String temp[] = {""};
        f.dispose();
        new Login().main(temp);
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
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Seats().setVisible(true);
                
                Args = args;
                f = new Seats();
                s = (Seats)f;
                
                f.toFront();
                t = new JLabel("CHOOSE SEATS " + args[2]);
                f.setVisible(true);
                t.setBounds(500, 50, 500, 30);
                t.setForeground(Color.white);
                Font fo = new Font("Cambria",Font.ITALIC,26);
                t.setFont(fo);
                
                f.add(t);
                f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
                Color mycolor = new Color(0,0,153);
         
                
		f.getContentPane().setBackground(mycolor);
                fp.setBounds(340, 550, 600, 30);
                fp.setEnabled(false);
                f.add(fp);
                
                SUBMIT.setBounds(600, 600, 100, 30);
                SUBMIT.addActionListener(s);
                f.add(SUBMIT);
                
                /*Font fon = new Font("Cambria",Font.ITALIC,26);
                fp = new JLabel("FRONT PANE");
                fp.setFont(fon);
                fp.setBounds(250, 600, 600, 30);
                fp.setForeground(Color.WHITE);
                fp.add(f);*/
                
               
                //create_seats(Integer.valueOf(args[3]));
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sample","root", "Vasu$0308" );
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select TOT_SEATS from BUSES where BUS_ID = " + Args[3]);
                    rs.next();
                    tot_seats = rs.getInt(1);
                    System.out.println("Total seats: " + tot_seats);
                    rs = st.executeQuery("select SEAT_NO from SEATS WHERE BUS_ID = " + Args[3]);
                    Boolean bn = rs.next(); 
                    int count=1, x , y= 200; //count is seat_no
                    
                    for(int i=0; i<tot_seats/4; i++)
                        for(int j=0; j<4; j++)
                        {
                            b[i][j] = new JButton(String.valueOf(count));
                            f.add(b[i][j]);
                            
                            if(bn && rs.getInt(1)==count) {
                                b[i][j].setBackground(Color.DARK_GRAY); //Already Booked
                                b[i][j].setEnabled(false);
                                bn= rs.next();
                            }
                            else if( !bn || rs.getInt(1)!=count){
                                b[i][j].setBackground(Color.GREEN); //Available
                                b[i][j].setEnabled(true);
                            }
                            
                            
                            b[i][j].addActionListener(s);
                            b[i][j].setBorder(BorderFactory.createLineBorder(Color.BLUE,2,true));
                            if(j > 1)
                                {
                                        x = 650 ;
                                }
                            else 
                                {
                                        x = 450 ;
                                }

                            b[i][j].setBounds(x + 50*j,y + 50*i, 30, 30);
                            count++ ;

                        }


                }
                catch(Exception e){

                }
            }
        });
        
    }

    public void actionPerformed(ActionEvent e){  
        int c=1;
        for(int i=0; i< tot_seats/4; i++)
            for(int j=0; j<4; j++) {
                if(e.getSource()==b[i][j]){
                    if(b[i][j].getBackground()==Color.GREEN) {
                        b[i][j].setBackground(Color.WHITE); //Selected
                        
                        bflag[i][j] = true;
                        //JOptionPane.showMessageDialog(f, c + " selected, row & col , bflag " + i +" " +j + " " + bflag[i][j]);
                    }     
                    else if(b[i][j].getBackground()==Color.WHITE) {
                         b[i][j].setBackground(Color.GREEN);
                         
                         bflag[i][j] = false;
                         //JOptionPane.showMessageDialog(f, c + " deselected, row&col , bflag " + i +" " + j + " " + bflag[i][j]);
                    }
                       
                }
                c++;
            }
        if(e.getSource()==SUBMIT) {
            int opt = JOptionPane.showConfirmDialog(null, "Confirm Seats?");
            if(opt==JOptionPane.YES_OPTION) {
                //JOptionPane.showMessageDialog(f, "Bill next");
                //sc=1;
                //seats_chosen = new int[tot_seats];
                //no_seats=0; 
                /*for(int ro=0; ro<tot_seats/4; ro++) {
                    for(int col=0; col<4; col++) {
                        if(bflag[ro][col]==true)
                            seats_chosen[no_seats++]=sc;
                        sc++;
                    }
                    //System.out.println();
                }
                for(int ro=0; ro<no_seats; ro++)
                    System.out.print(seats_chosen[ro]+ " ");*/
                String tseats = Integer.toString(tot_seats);
                String[] arguments = {Args[0], Args[1], Args[2], Args[3], tseats, Arrays.deepToString(bflag)}; //Args[3]=bus_id, Args[4] = tot_seats
                new Bill().main(arguments);
                SUBMIT.removeActionListener(s);
                f.dispose();
            }
            else if(opt== JOptionPane.NO_OPTION){
                
                /*for(Boolean[] arr : bflag)
                    Arrays.fill(arr, false);
              
                SUBMIT.removeActionListener(s);
                new Seats().main(Args);
                f.dispose();*/
            }
        }
    }
    static JFrame f;
    static Seats s;
    static JLabel t;//, fp;
    static String Args[]; //0-2 credentials, 3-bus id
    static int tot_seats;
    static int sc=1, seats_chosen[] = new int [100], no_seats =0;
    static Boolean bflag[][] = new Boolean[10][10];
    static JButton b[][] = new JButton[10][10], fp = new JButton("FRONT PANE"), SUBMIT = new JButton("SUBMIT");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
