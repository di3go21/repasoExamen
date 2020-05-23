package Serializacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sobreescritura {
	public static void main(String[] args) {
		
	
	File miArchivo = new File("diego/objetos.obj");
	
	
	try {
		FileOutputStream fos = new FileOutputStream(miArchivo,true);
		
		ClaseOutput escObjetos= new ClaseOutput(fos);
		
		escObjetos.writeObject(new MiObjeto("carlos", "leiva", 33, 500));
		escObjetos.writeObject(new MiObjeto("carlos", "jean", 33, 500));
		
		escObjetos.close();
		fos.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	

}
}