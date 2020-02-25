package com.mitocode.ejercicio1.lambda.intro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colores = { "negro", "amarillo", "verde", "azul", "violeta" };

		List<String> lista = Arrays.asList(colores);
		
//		Collections.sort(lista);
//		System.out.println("\nLista Ascendente: ");
//		for (String color :lista) {
//			System.out.print(color + " ");
//		}
//		
//		Collections.sort(lista, Collections.reverseOrder());
//	System.out.println("\nLista descendente");
//		for (String color :lista) {
//			System.out.print(color + " ");
//		}
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);//ascendente, con - es descendente
			}
			
		};
//		Collections.sort(lista, Collections.reverseOrder());
//		System.out.println("\nLista descendente");
//			for (String color :lista) {
//				System.out.print(color + " ");
//			}

	}

}
