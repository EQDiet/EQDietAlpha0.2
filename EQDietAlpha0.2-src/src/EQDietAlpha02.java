/**
 * Healthy eating app test created by Daniel Lopez Tena.
 * (C) 2020, Daniel Lopez Tena.
 * Website: https://eqdiet.weebly.com
 * This program comes with NO WARANTY. It's safe but use it at your own risk.
 * Read the full license in this link: https://bit.ly/eqdietlicense
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class EQDietAlpha02 extends javax.swing.JFrame{
    
    private static final long serialVersionUID = 1L;
    short duration;
    short eaten;
    short food;
    short restartsession;
    int kcal;
    long finalkcal;
    long logquantity;
    long quantity;
    String fileName;
    String text;
    String dish;
    String meal;
    String grams;
    String log;

    public void StartLog(){
        duration = 1;
        try{
        FileWriter fwS=new FileWriter("FoodLog.txt");
            try (BufferedWriter fW = new BufferedWriter(fwS)) {
                do{
                    fW.write("---------------------------------------------------------------");
                    fW.newLine();
                    fW.write("File generated by EQdiet Alpha. Developed by Daniel Lopez Tena.");
                    fW.newLine();
                    fW.write("---------------------------------------------------------------");
                    duration = 0;
                }while(duration>0);
                fW.close();
            }
        } catch (IOException ex) {
            jLabel9.setText("Error saving food log. Please reinstall application.");
        } 
    }
    
    public void WriteLog(){
        duration = 1;
        if(eaten == 2){
            try{
            FileWriter flS=new FileWriter("FoodLog.txt");
            try (BufferedWriter fS = new BufferedWriter(flS)) {
                do{
                    fS.write("---------------------------------------------------------------");
                    fS.newLine();
                    fS.write("File generated by EQdiet Alpha. Developed by Daniel Lopez Tena.");
                    fS.newLine();
                    fS.write("---------------------------------------------------------------");
                    fS.newLine();
                    fS.write("Thanks for using EQDiet Alpha!");
                    fS.newLine();
                    fS.write("Coded by: Daniel Lopez Tena.");
                    fS.newLine();
                    fS.write("Thanks to Daniel Andrade and Miguel Angel Picazo for helping me in this proyect.");
                    fS.newLine();
                    fS.write("And special thanks to Pedro Hernandez for coordinating this amazing proyect.");
                    fS.newLine();
                    fS.write("Hope you enjoyed using this product!");
                    duration = 0;
                    eaten = 0;
                }while(duration>0);
                fS.close();
            }
        } catch (IOException ex) {
            jLabel9.setText("Error saving food log");
        }
        } else {
           try{
            FileWriter flS=new FileWriter("FoodLog.txt", true);
            try (BufferedWriter fS = new BufferedWriter(flS)) {
                do{
                    fS.newLine();
                    fS.write(log + ".");
                    duration = 0;
                }while(duration>0);
                fS.close();
            }
        } catch (IOException ex) {
            jLabel9.setText("Error saving food log");
        } 
        }
    }
    
    public void Eaten(){
      switch(food){
          case 1: //Bread
              kcal = 265;
              finalkcal = kcal * quantity / 100;
              jLabel5.setText("You have eaten " + finalkcal + " kilocalories");
              log = "You have eaten " + finalkcal + " kilocalories of bread";
              jButton2.setEnabled(true);
              logquantity = logquantity + finalkcal;
              WriteLog();
              break;
              
          case 2: //Chocolate
              kcal = 546;
              finalkcal = kcal * quantity / 100;
              jLabel5.setText("You have eaten " + finalkcal + " kilocalories");
              log = "You have eaten " + finalkcal + " kilocalories of chocolate";
              jButton2.setEnabled(true);
              if(quantity == 2020)
                  eaten = 1;
              logquantity = logquantity + finalkcal;
              WriteLog();
              break;
              
          case 3: //Milk
              kcal = 42;
              finalkcal = kcal * quantity / 100;
              jLabel5.setText("You have eaten " + finalkcal + " kilocalories");
              log = "You have eaten " + finalkcal + " kilocalories of milk";
              jButton2.setEnabled(true);
              logquantity = logquantity + finalkcal;
              WriteLog();
              break;
      }
    }
    
    public void RestartSession(){
        this.duration = 1;
        jLabel5.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jButton2.setEnabled(false);
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jButton1.setEnabled(true);
        jLabel5.setText("Welcome to EQDiet Alpha");
        jLabel9.setText("Coded by: Daniel Lopez Tena");
        duration = 0;
        eaten = 0;
        logquantity = 0;
        restartsession = 0;
        StartLog();
    }
    
   /**
    * goToURL code coded by Antony Garcia Gonzalez.
    * website: http://panamahitek.com
    */
    public void goToURL(String URL){
           if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
 
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    URI uri = new URI(URL);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(EQDietAlpha02.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    /**
     * Creates new form EQDietAlpha02
     */
    public EQDietAlpha02() {
        this.duration = 1;
        initComponents();
        jButton2.setEnabled(false);
        jLabel5.setText("Welcome to EQDiet Alpha");
        jLabel9.setText("Coded by: Daniel Lopez Tena");
        duration = 0;
        eaten = 0;
        logquantity = 0;
        restartsession = 0;
        StartLog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFrame1 = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setTitle("About EQDiet Alpha");
        jFrame1.setLocation(new java.awt.Point(44, 82));
        jFrame1.setResizable(false);
        jFrame1.setSize(new java.awt.Dimension(325, 140));
        jFrame1.setType(java.awt.Window.Type.POPUP);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("About EQDiet Alpha");

        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Version 0.20 Alpha");

        jButton7.setText("Check for updates");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Website");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Developed by Daniel Lopez Tena");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addContainerGap())))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EQDiet Alpha");
        setLocation(new java.awt.Point(30, 15));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("What have you eaten?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Food:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantity (g):");

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton2.setText("End session");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("About");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel9.setText("Press \"End session\" to add all your foods");
        dish = jTextField1.getText();
        grams = jTextField2.getText();
        if("Great work".equals(grams) || "great work".equals(grams)) {
            meal = grams;
        } else {
            quantity = Long.parseLong(grams);
        }
        
        if("Bread".equals(dish) || "bread".equals(dish)){
            food = 1;
            Eaten();
        } else if("Chocolate".equals(dish) || "chocolate".equals(dish)){
            food = 2;
            Eaten();
        } else if("Milk".equals(dish) || "milk".equals(dish)){
            food = 3;
            Eaten();
        } else if("Credits".equals(dish) || "credits".equals(dish)){
            
            if(eaten == 1){
                if("Great work".equals(meal) || "great work".equals(meal)){
                eaten++;
                jLabel5.setText("Thank you!");
                WriteLog();
                } else{
                jLabel5.setText("The specified food does not exist actually");
                }
             } else{
              jLabel5.setText("The specified food does not exist actually");
            }
        } else {
            jLabel5.setText("The specified food does not exist actually");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(restartsession == 1){
            jButton2.setText("End session");
            RestartSession();
        } else {
          duration = 1;
          try{
            FileWriter fwL=new FileWriter("FoodLog.txt", true);
            try (BufferedWriter fL = new BufferedWriter(fwL)) {
                do{
                    fL.newLine();
                    fL.write("- In total you have eaten " + logquantity + " kilocalories. -");
                    duration = 0;
                }while(duration>0);
                restartsession = 1;
                jLabel5.setText("The session has been successfully completed");
                jLabel9.setText("In total you have eaten " + logquantity + " kilocalories.");
                jButton2.setText("Start new session");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField1.setEnabled(false);
                jTextField2.setEnabled(false);
                jButton1.setEnabled(false);
                fL.close();
            }
          } catch (IOException ex) {
              jLabel9.setText("Error saving food log");
          }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0); //Exits the app
    }//GEN-LAST:event_jButton3ActionPerformed
    @SuppressWarnings("deprecation") //Removes deprecated API notification (in jFrame1.show();) while compiling
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jFrame1.setSize(339, 180);
        jFrame1.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFrame1.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        goToURL("https://eqdiet.weebly.com/release-notes");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        goToURL("https://eqdiet.weebly.com");
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EQDietAlpha02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EQDietAlpha02().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
