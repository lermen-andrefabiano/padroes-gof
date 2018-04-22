package br.com.adapter;

public class PlugBrasileiro extends Plug {

	@Override
	public String obtemEletricidade() {
		return "Plug brasileiro conectado à ";
	}

}
