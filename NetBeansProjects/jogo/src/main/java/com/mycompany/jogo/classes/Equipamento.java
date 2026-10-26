package com.mycompany.jogo.classes;

/**
 *
 * @author Bryan
 */
public class Equipamento {
    
    private String nome_equi;
    private int nivel_equi;
    private int id_equi;
    private String tipo;
    private double durabilidade;
    private int encantamento;

    public Equipamento(String nome_equi, int nivel_equi, int id_equi, String tipo, double durabilidade, int encantamento) {
        this.nome_equi = nome_equi;
        this.nivel_equi = nivel_equi;
        this.id_equi = id_equi;
        this.tipo = tipo;
        this.durabilidade = durabilidade;
        this.encantamento = encantamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipamento{");
        sb.append("nome_equi=").append(nome_equi);
        sb.append(", nivel_equi=").append(nivel_equi);
        sb.append(", id_equi=").append(id_equi);
        sb.append(", tipo=").append(tipo);
        sb.append(", durabilidade=").append(durabilidade);
        sb.append(", encantamento=").append(encantamento);
        sb.append('}');
        return sb.toString();
    }
    
    

    public int getEncantamento() {
        return encantamento;
    }

    public void setEncantamento(int encantamento) {
        this.encantamento = encantamento;
    }

    public String getNome_equi() {
        return nome_equi;
    }

    public void setNome_equi(String nome_equi) {
        this.nome_equi = nome_equi;
    }

    public int getNivel_equi() {
        return nivel_equi;
    }

    public void setNivel_equi(int nivel_equi) {
        this.nivel_equi = nivel_equi;
    }

    public int getId_equi() {
        return id_equi;
    }

    public void setId_equi(int id_equi) {
        this.id_equi = id_equi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(double durabilidade) {
        this.durabilidade = durabilidade;
    }
    
    
    
}
