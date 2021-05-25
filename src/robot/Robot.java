package robot;
import java.util.Scanner;
import java.util.Stack;

public class Robot {

    public static void main(String[] args) {
  
        int nm = 0;
        Scanner entrada = new Scanner(System.in);
        
        Stack dueño1 = new Stack();
        Stack dueño2 = new Stack();
        Stack dueño3 = new Stack();
        Stack dueño4 = new Stack();
        
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int opcion2;

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
                    dueño1.push(i + 1);
                   contador1++;

                    break;

                case 2:
                    dueño2.push(i + 1);
                    contador2++;
                    break;

                case 3:

                    dueño3.push(i + 1);
                    contador3++;

                    break;

                case 4:
                    dueño4.push(i + 1);
                    contador4++;
                default:
            }

        }

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("digite alguno de los siguientes  numeros, para ver los contenedores que le pertenecen  a cada uno de los dueños : \n digite el numero 1 apara ver los contenedores del primer dueño,\n  el 2 para el segundo dueño \n  el 3 para el tercer dueño\n  el"
                    + " 4 para el cuarto dueño \n  el numero 5 para mostar todos los contenedores\n   y el numero 6 para  salir\n ");

            opcion2 = entrada.nextInt();

            if (opcion2 == 1) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + contador1 + " le peretenecen a el dueño " + Creardueño[0] + " el contenido  del contenedor es : " + dueño1);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                opcion2 = entrada.nextInt();
            }

            if (opcion2 == 2) {

                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + contador2 + " le peretenecen a el dueño " + Creardueño[1] + " el contenido  del contenedor es : " + dueño2);
                 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if (opcion2 == 3) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + contador3 + " le peretenecen a el dueño " + Creardueño[2] + " el contenido  del contenedor es  : " + dueño3);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if (opcion2 == 4) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + contador4 + " le peretenecen a el dueño " + Creardueño[3] + " el contenido  del contenedor es : " + dueño4);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if (opcion2 == 5) {
                System.out.println("contenedor del dueño " + Creardueño[0] + dueño1);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + Creardueño[1] + dueño2);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + Creardueño[2] + dueño3);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + Creardueño[3] + dueño4);
            }

        } while (opcion2 <= 5);

    }

}
