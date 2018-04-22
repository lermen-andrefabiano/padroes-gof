package br.com.adapter;

public class AdapterEuaToBrasil extends TomadaBrasileira {

	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + super.getNomeRede();
	}

}
