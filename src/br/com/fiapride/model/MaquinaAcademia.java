package br.com.fiapride.model;

// Aula 8 - Classe mãe como abstract class
public abstract class MaquinaAcademia {
    
    // Atributo com modificador de acesso adequado (protected para filhas - Aula 6)
    protected String grupoMuscular;

    public MaquinaAcademia(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    // Implementação obrigatória nas filhas
    public abstract void mostrarInformacoes();
}