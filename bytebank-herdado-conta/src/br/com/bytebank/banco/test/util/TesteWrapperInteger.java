package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		Integer idadeRef = 29; //autoboxinng, � criado um objeto do tipo Integer
		int primitivo = new Integer(21); //que loucura!! unboxing
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); //ok
		lista.add(primitivo); //autoboxing
		
		int i1 = lista.get(0); //unboxing
		Integer i2 = lista.get(1); //ok
		
		System.out.println(i1);
		System.out.println(i2);
		
		Integer valorRef = Integer.valueOf(33); // delegando a cria��o para m�todo valueOf
		int valorPri = valorRef.intValue(); // desembrulhando, pegando o valor primitivo do objeto wrapper
		
		System.out.println(valorPri); //33
		
		Integer iParseado1 = Integer.parseInt("42");
		int iParseado2 = Integer.parseInt("44");
		
		System.out.println(iParseado2);
		System.out.println(iParseado1);
		
		System.out.println(Integer.MAX_VALUE); // 2^31 -1
		System.out.println(Integer.MIN_VALUE); //-2^31
		
		System.out.println(Integer.SIZE); //32bits
		System.out.println(Integer.BYTES); //4 bytes
	}

}
