package br.com.bytebank.banco.test.util;

import java.util.ArrayList;


import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 22);
		Conta cc3 = new ContaCorrente(22, 22);
		
		lista.add(cc1);
		
		System.out.println(lista.contains(cc3));
		
				for(Conta conta : lista) {
			System.out.println(conta);
		}	
		
	}
}
