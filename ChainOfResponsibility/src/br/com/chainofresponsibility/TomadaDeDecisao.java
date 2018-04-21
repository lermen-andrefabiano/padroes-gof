package br.com.chainofresponsibility;

public abstract class TomadaDeDecisao {

	protected TomadaDeDecisao sucessor;

	public void setSucessor(TomadaDeDecisao sucessor) {
		this.sucessor = sucessor;
	}

	public abstract void aprova(Compra compra);

}
