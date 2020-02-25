package com.mitocode.ejercicio5.referencias.metodos;

public class Programa1 {

	static void referenciaMetodosStatic() {
		System.out.println("Metodo static");
	}

	public static void main(String[] args) {

		IOperacion op1 = () -> {
			int x = 5;
			int y = 3;
			System.out.println("# Hojas: " + (x + y));
		};
		op1.imprimir();

		// Referenciar a un metodo static
		IOperacion op2 = () -> Programa1.referenciaMetodosStatic();
		op2.imprimir();

		// Simplificado
		IOperacion op3 = Programa1::referenciaMetodosStatic;
		op3.imprimir();

	}
}