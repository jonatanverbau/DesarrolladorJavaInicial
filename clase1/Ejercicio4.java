package clase1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Jonatan
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */


        public static void main(String args[]) throws IOException{

for (String linea : Files.readAllLines(Paths.get("OneDrive/Documentos/TrabajosJAVA/Ej4.txt"))){

if(linea.startsWith("*")){

System.out.println(linea);

}

}}}




