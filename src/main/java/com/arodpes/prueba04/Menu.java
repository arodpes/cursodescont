package com.arodpes.prueba04;

public class Menu {

	public static void main(String[] args) {
		int elemento1 = 100;
		int elemento2= 12;
		System.out.println("la suma es " + App.suma(elemento1, elemento2));
		System.out.println("la resta es " + Operaciones.resta(elemento1, elemento2));
		System.out.println("la multiplicación es " + Operaciones.multiplicacion(elemento1, elemento2));
		System.out.println("la división es " + Operaciones.division(elemento1, elemento2));

	}

}
