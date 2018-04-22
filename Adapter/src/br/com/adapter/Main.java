package br.com.adapter;

public class Main {

	public static void main(String[] args) {

		TomadaBrasileira tomadaBrasileira = new TomadaBrasileira();
		PlugAmericano plugAmericano = new PlugAmericano();

		// tomadaBrasileira.conecta(plugAmericano);

		AdapterEuaToBrasil adapterEuaToBrasil = new AdapterEuaToBrasil();
		String s = adapterEuaToBrasil.conecta(plugAmericano);

		System.out.println(s);

	}

}
