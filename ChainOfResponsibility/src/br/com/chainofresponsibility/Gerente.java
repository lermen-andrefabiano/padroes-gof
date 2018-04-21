package br.com.chainofresponsibility;

public class Gerente extends TomadaDeDecisao {

	@Override
	public void aprova(Compra compra) {
		if (compra.getValor() < 1000) {
			System.out.println("Compra aprovada pelo Gerente");
			
		} else if (sucessor != null) {
			sucessor.aprova(compra);

		}

	}

}
