package br.com.strategy;

public class Vector {

	private AlgoritmoOrdenacao algoritmoOrdenacao;
	
	public void ordena() {
		this.algoritmoOrdenacao.sort();
	}

	public Vector(AlgoritmoOrdenacao algoritmoOrdenacao) {
		this.algoritmoOrdenacao = algoritmoOrdenacao;
	}

	public AlgoritmoOrdenacao getAlgoritmoOrdenacao() {
		return algoritmoOrdenacao;
	}

	public void setAlgoritmoOrdenacao(AlgoritmoOrdenacao algoritmoOrdenacao) {
		this.algoritmoOrdenacao = algoritmoOrdenacao;
	}

}
