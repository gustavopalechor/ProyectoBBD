package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LecturaFi {
	
	public static List<String> lecturaFichero(String fichero) {
		 List<String> listaFilas= new ArrayList<>();
		Path fileEntrada = Paths.get(fichero);
		Charset charset = StandardCharsets.UTF_8;
		BufferedReader iBuffer = null;
		try
		{
			iBuffer = Files.newBufferedReader(fileEntrada, charset);
			String line = null;
			while ((line = iBuffer.readLine()) != null) {
				listaFilas.add(line);
			}

		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		} finally {
			if (iBuffer != null) {
				try {
					iBuffer.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		return listaFilas;

	}
}