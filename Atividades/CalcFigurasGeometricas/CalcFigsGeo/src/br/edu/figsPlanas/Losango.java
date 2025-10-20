package br.edu.figsPlanas;

import java.util.Scanner;

public class Losango {
	public double Dia;
	public double dia;
	public double area;
	
	public void recebeDiagonal() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da diagonal maior do Losango:");
		Dia = sc.nextDouble();
	}
	
	public void recebediagonal() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da diagonal menor do Losango:");
		dia = sc.nextDouble();
	}
	
	public void recebeDiagonal(double D) {
		Dia = D;
	}
	
	public void recebediagonal(double d) {
		dia = d;
	}

	public void retornaDiagonal() {
		System.out.println("A diagonal maior do Losango é:" + Dia);
	}
	
	public void retornadiagonal() {
		System.out.println("A diagonal menor do Losango é:" + dia);
	}
	
	public void retornaArea() {
		System.out.println("A area do Losango é:" + area);
	}
	
	
	public void ListaAtributos() {
		System.out.println("A diagonal maior do Losango é:" + Dia);
		System.out.println("A diagonal maior do Losango é:" + dia);
		System.out.println("A area do Losango é:" + area);
		System.out.println("-------------------------------------");
	}

	public void CalcArea() {
		
	area = (Dia*dia)/2;
	System.out.println("Area: " + area);
	}
}
