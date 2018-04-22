package br.com.facade;

public class Facade {

	private SubSistemaUm sistemaUm;

	private SubSistemaDois sistemaDois;

	private SubSistemaTres sistemaTres;

	public Facade() {
		sistemaUm = new SubSistemaUm();
		sistemaDois = new SubSistemaDois();
		sistemaTres = new SubSistemaTres();
	}

	public void metodoUm() {
		sistemaUm.metodoUm();
		sistemaDois.metodoDois();
		sistemaTres.metodoTres();
	}

	public void metodoDois() {
		sistemaTres.metodoTres();
		sistemaDois.metodoDois();
		sistemaUm.metodoUm();

	}

}
