package funções;

import java.util.Locale;
import java.util.Scanner;

public class funções {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		double preço = 0.0;
		
		System.out.println("Entre com o valor do produto: ");
		preço = leia.useLocale(ponto).nextDouble();
        
		System.out.println(RetornaCalculo(preço));
		
		
		
		
		
		
		
		
		leia.close();
	}
	static String RetornaCalculo(double preço) {
		double preçoComImposto = preço + (preço * 0.05);
		double preçoDeVenda = preçoComImposto+ (preçoComImposto * 0.40);
		return "Preço final do protudo: "+preçoDeVenda;
	}
}
