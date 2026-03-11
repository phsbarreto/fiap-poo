package br.com.fiapride.main;

import br.com.fiapride.model.PuxadaArticulada;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Instância 1
        PuxadaArticulada minhaPuxadaArticulada = new PuxadaArticulada();
        minhaPuxadaArticulada.Estrutura = "Ferro";
        minhaPuxadaArticulada.cargaAtualKG = 100;

        // Instância 2
        PuxadaArticulada puxadaArticuladaDoPedro = new PuxadaArticulada();
        puxadaArticuladaDoPedro.Estrutura = "Ferro";
        puxadaArticuladaDoPedro.cargaAtualKG = 80;

        // Usando os métodos
        minhaPuxadaArticulada.aumentarCarga(10);
        puxadaArticuladaDoPedro.diminuirCarga(5);

        // Mostrando informações
        System.out.println("\n--- Minha Máquina ---");
        minhaPuxadaArticulada.mostrarInformacoes();

        System.out.println("\n--- Máquina do Pedro ---");
        puxadaArticuladaDoPedro.mostrarInformacoes();
    }
}