package com.avanade.decolatech.aplicacao;

public class AppStrings {
	public static void main(String[] args) {
		//motivação: dados primitivos
		int x = 10; // a variável x recebe o valor 10
		boolean b = (x==10); // comparação de valores (conteudo da variavel)
		
		//referencias de string
		String s1 = "Java";
		String s2 = null;
		s2 = "Java";
		
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		boolean b1 = (s1 == s2);
		boolean b2 = (s3 == s4);
		boolean b3 = s3.equals(s4);
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		System.out.println("b3: " + b3);
	}
}
