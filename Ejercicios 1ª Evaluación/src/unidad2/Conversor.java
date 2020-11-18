package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) throws IOException {
		float euros;
		float dolares;
		String linea;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("introduce un numero:");
		linea = in.readLine();
		euros = Float.parseFloat(linea) ;
		dolares = euros * 1.17f;
		System.out.printf("%-15.2f", dolares) ;
		
	}

}
