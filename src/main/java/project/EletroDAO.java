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
public class EletroDAO {
    public static boolean flag = false;
    public static void lancarEletro(String marca, String modelo, int preco, int quantidade, String descricao, String imagem, int precoaquisicao, String notaprocel){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/eletroDB.db");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO eletro(marca, modelo, preco,"
                    + "quantidade, descricao, imagem, precoaquisicao, notaprocel) VALUES(?,?,?,?,?,?,?,?)");
            
            ps.setString(1, marca);
            ps.setString(2, modelo);
            ps.setInt(3, preco);
            ps.setInt(4, quantidade);
            ps.setString(5, descricao);
            ps.setString(6, imagem);
            ps.setInt(7, precoaquisicao);
            ps.setString(8, notaprocel);
            
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Registro efetivado!");
            
        } catch (SQLException ex) {
            Logger.getLogger(HidraulicaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    public static void atualizarEletro(String modelo, int quantidade){
         try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/eletroDB.db");
            
            PreparedStatement ps = con.prepareStatement("UPDATE eletro SET quantidade=? WHERE modelo=?");
            
            ps.setInt(1, quantidade);
            ps.setString(2, modelo);
            
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Produto não existe!");
            else if(ps.executeUpdate()==1 && flag){
                JOptionPane.showMessageDialog(null, "Estoque atualizado!");
                flag = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(EletroDAO.class.getName()).log(Level.SEVERE, null, ex);

    }
    }
    
    public static ArrayList<ProductList> populaTabela(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/eletroDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT marca, modelo, preco, quantidade, descricao, imagem, notaprocel FROM eletro");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("marca"),rs.getString("modelo"),
                        rs.getInt("preco"),rs.getInt("quantidade"),rs.getString("descricao"),
                        rs.getString("imagem"),rs.getString("notaprocel"));
                
                list.add(pl);

            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(HidraulicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
    public static ArrayList<ProductList> populaConteudo(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/eletroDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT marca, modelo, preco, quantidade, descricao, imagem, notaprocel FROM eletro ORDER BY id DESC LIMIT 3");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("marca"),rs.getString("modelo"),
                        rs.getInt("preco"),rs.getInt("quantidade"),rs.getString("descricao"),
                        rs.getString("imagem"),rs.getString("notaprocel"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HidraulicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
    public static ArrayList<ProductList> confereEstoque(){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/eletroDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT marca, modelo, preco, quantidade FROM eletro");
            
            ProductList pl;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("marca"),rs.getString("modelo"),
                        0, rs.getInt("quantidade"),null, null, null);
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HidraulicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
       public static void apagar(String modelo){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/eletroDB.db");
            PreparedStatement ps = con.prepareStatement("DELETE FROM eletro WHERE modelo=?");
            ps.setString(1, modelo);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Produto não existe!");
            else
                JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(IluminacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   }
    
    
    
}
