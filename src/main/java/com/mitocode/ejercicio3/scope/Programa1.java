package com.mitocode.ejercicio3.scope;

public class Programa1 {

	// Variable global o  atributos
	int entero;
	float flotante;
	double decimal;
	String cadena;
	boolean estado;
	

	public void variablesGlobales() {
		System.out.println("int = " + entero);
		System.out.println("float = " + flotante);
		System.out.println("double = " + decimal);
		System.out.println("string = " + cadena);
		System.out.println("boolean = " + estado);
	}
	
	public void variablesLocales() {
// 		Variables locales -> Necesitan ser inicializadas con un valor
		int entero2 = 10;
		double decimal2 = 4.2;
		System.out.println("int = " + entero2);
		System.out.println("int = " + decimal2);
	}

	public static void main(String[] args) {
		Programa1 p = new Programa1();
		p.variablesGlobales();
	}
}
