package FicherosBinarios;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lectura {

	public static void main(String[] args) {

		File miArchivo = new File("diego/ficherobinario.bin");

		try {
			FileInputStream fis = new FileInputStream(miArchivo);
			DataInputStream dis = new DataInputStream(fis);

			try {
				while (true) {
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.println(dis.readInt());
				}
			} catch (Exception e) {
				System.out.println("fin del fichero " + e.getMessage());
			}
			dis.close();
			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println("archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
