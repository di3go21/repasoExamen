package AccesoAleatorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Escritura {
	public static void main(String[] args) {
		
		File aleatorio= new File("diego/aleatorio.bin");
		aleatorio.delete();
		try {
			RandomAccessFile random = new RandomAccessFile(aleatorio, "rw");
			
			for (int i = 1; i < 100; i++) {
				random.writeInt(i);
			}
			
			System.out.println(random.length());
			random.seek(0);
			System.out.println("posicion actual: "+random.getFilePointer());
			System.out.println("está el numero: "+random.readInt());
			random.skipBytes(9*4);
			System.out.println("posicion actual: "+random.getFilePointer());
			System.out.println("salto 9 numeros: "+random.readInt());
			System.out.println("posicion actual: "+random.getFilePointer());

			random.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
