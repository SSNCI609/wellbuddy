package wellbuddy;

/** Single application entry point used by the NetBeans Run Project button. */
public class WellBuddyApp {
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WellBuddyApp.class.getName())
                    .log(java.util.logging.Level.WARNING, "Using default appearance", ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            GUI_Home home = new GUI_Home();
            home.setLocationRelativeTo(null);
            home.setVisible(true);
        });
    }
}
