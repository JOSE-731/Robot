package robot;
import java.util.Scanner;
import java.util.Stack;

public class Robot {

    public static void main(String[] args) {
  
        int nm = 0;
        Scanner entrada = new Scanner(System.in);
        
        Stack d1 = new Stack();
        Stack d2 = new Stack();
        Stack d3 = new Stack();
        Stack d4 = new Stack();
        
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int b;

        String Creardueño[] = new String[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite el nombre del dueño"+ " " + (i + 1));
            System.out.println("--------------------------");
            Creardueño[i] = entrada.next();
        }

        System.out.println("Digite la cantidad de contenedores que tiene el barco");
        System.out.println("-----------------------------------------------------");
        int a = entrada.nextInt();

        for (int i = 0; i < a; i++) {
            nm = (int) (Math.random() * 4) + 1;
            switch (nm) {
                case 1:
                    d1.push(i + 1);
                   contador1++;

                    break;

                case 2:
                    d2.push(i + 1);
                    contador2++;
                    break;

                case 3:

                    d3.push(i + 1);
                    contador3++;

                    break;

                case 4:
                    d4.push(i + 1);
                    contador4++;
                default:
            }

        }

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("digite alguno de los siguientes  numeros, para ver los contenedores que le pertenecen  a cada uno de los dueños : \n digite el numero 1 apara ver los contenedores del primer dueño,\n  el 2 para el segundo dueño \n  el 3 para el tercer dueño\n  el"
                    + " 4 para el cuarto dueño \n  el numero 5 para mostar todos los contenedores\n   y el numero 6 para  salir\n ");

            b = entrada.nextInt();

            if (b == 1) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + contador1 + " le peretenecen a el dueño " + Creardueño[0] + " el contenido  del contenedor es : " + d1);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                b = entrada.nextInt();
            }

            if (b == 2) {

                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + contador2 + " le peretenecen a el dueño " + Creardueño[1] + " el contenido  del contenedor es : " + d2);
                 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if (b == 3) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + contador3 + " le peretenecen a el dueño " + Creardueño[2] + " el contenido  del contenedor es  : " + d3);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if (b == 4) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + contador4 + " le peretenecen a el dueño " + Creardueño[3] + " el contenido  del contenedor es : " + d4);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if (b == 5) {
                System.out.println("contenedor del dueño " + Creardueño[0] + d1);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + Creardueño[1] + d2);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + Creardueño[2] + d3);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + Creardueño[3] + d4);
            }

        } while (b <= 5);

    }

}
