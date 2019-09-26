/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.io.BufferedWriter;
import java.io.File;
import java.util.*;



/**
 *
 * @author Farid Estepa
 */
public class Registro {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String ruta = "/archivos/archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if (archivo.exists()) {
            // El fichero ya existe
        } else {
            // El fichero no existe y hay que crearlo
        }

        
        
        lectura.close();
    }
}
