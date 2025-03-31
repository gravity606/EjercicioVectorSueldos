
/*
INTRODUCIR Y ALMACENAR LOS 12 SUELDOS DEL AÑO
MOSTRAR POR PANTALLA EL TOTAL DE GANANCIAS DEL AÑO
MOSTRAR TAMBIEN EL PROMEDIO DE SUELDO DEL AÑO
  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      double sueldos[] = new double[12];
      double sueldoTotal = 0;
      Scanner teclado = new Scanner(System.in);

      for(int i=0; i<sueldos.length; i++){
          int numMes = i + 1;
          System.out.println("Introduce el salario del mes " + numMes); //SE PODRIA PONER (i + 1) EN VEZ DE REALIZAR EL CALCULO numMes
          sueldos[i] = teclado.nextDouble();
          sueldoTotal = sueldoTotal + sueldos[i];
      }

      double sueldoMedio = sueldoTotal / sueldos.length;

      System.out.println("************************************************");
      System.out.println("El total ganado en 12 meses es: " + sueldoTotal + " euros");
      System.out.println("La media de salario mensual es: " + sueldoMedio + " euros");
      System.out.println("************************************************");


    }
}