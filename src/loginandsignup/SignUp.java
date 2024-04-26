package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class SignUp extends javax.swing.JFrame {
 
    
    public SignUp() {
        initComponents();
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //criação dos componentes botões labels etc.
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SignUpbtn = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // mudança de cor background e cor da fonte
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMinimumSize(new java.awt.Dimension(380, 570));

        //imagens utilizadas na aplicação
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gustavo\\OneDrive\\Documentos\\NetBeansProjects\\LoginAndSignUp\\src\\Icon\\grandona (1) (1).png")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("SIGN UP");

        fname.setBackground(new java.awt.Color(255, 255, 255));
        fname.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Full name");

        jLabel4.setText("Email");

        emailAddress.setBackground(new java.awt.Color(255, 255, 255));
        emailAddress.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setText("Password");

        SignUpbtn.setBackground(new java.awt.Color(0, 102, 102));
        SignUpbtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpbtn.setText("Sign Up");
        SignUpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpbtnActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("I've an account");
        btnLogin.setActionCommand("Login\n");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(fname)
                            .addComponent(jLabel4)
                            .addComponent(emailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(SignUpbtn)
                                .addGap(37, 37, 37)
                                .addComponent(btnLogin))
                            .addComponent(password))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpbtn)
                    .addComponent(btnLogin))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 10, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       Login LoginFrame = new Login();
       LoginFrame.setVisible(true);
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);
       this.dispose();
    
    }//GEN-LAST:event_btnLoginActionPerformed

    private void SignUpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpbtnActionPerformed
        // conexão com o banco de dados
       
       String fullName,email,pwd,query;
       
       String SUrl,SUser,SPass;
       //constantes  facilitar manutenção
       Final String host = "3307"; 
       Final String dataBase = "mydb";
       SUrl = "jdbc:mysql://localhost:'"+host+"'/'"+dataBase+"'";
       SUser = "root";
       SPass = "";
        
       try{
       //conexão 
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection(SUrl,SUser, SPass);
       Statement st = con.createStatement();

       if("".equals(fname.getText()))
       {
           //invoca painel jframe , caso o usuário não coloque a resposta necessária
           JOptionPane.showMessageDialog(new JFrame(), "Nome completo é necessário", "Error", JOptionPane.ERROR_MESSAGE);
       }else if("".equals(emailAddress.getText()))
       {
           JOptionPane.showMessageDialog(new JFrame(), "Endereço de e-mail é necessário", "Error", JOptionPane.ERROR_MESSAGE);
       }else if("".equals(password.getText()))
       {
           JOptionPane.showMessageDialog(new JFrame(), "Senha é necessária", "Error", JOptionPane.ERROR_MESSAGE);
       } else {
           fullName = fname.getText();
           email = emailAddress.getText();
           pwd = password.getText();
           //inserção dos atributos do usuário no banco de dados
           query = "INSERT INTO login(email,pwd,fullname)" + "VALUES('"+email+"','"+pwd+"','"+fullName+"')";
           st.execute(query);
           fname.setText("");
           emailAddress.setText("");
           password.setText("");
           JOptionPane.showMessageDialog(null,"Conta criada com sucesso!");
           
       }
       
     
       }catch(Exception e) {System.out.println(e.getMessage());}
    }//GEN-LAST:event_SignUpbtnActionPerformed

    

        
      
                                             

   //Variáveis dos componentes JFrame
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpbtn;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
