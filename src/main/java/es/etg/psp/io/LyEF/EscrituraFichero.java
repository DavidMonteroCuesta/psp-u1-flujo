package es.etg.psp.io.LyEF;

import java.io.FileOutputStream;
import java.io.IOException;

public interface EscrituraFichero {
    public static final String ESPACIO_PARA_VARIABLE = "%s";
    public final String MSG_ERROR_ESCRITURA_FICHERO = "HA OCURRIDO UN ERROR AL ESCRIBIR EL FICHERO: ";
    public final String MSG_ERROR_VACIAR = "HA OCURRIDO UN ERROR AL VACIAR EL FICHERO";
    public final String SALTO_DE_LINEA = "\n";
	public final String ALMOHADILLA = "#";
	public final String ESPACIO_EN_BLANCO = " ";
    
    static void escribir(String nombreFichero, StringBuilder output, String mensaje) {
        String contenido = ALMOHADILLA + ESPACIO_EN_BLANCO + ESPACIO_PARA_VARIABLE + SALTO_DE_LINEA + ESPACIO_PARA_VARIABLE + SALTO_DE_LINEA;

        try (FileOutputStream fos = new FileOutputStream(nombreFichero, true)) { // Al anyadir "true" no se sobreescribirá el contenido
            String datos = String.format(contenido, mensaje, output.toString());
            byte[] byteArray = datos.getBytes();
            fos.write(byteArray);
        } catch (IOException e) {
            System.out.println(MSG_ERROR_ESCRITURA_FICHERO + e.getMessage());
        }
    }

    static void vaciar(String nombreFichero) {
        try (FileOutputStream fos = new FileOutputStream(nombreFichero)) { 

        } catch (IOException e) {
            System.out.println(MSG_ERROR_VACIAR + e.getMessage());
        }
    }
}
