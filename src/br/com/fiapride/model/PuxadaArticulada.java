package br.com.fiapride.model;

// Classe que representa o equipamento da academia
public class PuxadaArticulada {

    // Atributos (características)
    public String Estrutura;
    public double cargaAtualKG;

    // Métodos (comportamentos)

    // Método para aumentar a carga
    public void aumentarCarga(double peso) {
        cargaAtualKG += peso;
        System.out.println("Carga aumentada para: " + cargaAtualKG + " KG");
    }

    // Método para diminuir a carga
    public void diminuirCarga(double peso) {
        cargaAtualKG -= peso;
        System.out.println("Carga diminuída para: " + cargaAtualKG + " KG");
    }

    // Método para mostrar o estado da máquina
    public void mostrarInformacoes() {
        System.out.println("Estrutura: " + Estrutura);
        System.out.println("Carga atual: " + cargaAtualKG + " KG");
    }
}