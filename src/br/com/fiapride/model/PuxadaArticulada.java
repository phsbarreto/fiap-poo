package br.com.fiapride.model;

// Aula 6 (extends) e Aula 9 (implements)
public class PuxadaArticulada extends MaquinaAcademia implements Ajustavel {

    // Aula 3 - Atributos com modificadores de acesso (private)
    private String estrutura;
    private double cargaAtualKG;
    
    // Aula 5 - Associação entre classes (A máquina TEM-UM Plano de Manutenção)
    private PlanoManutencao manutencao;

    // Aula 4 - Construtor customizado para inicializar objetos
    public PuxadaArticulada(String grupoMuscular, String estrutura, PlanoManutencao manutencao) {
        super(grupoMuscular); // Aula 6 - Uso de super()
        this.estrutura = estrutura;
        this.cargaAtualKG = 0;
        this.manutencao = manutencao;
    }

    // Aula 3 - Getters e Setters implementados com validação
    public String getEstrutura() {
        return estrutura;
    }

    public double getCargaAtualKG() {
        return cargaAtualKG;
    }

    public void aumentarCarga(double peso) {
        if (peso > 0) {
            cargaAtualKG += peso;
            System.out.println("Carga aumentada. Progresso atual: " + cargaAtualKG + " KG");
        }
    }

    public void diminuirCarga(double peso) {
        if (peso > 0 && cargaAtualKG >= peso) {
            cargaAtualKG -= peso;
            System.out.println("Carga diminuída. Total atual: " + cargaAtualKG + " KG");
        }
    }

    // Aula 7 - Sobrescrita nas subclasses com @Override
    @Override
    public void mostrarInformacoes() {
        System.out.println("Foco Muscular: " + this.grupoMuscular);
        System.out.println("Estrutura: " + this.estrutura);
        System.out.println("Carga atual: " + this.cargaAtualKG + " KG");
        System.out.println("Status Manutenção: " + (this.manutencao.isAprovadoParaUso() ? "Liberada" : "Em Revisão"));
    }

    // Método obrigatório da interface
    @Override
    public void ajustarAssento(int nivel) {
        System.out.println("Assento da puxada ajustado para o nível biomecânico " + nivel + ".");
    }
}