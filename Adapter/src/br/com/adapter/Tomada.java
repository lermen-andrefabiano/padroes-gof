package br.com.adapter;

public abstract class Tomada<T> {
	
	public abstract String conecta(T plug);
	
	public abstract String getNomeRede();

}
