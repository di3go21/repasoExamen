package Serializacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escritura {
public static void main(String[] args) {
	File miArchivo = new File("diego/objetos.obj");
	
	try {
		FileOutputStream fos= new FileOutputStream(miArchivo);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		oos.writeObject(new MiObjeto("almu", "asenjo", 26, 200));
		oos.writeObject(new MiObjeto("isabel", "tapia", 50, 500));
		
		oos.close();
		fos.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
