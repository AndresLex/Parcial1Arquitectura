package Principal;

import java.util.Scanner;

//Andres Leonardo Camargo Cortes
//701919
public class Main {
    public static void main(String[] args) {
        Local local = new Local();
        Distancia larDistan = new Distancia();
        Celular cel = new Celular();
        int duracion;
        int costoLLamada;
        int opc = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Lineas Telefonica");
            System.out.println("1. Llamada Local");
            System.out.println("2. Llamada larga distancia");
            System.out.println("3. Llamada Celular");
            System.out.println("4. Mostrar Informacion");
            System.out.println("5. Reiniciar");
            opc = teclado.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Registrar tiempo de llamada local");
                    duracion = teclado.nextInt();
                    local.registrarLlamada(duracion);
                    costoLLamada = local.getValorMinutoLoc() * duracion;
                    local.añadirCostoLlamada(costoLLamada);
                    break;
                case 2:
                    System.out.println("Registrar tiempo de llamada Larga distancia");
                    duracion = teclado.nextInt();
                    larDistan.registrarLlamada(duracion);
                    costoLLamada = larDistan.getValorMinutoDis() * duracion;
                    larDistan.añadirCostoLlamada(costoLLamada);
                    break;
                case 3:
                    System.out.println("Registrar tiempo de llamada Celular");
                    duracion = teclado.nextInt();
                    cel.registrarLlamada(duracion);
                    costoLLamada = cel.getValorMinutoCel() * duracion;
                    cel.añadirCostoLlamada(costoLLamada);
                    break;
                case 4:
                    System.out.println(local.toString());
                    System.out.println(larDistan.toString());
                    System.out.println(cel.toString());
                case 5:
                    local.reiniciar();
                    larDistan.reiniciar();
                    cel.reiniciar();
            }
        }while (opc < 6);
    }
}