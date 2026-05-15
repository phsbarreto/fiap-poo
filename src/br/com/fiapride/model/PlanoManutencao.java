package br.com.fiapride.model;

// Aula 5 - Nova classe criada para associação
public class PlanoManutencao {
    private String dataUltimaRevisao;
    private boolean aprovadoParaUso;

    public PlanoManutencao(String dataUltimaRevisao, boolean aprovadoParaUso) {
        this.dataUltimaRevisao = dataUltimaRevisao;
        this.aprovadoParaUso = aprovadoParaUso;
    }

    public String getDataUltimaRevisao() {
        return dataUltimaRevisao;
    }

    public boolean isAprovadoParaUso() {
        return aprovadoParaUso;
    }
}