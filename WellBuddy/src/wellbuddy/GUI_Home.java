package wellbuddy;

/** Checkpoint 2 interface. Edit its matching .form in NetBeans Design view. */
public class GUI_Home extends javax.swing.JFrame {

    public GUI_Home() {
        initComponents();
        setMinimumSize(getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblAppTitle = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblGroup = new javax.swing.JLabel();
        btnMentalHealth = new javax.swing.JButton();
        btnSleep = new javax.swing.JButton();
        btnHabits = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WellBuddy - Group M");
        lblAppTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 22)); // NOI18N
        lblAppTitle.setText("WellBuddy");
        lblWelcome.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblWelcome.setText("Welcome");
        lblGroup.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblGroup.setText("Group M");
        btnMentalHealth.setText("Mental Health");
        btnMentalHealth.addActionListener(this::btnMentalHealthActionPerformed);
        btnSleep.setText("Sleep Patterns");
        btnSleep.addActionListener(this::btnSleepActionPerformed);
        btnHabits.setText("Healthy Habits");
        btnHabits.addActionListener(this::btnHabitsActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(btnMentalHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
            .addGap(12, 12, 12)
            .addComponent(btnSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
            .addGap(12, 12, 12)
            .addComponent(btnHabits, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE))
            .addComponent(lblGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24)));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(lblAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMentalHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnHabits, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addComponent(lblGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMentalHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMentalHealthActionPerformed
        wellbuddymentalhealth.GUI_MoodManager nextScreen = new wellbuddymentalhealth.GUI_MoodManager();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMentalHealthActionPerformed

    private void btnSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSleepActionPerformed
        sleeptracker.SleepDashboard nextScreen = new sleeptracker.SleepDashboard();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSleepActionPerformed

    private void btnHabitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitsActionPerformed
        HealthyHabits.HabitGUI nextScreen = new HealthyHabits.HabitGUI();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHabitsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabits;
    private javax.swing.JButton btnMentalHealth;
    private javax.swing.JButton btnSleep;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JLabel lblGroup;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
