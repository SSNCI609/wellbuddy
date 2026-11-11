/*
 * shane smyth
 * 
 */
package wellbuddymentalhealth;

public class GUI_EntryDetails extends javax.swing.JFrame {

    public GUI_EntryDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblAppTitle = new javax.swing.JLabel();
        lblSectionTitle = new javax.swing.JLabel();
        lblPreview = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDateValue = new javax.swing.JLabel();
        lblMood = new javax.swing.JLabel();
        lblMoodValue = new javax.swing.JLabel();
        lblPressure = new javax.swing.JLabel();
        lblPressureValue = new javax.swing.JLabel();
        lblSwitchOff = new javax.swing.JLabel();
        lblSwitchOffValue = new javax.swing.JLabel();
        lblTasks = new javax.swing.JLabel();
        lblTasksValue = new javax.swing.JLabel();
        lblTotalStress = new javax.swing.JLabel();
        lblTotalStressValue = new javax.swing.JLabel();
        lblDailyNotes = new javax.swing.JLabel();
        scrEntryNotes = new javax.swing.JScrollPane();
        txtEntryNotes = new javax.swing.JTextArea();
        btnBackToHistory = new javax.swing.JButton();
        btnMentalHealthMenu = new javax.swing.JButton();
        btnRecordAnother = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WellBuddy - Entry Details");

        lblAppTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAppTitle.setText("WellBuddy");

        lblSectionTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSectionTitle.setText("Entry Details");

        lblPreview.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblPreview.setText("Entry summary");

        lblDate.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblDate.setText("Date");

        lblDateValue.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblDateValue.setText("-");

        lblMood.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblMood.setText("Mood");

        lblMoodValue.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblMoodValue.setText("-");

        lblPressure.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblPressure.setText("Under pressure");

        lblPressureValue.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblPressureValue.setText("-");

        lblSwitchOff.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblSwitchOff.setText("Hard to switch off");

        lblSwitchOffValue.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblSwitchOffValue.setText("-");

        lblTasks.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblTasks.setText("Tasks felt overwhelming");

        lblTasksValue.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblTasksValue.setText("-");

        lblTotalStress.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblTotalStress.setText("Total stress");

        lblTotalStressValue.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblTotalStressValue.setText("-");

        lblDailyNotes.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblDailyNotes.setText("Daily notes");

        txtEntryNotes.setEditable(false);
        txtEntryNotes.setColumns(30);
        txtEntryNotes.setRows(4);
        txtEntryNotes.setLineWrap(true);
        txtEntryNotes.setWrapStyleWord(true);
        txtEntryNotes.setText("");
        scrEntryNotes.setViewportView(txtEntryNotes);

        btnBackToHistory.setText("Back to History");
        btnBackToHistory.addActionListener(this::btnBackToHistoryActionPerformed);

        btnMentalHealthMenu.setText("Mental Health Menu");
        btnMentalHealthMenu.addActionListener(this::btnMentalHealthMenuActionPerformed);

        btnRecordAnother.setText("Record Another");
        btnRecordAnother.addActionListener(this::btnRecordAnotherActionPerformed);

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
            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblSwitchOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTotalStress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(40, 40, 40)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblMoodValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblPressureValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblSwitchOffValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTasksValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTotalStressValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(lblDailyNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(scrEntryNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 440, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(btnBackToHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, Short.MAX_VALUE)
            .addComponent(btnMentalHealthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, Short.MAX_VALUE)
            .addComponent(btnRecordAnother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblMoodValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblPressureValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblSwitchOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblSwitchOffValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTasksValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblTotalStress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTotalStressValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24)
            .addComponent(lblDailyNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(8, 8, 8)
            .addComponent(scrEntryNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnBackToHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMentalHealthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnRecordAnother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button to mental health menu
    private void btnMentalHealthMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMentalHealthMenuActionPerformed
        GUI_MoodManager nextScreen = new GUI_MoodManager();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMentalHealthMenuActionPerformed

    // button for record another
    private void btnRecordAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordAnotherActionPerformed
        GUI_RecordMood nextScreen = new GUI_RecordMood();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRecordAnotherActionPerformed

    // button to history
    private void btnBackToHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToHistoryActionPerformed
        GUI_MoodHistory nextScreen = new GUI_MoodHistory();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackToHistoryActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToHistory;
    private javax.swing.JButton btnMentalHealthMenu;
    private javax.swing.JButton btnRecordAnother;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JLabel lblDailyNotes;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateValue;
    private javax.swing.JLabel lblMood;
    private javax.swing.JLabel lblMoodValue;
    private javax.swing.JLabel lblPressure;
    private javax.swing.JLabel lblPressureValue;
    private javax.swing.JLabel lblPreview;
    private javax.swing.JLabel lblSectionTitle;
    private javax.swing.JLabel lblSwitchOff;
    private javax.swing.JLabel lblSwitchOffValue;
    private javax.swing.JLabel lblTasks;
    private javax.swing.JLabel lblTasksValue;
    private javax.swing.JLabel lblTotalStress;
    private javax.swing.JLabel lblTotalStressValue;
    private javax.swing.JScrollPane scrEntryNotes;
    private javax.swing.JTextArea txtEntryNotes;
    // End of variables declaration//GEN-END:variables
}
