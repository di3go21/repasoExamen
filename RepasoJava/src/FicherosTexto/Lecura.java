package FicherosTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecura {

	public static void main(String[] args) {
		
		//sin buffer

		File miArchivo = new File("diego/fichero.txt");
		int carac;
		try {
			FileReader lector = new FileReader(miArchivo);
			carac=lector.read();
			while(carac!=-1) {
				System.out.print((char)carac);
				carac=lector.read();
			}
			
			lector.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		//con buffer
		System.out.println("CON BUFFER ########################");
		
		FileReader lector;
		String texto;
		try {
			lector = new FileReader(miArchivo);
			BufferedReader lectorBuffer = new BufferedReader(lector);
			texto=lectorBuffer.readLine();
			while (texto!=null) {
				System.out.println(texto);
				texto=lectorBuffer.readLine();
			}
			lectorBuffer.close();
			lector.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}