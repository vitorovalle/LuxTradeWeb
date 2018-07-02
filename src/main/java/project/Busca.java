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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Void
 */
public class Busca {
    static int iluminacao = 0;
    static int hidraulica = 0;
    static int eletro = 0;
    public static ArrayList<ProductList> buscaGeral(String modelo){
        ArrayList<ProductList> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/iluminacaoDB.db");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM iluminacao WHERE marca=? COLLATE NOCASE OR modelo=? COLLATE NOCASE");
            ps.setString(1, modelo);
            ps.setString(2, modelo);
            ResultSet rs = ps.executeQuery();
            
            ProductList pl, gl, kl=null;
            
            while(rs.next()){
                pl = new ProductList(rs.getString("marca"),rs.getString("modelo"),
                        rs.getInt("preco"),rs.getInt("quantidade"),rs.getString("descricao"),
                        rs.getString("imagem"),rs.getString("notaprocel"));
                iluminacao++;
                
                list.add(pl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:sqlite:DBs/hidraulicaDB.db");
            ps = con.prepareStatement("SELECT * FROM hidraulica WHERE marca=? COLLATE NOCASE OR modelo=? COLLATE NOCASE");
            ps.setString(1, modelo);
            ps.setString(2, modelo);
            rs = ps.executeQuery();

            
            while(rs.next()){
                gl = new ProductList(rs.getString("marca"),rs.getString("modelo"),
                        rs.getInt("preco"),rs.getInt("quantidade"),rs.getString("descricao"),
                        rs.getString("imagem"),rs.getString("notaprocel"));
                hidraulica++;
                list.add(gl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:sqlite:DBs/eletroDB.db");
            ps = con.prepareStatement("SELECT * FROM eletro WHERE marca=? COLLATE NOCASE OR modelo=? COLLATE NOCASE");
            ps.setString(1, modelo);
            ps.setString(2, modelo);
            rs = ps.executeQuery();

            
            while(rs.next()){
                kl = new ProductList(rs.getString("marca"),rs.getString("modelo"),
                        rs.getInt("preco"),rs.getInt("quantidade"),rs.getString("descricao"),
                        rs.getString("imagem"),rs.getString("notaprocel"));
                eletro++;
                list.add(kl);

            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(HidraulicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
}
