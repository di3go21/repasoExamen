package Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClaseOutput extends ObjectOutputStream {
	ClaseOutput(FileOutputStream f) throws IOException {
		super(f);
	}

	protected void writeStreamHeader() throws IOException {
	}

}
