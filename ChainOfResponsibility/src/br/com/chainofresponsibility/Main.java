package br.com.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		TomadaDeDecisao presidente = new Presidente();
		TomadaDeDecisao vicePresidente = new VicePresidente();
		TomadaDeDecisao diretor = new Diretor();
		TomadaDeDecisao gerente = new Gerente();

		gerente.setSucessor(diretor);
		diretor.setSucessor(vicePresidente);
		vicePresidente.setSucessor(presidente);

		Compra compra = new Compra(500333333d);
		gerente.aprova(compra);
	}

}
