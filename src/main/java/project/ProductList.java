/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Void
 */
public class ProductList {
    private String marca;
    private String modelo;
    private int preco;
    private int quantidade;
    private String descricao;
    private String imagem;
    private String notaprocel;

    public ProductList(String marca, String modelo, int preco, int quantidade, String descricao, String imagem, String notaprocel) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.imagem = imagem;
        this.notaprocel = notaprocel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        //return new ImageIcon(new ImageIcon(imagem).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    public String getNotaProcel() {
        return notaprocel;
    }
    
    public void setNotaProcel(String notaprocel){
        this.notaprocel = notaprocel;
    }
    
    
    
}
