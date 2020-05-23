package FicherosTexto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
	
	public static void main(String[] args) {
		
		File miArchivo= new File("diego/fichero.txt");
		String frase= "Hola mundo esta es mi primera frase";
		
		
		//sin buffer
		System.out.println("SIN BUFFER ########################");
		try {
			FileWriter writer = new FileWriter(miArchivo);
			//FileWriter writer = new FileWriter(miArchivo,true);//sin sobreescribir
			writer.write(frase);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	
		
		
		
		
	}

}
