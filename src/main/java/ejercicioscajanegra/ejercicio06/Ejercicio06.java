package ejercicioscajanegra.ejercicio06;

public class Ejercicio06 {

    public boolean comprobarDNI(String dni){

        String dniRegex = "\\d{8}[A-Za-z]";
        return dni.matches(dniRegex);
    }

    public boolean comprobarLetra(String dni){
        String n = dni.substring(0,8);
        int numero = Integer.parseInt(n);
        if ((numero % 23 == 0 && (dni.endsWith("T") || dni.endsWith("t")) || numero % 23 == 1 && (dni.endsWith("R") || dni.endsWith("r")) || numero % 23 == 2 && (dni.endsWith("W") || dni.endsWith("w")) || numero % 23 == 3 && (dni.endsWith("A") || dni.endsWith("a")) || numero % 23 == 4 && (dni.endsWith("G") || dni.endsWith("g")) || numero % 23 == 5 && (dni.endsWith("M") || dni.endsWith("m")) || numero % 23 == 6 && (dni.endsWith("Y") || dni.endsWith("y")) || numero % 23 == 7 && (dni.endsWith("F") || dni.endsWith("f"))|| numero % 23 == 8 && (dni.endsWith("P") || dni.endsWith("p")) || numero % 23 == 9 && (dni.endsWith("D") || dni.endsWith("d")) || numero % 23 == 10 && (dni.endsWith("X") || dni.endsWith("x")) || numero % 23 == 11 && (dni.endsWith("B") || dni.endsWith("b")) || numero % 23 == 12 && (dni.endsWith("N") || dni.endsWith("n")) || numero % 23 == 13 && (dni.endsWith("J") || dni.endsWith("j")) || numero % 23 == 14 && (dni.endsWith("Z") || dni.endsWith("z")) || numero % 23 == 15 && (dni.endsWith("S") || dni.endsWith("s")) || numero % 23 == 16 && (dni.endsWith("Q") || dni.endsWith("q")) || numero % 23 == 17 && (dni.endsWith("V") || dni.endsWith("v")) || numero % 23 == 18 && (dni.endsWith("H") || dni.endsWith("h")) || numero % 23 == 19 && (dni.endsWith("L") || dni.endsWith("l")) || numero % 23 == 20 && (dni.endsWith("C") || dni.endsWith("c")) ||numero % 23 == 21 && (dni.endsWith("K") || dni.endsWith("k")) || numero % 23 == 22 && (dni.endsWith("E") || dni.endsWith("e")))){
            return true;
        } else {
            return false;
        }

    }
    public boolean validarDNI (String dni){
        if(comprobarDNI(dni) && comprobarLetra(dni)){
            return true;
        } else {
            return false;
        }
    }
}
