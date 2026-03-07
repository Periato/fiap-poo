package br.com.fiapride.main;

// Importamos a classe Lapis para que o sistema a reconheça
import br.com.fiapride.model.Lapis;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro lapis (Objeto 1)
        Lapis lapis1 = new Lapis("Amarelo", false);
        lapis1.setTamanho(12.0);
        lapis1.setPontaAfiada(true);

        // Criando o segundo lapis (Objeto 2)
        Lapis lapis2 = new Lapis("Verde", false);
        lapis2.setTamanho(15.50);
        lapis2.setPontaAfiada(true);

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Cor do lápis: " + lapis1.cor + " | Tamanho(cm): R$" + lapis1.tamanho + " | Ponta afiada" + lapis1.pontaAfiada);
        System.out.println("Cor do lápis: " + lapis2.cor + " | Tamanho(cm): R$" + lapis2.tamanho + " | Ponta afiada" + lapis2.pontaAfiada);

        System.out.println("\n--- Testando a proteção do setTamanho ---");

        // Tentativa 1: valor negativo
        System.out.print("Tentativa com -5.0 cm: ");
        lapis1.setTamanho(-5.0);
        System.out.println("Tamanho atual: " + lapis1.getTamanho() + "cm"); // continua 12.0

        // Tentativa 2: valor absurdamente alto
        System.out.print("Tentativa com 999.0 cm: ");
        lapis1.setTamanho(999.0);
        System.out.println("Tamanho atual: " + lapis1.getTamanho() + "cm"); // continua 12.0

        // Tentativa 3: acesso direto ao atributo (ERRO de compilação)
        lapis1.tamanho = -5.0;

        // Tentativa 4: valor válido — deve funcionar normalmente
        System.out.print("Tentativa com 18.0 cm (válido): ");
        lapis1.setTamanho(18.0);
        System.out.println("Tamanho atual: " + lapis1.getTamanho() + "cm"); // atualiza para 18.0
    }
}
