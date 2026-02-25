
package br.com.fiapride.main;

//Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.PuxadaArticulada;

public class SistemaPrincipal {

 public static void main(String[] args) {
	// Dentro do main...// Fabriquei a primeira (Instância 1)
	 PuxadaArticulada minhaPuxadaArticulada = new PuxadaArticulada();
	 minhaPuxadaArticulada.Estrutura = "Ferro";
	 minhaPuxadaArticulada.cargaAtualKG = 100;
	 // Fabriquei a segunda (Instância 2)
	 PuxadaArticulada puxadaArticuladaDoPedro = new PuxadaArticulada();
	 puxadaArticuladaDoPedro.Estrutura = "Ferro";
	 puxadaArticuladaDoPedro.cargaAtualKG = 100;
	 System.out.println("Minha Puxada Articulada é: " + minhaPuxadaArticulada.Estrutura);
	 System.out.println("A do Pedro é: " + puxadaArticuladaDoPedro.cargaAtualKG);
 }
}