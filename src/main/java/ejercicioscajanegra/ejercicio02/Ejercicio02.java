package ejercicioscajanegra.ejercicio02;

public class Ejercicio02 {

    private String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public static String casa (String c){
        if (c.equalsIgnoreCase("gryffindor")){
            return "valentía";
        } else if (c.equalsIgnoreCase("hufflepuff")) {
            return "lealtad";
        } else if (c.equalsIgnoreCase("slytherin")) {
            return "astucia";
        } else if (c.equalsIgnoreCase("ravenclaw")){
            return "intelecto";
        } else {
            return "No es una casa válida";
        }
    }
}
