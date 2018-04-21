package br.com.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

	private List<Employee> listaSubordinados = new ArrayList<>();

	public Manager(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void print() {
		System.out.println(super.nome + ", $" + super.salario);

		for (Employee e : listaSubordinados) {
			e.print();
		}

	}

	@Override
	public void add(Employee employee) {
		listaSubordinados.add(employee);

	}

	@Override
	public void remove(Employee employee) {
		listaSubordinados.remove(employee);

	}

}
