package br.com.fiapride.main;

import br.com.fiapride.model.PuxadaArticulada;
import br.com.fiapride.model.PlanoManutencao;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criando as associações (Planos de manutenção)
        PlanoManutencao revisaoRecente = new PlanoManutencao("10/05/2026", true);
        PlanoManutencao revisaoAtrasada = new PlanoManutencao("15/01/2026", false);

        // Inicializando pelo construtor (Aula 4)
        PuxadaArticulada minhaPuxadaArticulada = new PuxadaArticulada("Dorsais", "Ferro", revisaoRecente);
        PuxadaArticulada puxadaArticuladaDoPedro = new PuxadaArticulada("Dorsais", "Aço Escovado", revisaoAtrasada);

        System.out.println("=== Configurando o Treino ===");
        minhaPuxadaArticulada.ajustarAssento(3);
        puxadaArticuladaDoPedro.ajustarAssento(5);

        // Usando os métodos
        minhaPuxadaArticulada.aumentarCarga(100);
        minhaPuxadaArticulada.aumentarCarga(10); // Aplicando sobrecarga progressiva
        
        puxadaArticuladaDoPedro.aumentarCarga(85);
        puxadaArticuladaDoPedro.diminuirCarga(5);

        // Mostrando informações
        System.out.println("\n--- Minha Máquina (Filippo) ---");
        minhaPuxadaArticulada.mostrarInformacoes(); // Aula 7 - Teste polimórfico no main

        System.out.println("\n--- Máquina do Pedro ---");
        puxadaArticuladaDoPedro.mostrarInformacoes();
    }
}