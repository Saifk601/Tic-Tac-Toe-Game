
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TIC_TAK_TOE_Frame extends javax.swing.JFrame {

    private String turn;
    private int xCount;
    private int oCount;
    private int totalCount;
    
    public TIC_TAK_TOE_Frame() {
        initComponents();
        turn = "O";
        xCount = 0;
        oCount = 0;
        totalCount = 0;
    }
    
    private void choosePlayer(){
        
        if(turn.equals("O")){
            turn = "X";
        }
        else{
            turn = "O";
        }
    }
    
    public void updateScore(){
       
    xscore.setText(String.valueOf(xCount));
    oscore.setText(String.valueOf(oCount));
    
    }
    
    public void checkWin(){
        String b1 = BTN1.getText();
        String b2 = BTN2.getText();
        String b3 = BTN3.getText();
        String b4 = BTN4.getText();
        String b5 = BTN5.getText();
        String b6 = BTN6.getText();
        String b7 = BTN7.getText();
        String b8 = BTN8.getText();
        String b9 = BTN9.getText();
        
        if(b1.equals(b2)&& b2.equals(b3) && !b1.equals("")){
            
            JOptionPane.showMessageDialog(this, "Palyer " + turn +  " wins" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            BTN1.setBackground(Color.GREEN);
            BTN2.setBackground(Color.GREEN);
            BTN3.setBackground(Color.GREEN);
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            updateScore();
        }
        else if(b4.equals(b5)&& b5.equals(b6) && !b4.equals("")){
            
            JOptionPane.showMessageDialog(this, "Palyer " + turn +  " wins" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            BTN4.setBackground(Color.GREEN);
            BTN5.setBackground(Color.GREEN);
            BTN6.setBackground(Color.GREEN);
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            updateScore();
        }
        else if(b7.equals(b8)&& b8.equals(b9) && !b7.equals("")){
            
            JOptionPane.showMessageDialog(this, "Palyer " + turn +  " wins" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            BTN7.setBackground(Color.GREEN);
            BTN8.setBackground(Color.GREEN);
            BTN9.setBackground(Color.GREEN);
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            updateScore();
        }
        else if(b1.equals(b4)&& b4.equals(b7) && !b1.equals("")){
            
            JOptionPane.showMessageDialog(this, "Palyer " + turn +  " wins" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            BTN1.setBackground(Color.GREEN);
            BTN4.setBackground(Color.GREEN);
            BTN7.setBackground(Color.GREEN);
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            updateScore();
        }
        else if(b2.equals(b5)&& b5.equals(b8) && !b2.equals("")){
            
            JOptionPane.showMessageDialog(this, "Palyer " + turn +  " wins" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            BTN2.setBackground(Color.GREEN);
            BTN5.setBackground(Color.GREEN);
            BTN8.setBackground(Color.GREEN);
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            updateScore();
        }
        else if(b3.equals(b6)&& b6.equals(b9) && !b3.equals("")){
            
            JOptionPane.showMessageDialog(this, "Palyer " + turn +  " wins" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            BTN3.setBackground(Color.GREEN);
            BTN6.setBackground(Color.GREEN);
            BTN9.setBackground(Color.GREEN);
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            updateScore();
        }
        else if(b1.equals(b5)&& b5.equals(b9) && !b1.equals("")){
            
            JOptionPane.showMessageDialog(this, "Palyer " + turn +  " wins" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            BTN1.setBackground(Color.GREEN);
            BTN5.setBackground(Color.GREEN);
            BTN9.setBackground(Color.GREEN);
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            updateScore();
        }
        else if(b3.equals(b5)&& b5.equals(b7) && !b3.equals("")){
            
            JOptionPane.showMessageDialog(this, "Palyer " + turn +  " wins" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            BTN3.setBackground(Color.GREEN);
            BTN5.setBackground(Color.GREEN);
            BTN7.setBackground(Color.GREEN);
            
            if(turn.equals("O")){
                oCount++;
            }
            else{
                xCount++;
            }
            updateScore();
        }
        else if(totalCount == 9){
            JOptionPane.showMessageDialog(this, "Draw !" ,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }
    public void invokeButton(JButton btn){
        
        
        if(!btn.getText().equals("")){
            return;
        }
        totalCount++;
        btn.setText(turn);
        if(turn.equals("O")){
            btn.setForeground(Color.DARK_GRAY);
        }else{
            btn.setForeground(Color.red);
        }
        checkWin();
        choosePlayer();
    }

    public void resetGame(){
        BTN1.setText("");
        BTN2.setText("");
        BTN3.setText("");
        BTN4.setText("");
        BTN5.setText("");
        BTN6.setText("");
        BTN7.setText("");
        BTN8.setText("");
        BTN9.setText("");
        
        BTN1.setBackground(Color.pink);
        BTN2.setBackground(Color.pink);
        BTN3.setBackground(Color.pink);
        BTN4.setBackground(Color.pink);
        BTN5.setBackground(Color.pink);
        BTN6.setBackground(Color.pink);
        BTN7.setBackground(Color.pink);
        BTN8.setBackground(Color.pink);
        BTN9.setBackground(Color.pink);
        
        totalCount = 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTN3 = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        OSCORE = new javax.swing.JLabel();
        XSCORE = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        EXIT = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAK TOE GAME");
        setBackground(new java.awt.Color(255, 255, 204));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        BTN3.setBackground(new java.awt.Color(255, 153, 153));
        BTN3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        BTN1.setBackground(new java.awt.Color(255, 153, 153));
        BTN1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });

        BTN2.setBackground(new java.awt.Color(255, 153, 153));
        BTN2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });

        BTN4.setBackground(new java.awt.Color(255, 153, 153));
        BTN4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });

        BTN5.setBackground(new java.awt.Color(255, 153, 153));
        BTN5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });

        BTN6.setBackground(new java.awt.Color(255, 153, 153));
        BTN6.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(0, 204, 204));
        RESET.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("SCORECARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        OSCORE.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        OSCORE.setText("PLAYER O:");

        XSCORE.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        XSCORE.setText("PLAYER X:");

        oscore.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        oscore.setText("0");

        xscore.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        xscore.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(XSCORE, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OSCORE, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(xscore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oscore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XSCORE)
                    .addComponent(xscore))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OSCORE)
                    .addComponent(oscore))
                .addGap(45, 45, 45))
        );

        EXIT.setBackground(new java.awt.Color(255, 0, 51));
        EXIT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        BTN7.setBackground(new java.awt.Color(255, 153, 153));
        BTN7.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });

        BTN8.setBackground(new java.awt.Color(255, 153, 153));
        BTN8.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });

        BTN9.setBackground(new java.awt.Color(255, 153, 153));
        BTN9.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTN6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTN9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed

     invokeButton(BTN3);
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        invokeButton(BTN1);
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        invokeButton(BTN2);
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
       invokeButton(BTN4);
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        invokeButton(BTN5);
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        invokeButton(BTN6);
    }//GEN-LAST:event_BTN6ActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        resetGame();
    }//GEN-LAST:event_RESETActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        
        if(JOptionPane.showConfirmDialog(this, "Confirm if you want to Exit ?","Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
       invokeButton(BTN7);
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
       invokeButton(BTN8);
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
       invokeButton(BTN9);
    }//GEN-LAST:event_BTN9ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAK_TOE_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel OSCORE;
    private javax.swing.JButton RESET;
    private javax.swing.JLabel XSCORE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oscore;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables

   
}
