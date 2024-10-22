package es.etg.psp.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Flujo {

    public static final String MSG_ERROR = "Se ha producido un error al ejecutar el comando";
	public static final String ENTRADA ="""
                                            Me gusta PSP y java
                                            PSP se programa en java
                                            es un módulo de DAM
                                            y se programa de forma concurrente en PSP
                                            PSP es programación""" ;

    public static final String[] COMANDOS = {"grep", "PSP"}; //lista

    public static void main(String[] args) throws Exception{
		try {
			Process process = Runtime.getRuntime().exec(COMANDOS);

			OutputStream out = process.getOutputStream();
			PrintWriter pw =new PrintWriter(new OutputStreamWriter(out));
            pw.println(ENTRADA);
            pw.close();

			StringBuilder output = new StringBuilder();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line).append("\n");
			}

        //Dejamos el programa bloqueado hasta que termine el otro.
			int exitVal = process.waitFor();
			if (exitVal == 0) {
				System.out.println(output);
				System.exit(0);
			} else {
				System.out.println(MSG_ERROR);
				System.exit(1);
			}

		} catch (IOException | InterruptedException e) {
			System.exit(34);
		}

	}
    
}
