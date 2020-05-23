package AccesoAleatorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjemploPares {
	public static void main(String[] args) {

		File aleatorio = new File("diego/ejerciciorandom.bin");
		aleatorio.delete();
		try {
			RandomAccessFile random = new RandomAccessFile(aleatorio, "rw");

			for (int i = 0; i < 10; i++)
				random.writeInt(i);
			int valor;
			random.seek(0);
			try {
				while (true) {
					System.out.println(random.readInt());
				}

			} catch (Exception e) {
			}

			random.seek(0);
			try {
				while (true) {
					valor = random.readInt();
					if (valor % 2 == 0) {
						valor = valor * 2;
						random.seek(random.getFilePointer() - 4);
						random.writeInt(valor);
					}
				}
			} catch (Exception e) {
			}

			random.seek(0);
			try {
				while (true) {
					System.out.println(random.readInt());
				}

			} catch (Exception e) {
			}

			random.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
