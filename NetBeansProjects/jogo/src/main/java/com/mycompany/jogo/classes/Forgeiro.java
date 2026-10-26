package com.mycompany.jogo.classes;

/**
 *
 * @author Bryan
 */
public class Forgeiro {
    
    private String nome;
    private int id;
    private double larp;
    private String especialidade;
    private int nivel;
    private double forca;
    private double velocidade;
    private double capacidade;
    private double energia;

    public Forgeiro(String nome, int id, double larp, String especialidade, int nivel, double forca, double velocidade, double capacidade, double energia) {
        this.nome = nome;
        this.id = id;
        this.larp = larp;
        this.especialidade = especialidade;
        this.nivel = nivel;
        this.forca = forca;
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.energia = energia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Forgeiro{");
        sb.append("nome=").append(nome);
        sb.append(", id=").append(id);
        sb.append(", larp=").append(larp);
        sb.append(", especialidade=").append(especialidade);
        sb.append(", nivel=").append(nivel);
        sb.append(", forca=").append(forca);
        sb.append(", velocidade=").append(velocidade);
        sb.append(", capacidade=").append(capacidade);
        sb.append(", energia=").append(energia);
        sb.append('}');
        return sb.toString();
    }
    
    

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLarp() {
        return larp;
    }

    public void setLarp(double larp) {
        this.larp = larp;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    
    
    
}
