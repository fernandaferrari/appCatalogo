/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fernanda.ferrari
 */
public class Categoria {
    private float idCategoria;
    private String nome;
    private String descricao;

    public Categoria() {}

    public float getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(float idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 
    
    
}
