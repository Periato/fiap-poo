package br.com.fiapride.model;


public class Lapis {
    // Atributos (Características)
    private String cor;
    private double tamanho;
    private boolean pontaAfiada;

public Lapis(String cor, boolean pontaAfiada) {
    this.cor = cor;
    this.pontaAfiada = false;
    this.tamanho = 0.0;

public Lapis(boolean pontaAfiada) {
    this.pontaAfiada = false;
    System.out.println("Registro inicial: A ponta" + this.pontaAfiada);
}
}
public String getCor() {
    return cor;
}

public double getTamanho() {
    return tamanho;
}

public boolean isPontaAfiada() {
    return pontaAfiada;
}

public void setCor(String cor) {
    this.cor = cor;
}

public void setTamanho(double tamanho) {
    if (tamanho < 0.0 || tamanho > 19.0) {
        System.out.println("Tamanho inválido! O lápis deve ter entre 0 e 19 cm.");
        return;
    }
    this.tamanho = tamanho;
}

public void setPontaAfiada(boolean pontaAfiada) {
    this.pontaAfiada = pontaAfiada;
}
    
public void apontarPonta() {
    this.pontaAfiada = true;
    System.out.println("A ponta está afiada");
}

public void desenhar() {
    if (!cor.equals("grafite")) {
        System.out.println("O lápis é de desenhar");
        return;
    }
    System.out.println("O lápis é de escrever");
}
