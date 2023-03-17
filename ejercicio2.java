/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Jonatan
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
char letras[] = {'a','b','c','d'};

int numeros[] = new int[]{1,37,16};

for(int i=0;i<numeros.length;i++){

if (numeros[i] < 30) {

System.out.println(letras[i+1]);

} else {

System.out.println(numeros[i]);

}

}


    }
}
