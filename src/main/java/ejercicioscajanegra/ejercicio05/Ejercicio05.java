package ejercicioscajanegra.ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static int calcularFactorial(){
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int resultado = 1;
        if (numero == 0){
            return 1;
        }else {

            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
