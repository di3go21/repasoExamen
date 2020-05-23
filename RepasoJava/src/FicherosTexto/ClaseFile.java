package FicherosTexto;

import java.io.File;
import java.io.IOException;

public class ClaseFile {

	public static void main(String[] args) {
		//cracion de directorio
		File miDirectorio = new File("diego/");
		System.out.println("creado el directorio: "+miDirectorio.mkdir());
		
		System.out.println("----------------------");
		//fichero
		File miArchivo= new File("diego/fichero.txt");
		System.out.println("creado el directorio: "+miDirectorio.mkdir());
		try {
			System.out.println("creado el fichero" + miArchivo.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("----------------------");
		//rutas y noombre
		System.out.println("nombre del fichero " + miArchivo.getName());
		System.out.println("ruta absoluta del fichero " + miArchivo.getAbsolutePath());
		try {
			System.out.println("ruta del fichero canonical " + miArchivo.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ruta del fichero simple " + miArchivo.getPath());
		
		//metodos de archivo
		System.out.println(".-----------------------");
		System.out.println("existe "+miArchivo.exists());
		System.out.println("se puede escribir "+miArchivo.canWrite());
		System.out.println("se puede leer "+miArchivo.canRead());
		System.out.println("es archivo? "+miArchivo.isFile());
		
		System.out.println("ultima modificacion " +miArchivo.lastModified());
		System.out.println("longitud en bytes "+miArchivo.length());

	}

}
