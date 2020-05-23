package Serializacion;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lectura {
	
	public static void main(String[] args) {
		
		File miArchivo = new File("diego/objetos.obj");
		
		try {
			FileInputStream fis= new FileInputStream(miArchivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			MiObjeto obj;
			try {
				while(true) {
					obj=(MiObjeto)ois.readObject();
					System.out.println(obj.toString());
				}
				
			} catch (EOFException e) {
			}
			
			
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
