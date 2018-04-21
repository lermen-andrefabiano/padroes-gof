package br.com.chainofresponsibility;

public class VicePresidente extends TomadaDeDecisao{

	@Override
	public void aprova(Compra compra) {
		if (compra.getValor() < 30000) {
			System.out.println("Compra aprovada pelo Vice Presidente");

		} else if (sucessor != null) {
			sucessor.aprova(compra);

		}
		
	}

}
