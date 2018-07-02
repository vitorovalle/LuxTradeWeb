/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JFrame;

//import javax.swing.JPanel;

/**
 *
 * @author Void
 */
public class ClienteDAO {

    public static int lancarCliente(String usuario, String nome, String email, String senha, String cartao) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/clientesDB.db");
//            String tester = "SELECT * FROM userinfo WHERE username = '"+username+"'";
//            Statement stmt = con.createStatement();
//            
//            ResultSet rs = stmt.executeQuery(tester);
//            
//            if(!rs.next()){
//                JOptionPane.showMessageDialog(null,"Username already exist!");
//            }
            String sql = "INSERT INTO cliente"
                                  +"(usuario, nome, email, senha, cartao)"
                                  +"VALUES(?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, usuario);
            ps.setString(2, nome);
            ps.setString(3, email);
            ps.setString(4, senha);
            ps.setString(5, cartao);
            ps.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Signing up successful!");
            JFrame notification = new AvisoCadastro();
            
            
        } catch (SQLException e) {
            if(e.getErrorCode()==19) //Duplicate username
                return 19;
            
            JFrame errorOc = new AlertaErro();
        }
        
        return 0;

    }
    
    public static boolean logar(String usuario, String senha){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/clientesDB.db");
            String check = "SELECT usuario, senha FROM cliente WHERE usuario=? AND senha=?";
            PreparedStatement ps = con.prepareStatement(check);
            
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public static void recuperarSenha(String usuario) throws MessagingException{
        String[] query= new String[2];
        
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/clientesDB.db");
            String check = "SELECT usuario, email, senha FROM cliente WHERE usuario=?";
            PreparedStatement ps = con.prepareStatement(check);
            
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            
           if(rs.next()){
                query[0]=rs.getString("email");
                query[1]=rs.getString("senha");
                
                EsqueceuSenha.Send("vitorovalle","Sivispacemparabellum11",query[0],"Recuperação de senha","Sua senha é : "+query[1]);
                
                AvisoCadastro nf = new AvisoCadastro();
                nf.jLabel7.setText("Um e-mail foi enviado para : "+query[0]);
               
           }
           else{
               AlertaErro foo = new AlertaErro();
               foo.errorMessage.setText("Usuário não localizado");
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}
