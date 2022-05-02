package funções;

import java.util.Locale;
import java.util.Scanner;

public class fuciion {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		
		int idade1, idade2, idade3;
		System.out.println("Entre com as três idades: ");
		idade1 = leia.nextInt();
		idade2 = leia.nextInt();
		idade3 = leia.nextInt();
		
		System.out.println("Sua maior idade foi" + MaiorIdade(idade1, idade2, idade3));
		
		
		leia.close();
	}
	static int MaiorIdade(int a, int b, int c) {
		if(a > b && a > c) {
			return a;
	
		}else if(b > a && b > c) {
			return b;
		}else {
			return c;
		}
	}

}
