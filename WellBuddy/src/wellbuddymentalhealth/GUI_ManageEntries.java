/*
 * shane smyth
 * 
 */
package wellbuddymentalhealth;

public class GUI_ManageEntries extends javax.swing.JFrame {
    
    public GUI_ManageEntries() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblAppTitle = new javax.swing.JLabel();
        lblSectionTitle = new javax.swing.JLabel();
        lblPreview = new javax.swing.JLabel();
        lblSearchDate = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnDeleteEntry = new javax.swing.JButton();
        btnRecordMood = new javax.swing.JButton();
        btnMentalHealthMenu = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        scrEntries = new javax.swing.JScrollPane();
        tblEntries = new javax.swing.JTable();
        txtSearchDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WellBuddy - Manage Entries");
        lblAppTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAppTitle.setText("WellBuddy");
        lblSectionTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSectionTitle.setText("Manage Entries");
        lblPreview.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblPreview.setText("Search, view or delete your mood entries.");
        lblSearchDate.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblSearchDate.setText("Search date (DD/MM/YYYY)");
        lblStatus.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblStatus.setText("Entries");
        lblHint.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblHint.setText("Select an entry to delete. You will be asked to confirm.");
        btnSearch.setText("Search");
        btnSearch.addActionListener(this::btnSearchActionPerformed);
        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(this::btnShowAllActionPerformed);
        btnDeleteEntry.setText("Delete Entry");
        btnDeleteEntry.addActionListener(this::btnDeleteEntryActionPerformed);
        btnRecordMood.setText("Record Mood");
        btnRecordMood.addActionListener(this::btnRecordMoodActionPerformed);
        btnMentalHealthMenu.setText("Mental Health Menu");
        btnMentalHealthMenu.addActionListener(this::btnMentalHealthMenuActionPerformed);
        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(this::btnMainMenuActionPerformed);
        tblEntries.setRowHeight(30);
        tblEntries.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] {"Date", "Mood", "Stress"}) {
            public boolean isCellEditable(int row, int column) { return false; }
            public Class<?> getColumnClass(int column) { return String.class; }
        });
        scrEntries.setViewportView(tblEntries);
        txtSearchDate.addActionListener(this::txtSearchDateActionPerformed);

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
            .addComponent(lblSearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(txtSearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE)
            .addGap(12, 12, 12)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(8, 8, 8)
            .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
            .addComponent(scrEntries, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
            .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(btnRecordMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, Short.MAX_VALUE)
            .addComponent(btnDeleteEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addComponent(btnMentalHealthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, Short.MAX_VALUE)
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
            .addComponent(lblSearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(8, 8, 8)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(txtSearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(scrEntries, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
            .addGap(12, 12, 12)
            .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnRecordMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDeleteEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnMentalHealthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button for search
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    }//GEN-LAST:event_btnSearchActionPerformed

    // button for show all
    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
    }//GEN-LAST:event_btnShowAllActionPerformed

    // button for delete entry
    private void btnDeleteEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEntryActionPerformed
        GUI_ConfirmDelete confirmation = new GUI_ConfirmDelete(this, true);
        confirmation.setLocationRelativeTo(this);
        confirmation.setVisible(true);
    }//GEN-LAST:event_btnDeleteEntryActionPerformed

    // button for record mood
    private void btnRecordMoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordMoodActionPerformed
        GUI_RecordMood nextScreen = new GUI_RecordMood();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRecordMoodActionPerformed

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

    // search date
    private void txtSearchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDateActionPerformed
    }//GEN-LAST:event_txtSearchDateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteEntry;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnMentalHealthMenu;
    private javax.swing.JButton btnRecordMood;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblPreview;
    private javax.swing.JLabel lblSearchDate;
    private javax.swing.JLabel lblSectionTitle;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JScrollPane scrEntries;
    private javax.swing.JTable tblEntries;
    private javax.swing.JTextField txtSearchDate;
    // End of variables declaration//GEN-END:variables
}
