package com.mitocode.ejercicio4.metodos.defecto;


public interface IOperacion {

	int suma(int x, int y);
	
	default void metodoDefecto() {
		System.out.println("Metodo defecto sin parametros:");
	}
	
	default void metodoDefectoconParametros(String operacion) {
		System.out.println("Metodo defecto con parametros:");
	}
	
	default double valorPI() {
		return Math.PI;
	}
	
	default int resta (int x, int y) {
		return x - y;
	}
	
}
