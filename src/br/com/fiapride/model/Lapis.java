package br.com.fiapride.model;


public class Lapis {
    // Atributos (Características)
    public String cor;
    public double tamanho;
    public boolean pontaAfiada;

public Lapis(String cor, boolean pontaAfiada) {
    this.cor = cor;
    this.pontaAfiada = false;
    this.tamanho = 0.0;
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
