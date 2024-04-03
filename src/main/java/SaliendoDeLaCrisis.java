import java.util.Arrays;
import java.util.Scanner;

public class SaliendoDeLaCrisis {
    public static void main(String[] args) {
        //mientras no introduzcamos un 0 seguimos pidiendo numeros
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt(); teclado.nextLine(); // ejemplo: 3

        while (numero != 0){
            String cadena = teclado.nextLine(); // ejemplo: "1, 3, 6"
            String[] numeros= cadena.split(" ");
            System.out.println(Arrays.toString(numeros));
            for (int i = 0; i < numeros.length -1; i++) {

                    }
            }
            numero = teclado.nextInt(); teclado.nextLine();
        }

    }
