package br.com.fiapride.model;

// Classe que representa o equipamento da academia
public class PuxadaArticulada {

    // Atributos protegidos (encapsulamento)
    private String estrutura;
    private double cargaAtualKG;

    // Getters e Setters
    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public double getCargaAtualKG() {
        return cargaAtualKG;
    }

    public void setCargaAtualKG(double cargaAtualKG) {
        this.cargaAtualKG = cargaAtualKG;
    }

    // Métodos (comportamentos)

    public void aumentarCarga(double peso) {
        cargaAtualKG += peso;
        System.out.println("Carga aumentada para: " + cargaAtualKG + " KG");
    }

    public void diminuirCarga(double peso) {
        cargaAtualKG -= peso;
        System.out.println("Carga diminuída para: " + cargaAtualKG + " KG");
    }

    public void mostrarInformacoes() {
        System.out.println("Estrutura: " + estrutura);
        System.out.println("Carga atual: " + cargaAtualKG + " KG");
    }
}