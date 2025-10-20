package br.edu.figsPlanas;

import java.util.Scanner;

public class Hexagono {
	public double lado;
	public double area;
	
	public void recebeLado() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor do lado do Hexagono:");
		lado = sc.nextDouble();
	}
	
	public void recebeLado(double l) {
		lado = l;
	}
	
	public void retornaLado() {
		System.out.println("O lado do Hexagono é:" + lado);
	}
	
	public void retornaArea() {
		System.out.println("A area do Hexagono é:" + area);
	}
	
	public void CalcArea () {
		area = (3 *(Math.pow(lado, 2)) * (Math.sqrt(3)))/2;
		System.out.println("Area: " + area);
	}
	
		
		public void ListaAtributos() {
			System.out.println("O lado do Hexagono é:" + lado);
			System.out.println("A area do Hexagono é:" + area);
			System.out.println("-------------------------------------");
	}
}
