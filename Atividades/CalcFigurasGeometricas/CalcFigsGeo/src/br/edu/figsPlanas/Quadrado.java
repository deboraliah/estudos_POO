package br.edu.figsPlanas;

import java.util.Scanner;

public class Quadrado {
	
	public double lado;
	public double area;
	
	public void recebeLado() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor do lado do quadrado:");
		lado = sc.nextDouble();
	}
	
	public void recebeAltura(double l) {
		lado = l;
	}
	
	public void retornaLado() {
		System.out.println("O lado do quadrado é:" + lado);
	}
	
	public void retornaArea() {
		System.out.println("A area do quadrado é:" + area);
	}
	
	public void CalcArea () {
		area = Math.pow(lado, 2);
		System.out.println("Area: " + area);
	}
	
	public void ListaAtributos() {
		System.out.println("O lado do quadrado é:" + lado);
		System.out.println("A area do quadrado é:" + area);
		System.out.println("-------------------------------------");
	}
	
}
