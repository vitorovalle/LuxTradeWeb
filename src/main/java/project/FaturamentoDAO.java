/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Void
 */
public class FaturamentoDAO {
    
    public static void lancarFaturamento(String usuario_nome, int valor, String data){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/faturamentoDB.db");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO fatura(usuario_nome, valor, data) VALUES(?,?,?)");
            
            ps.setString(1, usuario_nome);
            ps.setInt(2, valor);
            ps.setString(3, data);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(HidraulicaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    public static ArrayList<Fatura> fatura(){
        ArrayList<Fatura> clientes = new ArrayList<>();
      
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/faturamentoDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT id, usuario_nome, valor, data FROM fatura");
            
            Fatura pl;
            
            while(rs.next()){
                pl = new Fatura(rs.getInt("id"),rs.getString("usuario_nome"),
                        rs.getInt("valor"),rs.getString("data"));
                clientes.add(pl);

            }
        } catch (SQLException ex) {
            Logger.getLogger(HidraulicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
    
    public static ArrayList<Fatura> faturadata(String datainicial, String datafinal){
        ArrayList<Fatura> clientes = new ArrayList<>();
      
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/faturamentoDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT id, usuario_nome, valor, data FROM fatura WHERE data BETWEEN "+datainicial+" AND "+datafinal);
            
            Fatura pl;
            
            while(rs.next()){
                pl = new Fatura(rs.getInt("id"),rs.getString("usuario_nome"),
                        rs.getInt("valor"),rs.getString("data"));
                clientes.add(pl);

            }
        } catch (SQLException ex) {
            Logger.getLogger(HidraulicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
    
    //Deleting billing log
    public static void apagarFatura(){
         try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/faturamentoDB.db");
            PreparedStatement ps = con.prepareStatement("DELETE FROM fatura");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Todos os registros foram removidos!");
            
        } catch (SQLException ex) {
            Logger.getLogger(IluminacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
