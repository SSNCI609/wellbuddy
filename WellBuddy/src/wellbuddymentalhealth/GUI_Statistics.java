/*
 * shane smyth
 * 
 */
package wellbuddymentalhealth;

public class GUI_Statistics extends javax.swing.JFrame {

    public GUI_Statistics() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblAppTitle = new javax.swing.JLabel();
        lblSectionTitle = new javax.swing.JLabel();
        lblPreview = new javax.swing.JLabel();
        lblMoodHeading = new javax.swing.JLabel();
        lblMostCommon = new javax.swing.JLabel();
        lblStressHeading = new javax.swing.JLabel();
        lblAverageStress = new javax.swing.JLabel();
        lblFrequency = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblGreat = new javax.swing.JLabel();
        lblGreatCount = new javax.swing.JLabel();
        lblGood = new javax.swing.JLabel();
        lblGoodCount = new javax.swing.JLabel();
        lblOkay = new javax.swing.JLabel();
        lblOkayCount = new javax.swing.JLabel();
        lblLow = new javax.swing.JLabel();
        lblLowCount = new javax.swing.JLabel();
        lblVeryLow = new javax.swing.JLabel();
        lblVeryLowCount = new javax.swing.JLabel();
        btnHistory = new javax.swing.JButton();
        btnMentalHealthMenu = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnRecordMood = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WellBuddy - Statistics");
        lblAppTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAppTitle.setText("WellBuddy");
        lblSectionTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSectionTitle.setText("Statistics");
        lblPreview.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblPreview.setText("Summary of your mood entries.");
        lblMoodHeading.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblMoodHeading.setText("Most common mood");
        lblMostCommon.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblMostCommon.setText("-");
        lblStressHeading.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblStressHeading.setText("Average stress");
        lblAverageStress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAverageStress.setText("-");
        lblFrequency.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblFrequency.setText("Mood frequency");
        lblTotal.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblTotal.setText("Total entries: -");
        lblGreat.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblGreat.setText("Great");
        lblGreatCount.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblGreatCount.setText("-");
        lblGood.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblGood.setText("Good");
        lblGoodCount.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblGoodCount.setText("-");
        lblOkay.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblOkay.setText("Okay");
        lblOkayCount.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblOkayCount.setText("-");
        lblLow.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblLow.setText("Low");
        lblLowCount.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblLowCount.setText("-");
        lblVeryLow.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblVeryLow.setText("Very low");
        lblVeryLowCount.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblVeryLowCount.setText("-");
        btnHistory.setText("View Mood History");
        btnHistory.addActionListener(this::btnHistoryActionPerformed);
        btnMentalHealthMenu.setText("Mental Health Menu");
        btnMentalHealthMenu.addActionListener(this::btnMentalHealthMenuActionPerformed);
        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(this::btnMainMenuActionPerformed);
        btnRecordMood.setText("Record Mood");
        btnRecordMood.addActionListener(this::btnRecordMoodActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblSectionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMoodHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblMostCommon, javax.swing.GroupLayout.PREFERRED_SIZE, 310, Short.MAX_VALUE))
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStressHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblAverageStress, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)))
            .addComponent(lblFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGreat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblGood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblOkay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblVeryLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(100, 100, 100)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGreatCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblGoodCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblOkayCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblLowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblVeryLowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, Short.MAX_VALUE)
            .addComponent(btnRecordMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addComponent(btnMentalHealthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, Short.MAX_VALUE)
            .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(24, 24, 24)));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(lblAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6)
            .addComponent(lblSectionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(8, 8, 8)
            .addComponent(lblPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblMoodHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblStressHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblMostCommon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblAverageStress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addComponent(lblFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblGreat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblGreatCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblGood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblGoodCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblOkay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblOkayCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblLowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblVeryLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblVeryLowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnRecordMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnMentalHealthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button for history
    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        GUI_MoodHistory nextScreen = new GUI_MoodHistory();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHistoryActionPerformed

    // button to mental health menu
    private void btnMentalHealthMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMentalHealthMenuActionPerformed
        GUI_MoodManager nextScreen = new GUI_MoodManager();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMentalHealthMenuActionPerformed

    // button to main menu
    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        wellbuddy.GUI_Home nextScreen = new wellbuddy.GUI_Home();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMainMenuActionPerformed

    // button for record mood
    private void btnRecordMoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordMoodActionPerformed
        GUI_RecordMood nextScreen = new GUI_RecordMood();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRecordMoodActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnMentalHealthMenu;
    private javax.swing.JButton btnRecordMood;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JLabel lblAverageStress;
    private javax.swing.JLabel lblFrequency;
    private javax.swing.JLabel lblGood;
    private javax.swing.JLabel lblGoodCount;
    private javax.swing.JLabel lblGreat;
    private javax.swing.JLabel lblGreatCount;
    private javax.swing.JLabel lblLow;
    private javax.swing.JLabel lblLowCount;
    private javax.swing.JLabel lblMoodHeading;
    private javax.swing.JLabel lblMostCommon;
    private javax.swing.JLabel lblOkay;
    private javax.swing.JLabel lblOkayCount;
    private javax.swing.JLabel lblPreview;
    private javax.swing.JLabel lblSectionTitle;
    private javax.swing.JLabel lblStressHeading;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVeryLow;
    private javax.swing.JLabel lblVeryLowCount;
    // End of variables declaration//GEN-END:variables
}
