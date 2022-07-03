public class Main {
    public static void main(String[] args) {

        int numeroIf = -10;

        if(numeroIf > 0){
            System.out.println(numeroIf + " es un numero positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " es un numero negativo");
        }else {
            System.out.println("El numero es " + numeroIf);
        }

        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numerodoWhile = 0;

        do {
            numerodoWhile++;
        }while (numerodoWhile < 3);{
            System.out.println(numerodoWhile);
        }


        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "INVIERNO";

        switch (estacion){
            case "VERANO" :
                System.out.println("Es " + estacion);
                break;
            case "PRIMAVERA":
                System.out.println("Es " + estacion);
                break;
            case "OTOÑO":
                System.out.println("Es " + estacion);
                break;
            case "INVIERNO":
                System.out.println("Es " + estacion);
                break;
            default:
                System.out.println(estacion + " no es una estacion");
        }
    }
}