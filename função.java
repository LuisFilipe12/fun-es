package funções;

import java.util.Locale;
import java.util.Scanner;

public class função {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		System.out.println("Entre com a área do triâgunlo: ");
		x = leia.nextInt();
		System.out.println("Entre com a área do triângulo: ");
		y = leia.nextInt();
		System.out.println("Entre com a área do triângulo: ");
		z = leia.nextInt();
		
		System.out.println(AreaDoTriangulo(x, y, z));
		
		
		
		
		leia.close();
	}
    static String AreaDoTriangulo(int x, int y, int z) {
    	double p = (x + y + z) /2;
    	double area = Math.sqrt(p* (p - x) + (p - y) + (p - z));
    	return "O perimetro e a área do triângulo é:" + p + area;
    }
    
    
}
