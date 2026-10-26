package com.mycompany.jogo.classes;

/**
 *
 * @author Bryan
 */
public class Rocha {
    
    private String nome_roc;
    private int material;
    private double tamanho;
    private double dureza;
    private double quantidade;
    private double valor;

    public Rocha(String nome_roc, int material, double tamanho, double dureza, double quantidade, double valor) {
        this.nome_roc = nome_roc;
        this.material = material;
        this.tamanho = tamanho;
        this.dureza = dureza;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rocha{");
        sb.append("nome_roc=").append(nome_roc);
        sb.append(", material=").append(material);
        sb.append(", tamanho=").append(tamanho);
        sb.append(", dureza=").append(dureza);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }

    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome_roc() {
        return nome_roc;
    }

    public void setNome_roc(String nome_roc) {
        this.nome_roc = nome_roc;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getDureza() {
        return dureza;
    }

    public void setDureza(double dureza) {
        this.dureza = dureza;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
