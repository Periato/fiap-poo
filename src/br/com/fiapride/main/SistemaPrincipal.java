package br.com.fiapride.main;

// Importamos a classe Lapis para que o sistema a reconheça
import br.com.fiapride.model.Lapis;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro lapis (Objeto 1)
        Lapis lapis1 = new Lapis();
        lapis1.cor = "Amarelo";
        lapis1.tamanho = 12.0;
        lapis1.pontaAfiada = true;

        // Criando o segundo lapis (Objeto 2)
        Lapis lapis2 = new Lapis();
        lapis2.cor = "Verde";
        lapis2.tamanho = 15.50;
        lapis2.pontaAfiada = true;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Cor do lápis: " + lapis1.cor + " | Tamanho(cm): R$" + lapis1.tamanho + " | Ponta afiada" + lapis1.pontaAfiada);
        System.out.println("Cor do lápis: " + lapis2.cor + " | Tamanho(cm): R$" + lapis2.tamanho + " | Ponta afiada" + lapis2.pontaAfiada);
        
    }
}
