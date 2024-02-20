package br.com.pyetro;

import java.util.Scanner;

public class Calculadora {
	
	public int adicionar(int a, int b) {
		a = 5;
		b = 6;
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		a = 10;
		b = 4;
		return a-b;
	}
	public int multiplicar(int a, int b) {
		a = 5;
		b = 6;
		return a * b;
	}
	public int dividir(int a, int b) {
		a = 10;
		b = 0;
		if (a == 0 || b == 0) {
			return 0;
		}
		return a/b;
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Calculadora cal = new Calculadora();
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int resultado = cal.dividir(a, b);
//		
//		System.out.print("resultado: " + resultado);
//		
//		
//		
//		sc.close();
//	}

}
