package FicherosBinarios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Escritura {
	
public static void main(String[] args) {
	
	File miArchivo = new File("diego/ficherobinario.bin");
	
	try {
		FileOutputStream fos = new FileOutputStream(miArchivo,true);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("juan diego");
		dos.writeUTF("leiva Contreras");
		dos.writeInt(29);
		dos.close();
		fos.close();
		
	} catch (FileNotFoundException e) {
		System.out.println("archivo no encontrado");
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	
}
}
