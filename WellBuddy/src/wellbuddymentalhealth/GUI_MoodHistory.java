/*
 * shane smyth
 * 
 */
package wellbuddymentalhealth;

public class GUI_MoodHistory extends javax.swing.JFrame {
    
    public GUI_MoodHistory() {
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
        btnViewEntry = new javax.swing.JButton();
        btnMentalHealthMenu = new javax.swing.JButton();
        btnRecordMood = new javax.swing.JButton();
        txtSearchDate = new javax.swing.JTextField();
        scrHistory = new javax.swing.JScrollPane();
        tblEntries = new javax.swing.JTable();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WellBuddy - Mood History");

        lblAppTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAppTitle.setText("WellBuddy");

        lblSectionTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSectionTitle.setText("Mood History");

        lblPreview.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblPreview.setText("View your recorded mood entries.");

        lblSearchDate.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblSearchDate.setText("Search date (DD/MM/YYYY)");

        lblStatus.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblStatus.setText("Entries");

        lblHint.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblHint.setText("Select an entry, then choose View Entry.");

        btnSearch.setText("Search");
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(this::btnShowAllActionPerformed);

        btnViewEntry.setText("View Entry");
        btnViewEntry.addActionListener(this::btnViewEntryActionPerformed);

        btnMentalHealthMenu.setText("Mental Health Menu");
        btnMentalHealthMenu.addActionListener(this::btnMentalHealthMenuActionPerformed);

        btnRecordMood.setText("Record Mood");
        btnRecordMood.addActionListener(this::btnRecordMoodActionPerformed);

        txtSearchDate.setToolTipText("Enter an exact date, for example 10/11/2026");
        txtSearchDate.addActionListener(this::txtSearchDateActionPerformed);
        tblEntries.setRowHeight(30);
        tblEntries.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {"Date", "Mood", "Stress"}
        ) {
            Class[] types = new Class[] {String.class, String.class, String.class};
            boolean[] canEdit = new boolean[] {false, false, false};
            public Class getColumnClass(int columnIndex) { return types[columnIndex]; }
            public boolean isCellEditable(int rowIndex, int columnIndex) { return canEdit[columnIndex]; }
        });
        scrHistory.setViewportView(tblEntries);
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
            .addComponent(txtSearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, Short.MAX_VALUE)
            .addGap(12, 12, 12)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(8, 8, 8)
            .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 592, Short.MAX_VALUE)
            .addComponent(scrHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 592, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, Short.MAX_VALUE)
            .addComponent(btnViewEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addComponent(btnMentalHealthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, Short.MAX_VALUE)
            .addComponent(btnRecordMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(scrHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnViewEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnMentalHealthMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnRecordMood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button for search
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    }//GEN-LAST:event_btnSearchActionPerformed
    // search date
    private void txtSearchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDateActionPerformed
    }//GEN-LAST:event_txtSearchDateActionPerformed
    // button for show all
    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
    }//GEN-LAST:event_btnShowAllActionPerformed
    // button for view entry
    private void btnViewEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEntryActionPerformed
        GUI_EntryDetails detailsScreen = new GUI_EntryDetails();
        detailsScreen.setLocationRelativeTo(this);
        detailsScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewEntryActionPerformed
    // button to mental health menu
    private void btnMentalHealthMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMentalHealthMenuActionPerformed
        GUI_MoodManager nextScreen = new GUI_MoodManager();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMentalHealthMenuActionPerformed
    // button for record mood
    private void btnRecordMoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordMoodActionPerformed
        GUI_RecordMood nextScreen = new GUI_RecordMood();
        nextScreen.setLocationRelativeTo(this);
        nextScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRecordMoodActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMentalHealthMenu;
    private javax.swing.JButton btnRecordMood;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnViewEntry;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblPreview;
    private javax.swing.JLabel lblSearchDate;
    private javax.swing.JLabel lblSectionTitle;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JScrollPane scrHistory;
    private javax.swing.JTable tblEntries;
    private javax.swing.JTextField txtSearchDate;
    // End of variables declaration//GEN-END:variables
}
