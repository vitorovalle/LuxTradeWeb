/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Void
 */
public class Fatura {
    private int id;
    private String usuario_nome;
    private int valor;
    private String data;

    public Fatura(int id, String usuario_nome, int valor, String data) {
        this.id = id;
        this.usuario_nome = usuario_nome;
        this.valor = valor;
        this.data = data;
    }
    
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuarioNome() {
        return usuario_nome;
    }

    public void setUsuarioNome(String usuario_nome) {
        this.usuario_nome = usuario_nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
