package laboratorio2;

import java.util.Scanner;
import java.util.ArrayList;

public class Laboratorio2 {

    public static void main(String[] args) {
        //int i = 0;
        //declaración de variables 

        Scanner entrada = new Scanner(System.in);
        empleado e[] = new empleado[10];
        String nombre = "";
        // String [] nombre = null;
        int tipo_e;
        double incre;
        int increhijos;
        double sueldo = 0;
        int n_hijos;
        int edad;
        int total;
        String []aux;
        System.out.println("Ingrese el número de empleado a registrar");
        int n_empleados = entrada.nextInt();
        String []empleados = new String [n_empleados]; 
        
        for (int i = 1; i < empleados.length; i++) {
            System.out.println("Ingrese nombre del empleado : " + i+1);
            nombre = entrada.nextLine();
            empleados[i]=nombre;
            entrada.nextLine();
          
            System.out.println("Ingrese el tipo de empleado (del 1 al 4 )");
            tipo_e = entrada.nextInt();
            switch (tipo_e) {
                case 1:
                    incre = (340 * 5) / 100;
                    sueldo = 340 + incre;
                    break;
                case 2:
                    incre = (460 * 10) / 100;
                    sueldo = 460 + incre;
                    break;
                case 3:
                    incre = (580 * 15) / 100;
                    sueldo = 580 + incre;
                    break;
                case 4:
                    incre = (600 * 15) / 100;
                    sueldo = 600 + incre;
                    break;
                default:
                    System.out.println("Tipo de empleado ingresado no disponible");
                    break;
            }
            System.out.println("Ingrese número de hijos");
            n_hijos = entrada.nextInt();
            increhijos = n_hijos * 10;
            sueldo = sueldo + increhijos;

            System.out.println("Ingrese edad del empleado");
            edad = entrada.nextInt();
            if (edad <= 20) {
                sueldo = sueldo - 15;
            }
            if (edad > 20 && edad <= 30) {
                sueldo = sueldo - 25;
            }
            if (edad > 31) {
                sueldo = sueldo - 35;
            }
            //e[i] = new empleado(nombre, edad, n_hijos, tipo_e, sueldo);
        }
        for (int i = 0; i < n_empleados; i++) {
            System.out.println(empleados[i]+"" + e[i].gettipo_e() + "" + e[i].getn_hijos() + "" + e[i].getedad() + "" + e[i].getsueldo());
            //System.out.println(e[i].gettipo_e() + "" + e[i].getn_hijos() + "" + e[i].getedad() + "" + e[i].getsueldo());
        }

    }

}
