package br.com.chainofresponsibility;

public class Diretor extends TomadaDeDecisao {

	@Override
	public void aprova(Compra compra) {
		if (compra.getValor() < 10000) {
			System.out.println("Compra aprovada pelo Diretor");

		} else if (sucessor != null) {
			sucessor.aprova(compra);

		}

	}

}
