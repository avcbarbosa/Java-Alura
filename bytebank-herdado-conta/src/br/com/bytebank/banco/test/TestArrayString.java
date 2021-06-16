package br.com.bytebank.banco.test;

public class TestArrayString {

	public static void main(String[] args) {

		System.out.println("Funcionou!!");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		
		System.out.println(getParteCompetencia("201512", "mes"));
//		System.out.println(getParteCompetencia(-12345678));
	}

	public static String getParteCompetencia(int data) {
		String texto = String.valueOf(data);
		return texto.substring(0, 4);
	}
	
	public static String getParteCompetencia(String data, String index) {
		
		if(index.equals("ano")) {
			return data.substring(0, 4);
		}

		String substring = data.substring(4, 6);
		System.out.println(substring);
		return substring;
	}
}
