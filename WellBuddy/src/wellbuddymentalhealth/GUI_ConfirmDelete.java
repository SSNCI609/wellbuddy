/*
 * shane smyth
 * 
 */
package wellbuddymentalhealth;

public class GUI_ConfirmDelete extends javax.swing.JDialog {

    public GUI_ConfirmDelete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblAppTitle = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        lblPreview = new javax.swing.JLabel();
        lblEntry = new javax.swing.JLabel();
        lblNotes = new javax.swing.JLabel();
        lblWarning = new javax.swing.JLabel();
        btnKeepEntry = new javax.swing.JButton();
        btnDeleteEntry = new javax.swing.JButton();
        scrNotes = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WellBuddy - Confirm Deletion");
        setModal(true);
        lblAppTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAppTitle.setText("WellBuddy");
        lblQuestion.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblQuestion.setText("Delete this entry?");
        lblPreview.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblPreview.setText("Choose Keep Entry or Delete Entry.");
        lblEntry.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblEntry.setText("-");
        lblNotes.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblNotes.setText("Daily note");
        lblWarning.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblWarning.setText("Deletion cannot be undone.");
        btnKeepEntry.setText("Keep Entry");
        btnKeepEntry.addActionListener(this::btnKeepEntryActionPerformed);
        btnDeleteEntry.setText("Delete Entry");
        btnDeleteEntry.addActionListener(this::btnDeleteEntryActionPerformed);
        txtNotes.setEditable(false);
        txtNotes.setColumns(30);
        txtNotes.setRows(3);
        txtNotes.setLineWrap(true);
        txtNotes.setWrapStyleWord(true);
        txtNotes.setText("");
        scrNotes.setViewportView(txtNotes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(scrNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
            .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(btnKeepEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, Short.MAX_VALUE)
            .addComponent(btnDeleteEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(24, 24, 24)));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(lblAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(lblPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(22, 22, 22)
            .addComponent(lblEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lblNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(8, 8, 8)
            .addComponent(scrNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
            .addGap(16, 16, 16)
            .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnKeepEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDeleteEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button for keep entry
    private void btnKeepEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeepEntryActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeepEntryActionPerformed

    // button for delete entry
    private void btnDeleteEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEntryActionPerformed
        dispose();
    }//GEN-LAST:event_btnDeleteEntryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteEntry;
    private javax.swing.JButton btnKeepEntry;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JLabel lblEntry;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JLabel lblPreview;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JScrollPane scrNotes;
    private javax.swing.JTextArea txtNotes;
    // End of variables declaration//GEN-END:variables
}
