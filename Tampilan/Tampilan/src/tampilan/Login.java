/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

/**
 *
 * @author nengandini
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        body = new javax.swing.JPanel();
        Gambar = new javax.swing.JPanel();
        Kata1 = new javax.swing.JLabel();
        Kata2 = new javax.swing.JLabel();
        Kata4 = new javax.swing.JLabel();
        Kata3 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        EMAILlabel = new javax.swing.JLabel();
        Passwordlabel = new javax.swing.JLabel();
        Namalebel = new javax.swing.JLabel();
        Garis1 = new javax.swing.JSeparator();
        Garis2 = new javax.swing.JSeparator();
        Garis3 = new javax.swing.JSeparator();
        Password = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        Masuk = new javax.swing.JButton();
        Ceklis = new javax.swing.JCheckBox();
        Admin = new javax.swing.JLabel();
        Surat = new javax.swing.JLabel();
        Gembok = new javax.swing.JLabel();
        Lupalabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(153, 153, 153));
        body.setForeground(new java.awt.Color(0, 0, 51));

        Gambar.setBackground(new java.awt.Color(51, 204, 255));
        Gambar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        Kata1.setFont(new java.awt.Font("AR BERKLEY", 1, 36)); // NOI18N
        Kata1.setText("Shopping");

        Kata2.setFont(new java.awt.Font("AR BERKLEY", 1, 36)); // NOI18N
        Kata2.setText("Will");

        Kata4.setFont(new java.awt.Font("AR BERKLEY", 1, 36)); // NOI18N
        Kata4.setText("Colorful");

        Kata3.setFont(new java.awt.Font("AR BERKLEY", 1, 36)); // NOI18N
        Kata3.setText("Make life more");

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\nengandini\\Downloads\\shopping-cart (4).png")); // NOI18N
        Logo.setIconTextGap(10);

        javax.swing.GroupLayout GambarLayout = new javax.swing.GroupLayout(Gambar);
        Gambar.setLayout(GambarLayout);
        GambarLayout.setHorizontalGroup(
            GambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GambarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Kata3)
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GambarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GambarLayout.createSequentialGroup()
                        .addComponent(Kata1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GambarLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GambarLayout.createSequentialGroup()
                        .addComponent(Kata2)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GambarLayout.createSequentialGroup()
                        .addComponent(Kata4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        GambarLayout.setVerticalGroup(
            GambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GambarLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Logo)
                .addGap(27, 27, 27)
                .addComponent(Kata1)
                .addGap(18, 18, 18)
                .addComponent(Kata2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kata3)
                .addGap(18, 18, 18)
                .addComponent(Kata4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Login.setBackground(new java.awt.Color(255, 102, 102));
        Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Login.setForeground(new java.awt.Color(255, 255, 255));

        EMAILlabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EMAILlabel.setForeground(new java.awt.Color(255, 255, 255));
        EMAILlabel.setText("Email");

        Passwordlabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Passwordlabel.setForeground(new java.awt.Color(255, 255, 255));
        Passwordlabel.setText("Password");

        Namalebel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Namalebel.setForeground(new java.awt.Color(255, 255, 255));
        Namalebel.setText("Name");

        Password.setBackground(new java.awt.Color(255, 102, 102));
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);

        email.setBackground(new java.awt.Color(255, 102, 102));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);

        nama.setBackground(new java.awt.Color(255, 102, 102));
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setBorder(null);

        Masuk.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Masuk.setText("Login");

        Ceklis.setBackground(new java.awt.Color(255, 102, 102));
        Ceklis.setForeground(new java.awt.Color(255, 255, 255));
        Ceklis.setText("Remember me next time");

        Admin.setForeground(new java.awt.Color(255, 255, 255));
        Admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\nengandini\\Downloads\\Sign-Up-02.png")); // NOI18N
        Admin.setIconTextGap(10);

        Surat.setIcon(new javax.swing.ImageIcon("C:\\Users\\nengandini\\Downloads\\Mail 1.png")); // NOI18N

        Gembok.setIcon(new javax.swing.ImageIcon("C:\\Users\\nengandini\\Downloads\\Lock.png")); // NOI18N

        Lupalabel.setForeground(new java.awt.Color(51, 51, 255));
        Lupalabel.setText("FORGOT PASSWORD ?");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Garis1)
                    .addComponent(Garis2)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(Surat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email))
                    .addComponent(Garis3)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(Gembok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(Admin)
                        .addGap(26, 26, 26)
                        .addComponent(nama))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Passwordlabel)
                            .addComponent(EMAILlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Namalebel)
                            .addComponent(Masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addComponent(Ceklis, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lupalabel)))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Namalebel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Admin)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(Garis1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(EMAILlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Surat))
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Garis2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Passwordlabel)
                .addGap(12, 12, 12)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gembok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Garis3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ceklis)
                    .addComponent(Lupalabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin;
    private javax.swing.JCheckBox Ceklis;
    private javax.swing.JLabel EMAILlabel;
    private javax.swing.JPanel Gambar;
    private javax.swing.JSeparator Garis1;
    private javax.swing.JSeparator Garis2;
    private javax.swing.JSeparator Garis3;
    private javax.swing.JLabel Gembok;
    private javax.swing.JLabel Kata1;
    private javax.swing.JLabel Kata2;
    private javax.swing.JLabel Kata3;
    private javax.swing.JLabel Kata4;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Lupalabel;
    private javax.swing.JButton Masuk;
    private javax.swing.JLabel Namalebel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Passwordlabel;
    private javax.swing.JLabel Surat;
    private javax.swing.JPanel body;
    private javax.swing.JTextField email;
    private javax.swing.JTextField nama;
    // End of variables declaration//GEN-END:variables
}
