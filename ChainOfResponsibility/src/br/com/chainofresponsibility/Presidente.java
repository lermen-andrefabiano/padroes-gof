package br.com.chainofresponsibility;

public class Presidente extends TomadaDeDecisao {

	@Override
	public void aprova(Compra compra) {
		if (compra.getValor() < 100000) {
			System.out.println("Compra aprovada pelo Presidente");

		} else {
			System.out.println("Compra não aprovada");

		}

	}

}
