package com.mycompany.jogo.classes;

/**
 *
 * @author Bryan
 */
public class Ambiente {
    
    private String nome_amb;
    private int id_amb;
    private String descricao;
    private String minerios;
    private int nivel_min;

    public Ambiente(String nome_amb, int id_amb, String descricao, String minerios, int nivel_min) {
        this.nome_amb = nome_amb;
        this.id_amb = id_amb;
        this.descricao = descricao;
        this.minerios = minerios;
        this.nivel_min = nivel_min;
    }

    public Ambiente(String nome_amb, int id_amb, String descricao) {
        this.nome_amb = nome_amb;
        this.id_amb = id_amb;
        this.descricao = descricao;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ambiente{");
        sb.append("nome_amb=").append(nome_amb);
        sb.append(", id_amb=").append(id_amb);
        sb.append(", descricao=").append(descricao);
        sb.append(", minerios=").append(minerios);
        sb.append(", nivel_min=").append(nivel_min);
        sb.append('}');
        return sb.toString();
    }

    
    
    public int getNivel_min() {
        return nivel_min;
    }

    public void setNivel_min(int nivel_min) {
        this.nivel_min = nivel_min;
    }

    public String getNome_amb() {
        return nome_amb;
    }

    public void setNome_amb(String nome_amb) {
        this.nome_amb = nome_amb;
    }

    public int getId_amb() {
        return id_amb;
    }

    public void setId_amb(int id_amb) {
        this.id_amb = id_amb;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMinerios() {
        return minerios;
    }

    public void setMinerios(String minerios) {
        this.minerios = minerios;
    }
    
    
    
}
