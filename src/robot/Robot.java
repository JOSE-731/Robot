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
        
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int b;

        String dueño[] = new String[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite el nombre del dueño"+ " " + (i + 1));
            System.out.println("--------------------------");
            dueño[i] = entrada.next();
        }

        System.out.println("Digite la cantidad de contenedores que tiene el barco");
        System.out.println("-----------------------------------------------------");
        int a = entrada.nextInt();

        for (int i = 0; i < a; i++) {
            nm = (int) (Math.random() * 4) + 1;
            switch (nm) {
                case 1:
                    d1.push(i + 1);
                    cont1++;

                    break;

                case 2:
                    d2.push(i + 1);
                    cont2++;
                    break;

                case 3:

                    d3.push(i + 1);
                    cont3++;

                    break;

                case 4:
                    d4.push(i + 1);
                    cont4++;
                default:
            }

        }

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("digite alguno de los siguientes  numeros, para ver los contenedores que le pertenecen  a cada uno de los dueños : \n digite el numero 1 apara ver los contenedores del primer dueño,\n  el 2 para el segundo dueño \n  el 3 para el tercer dueño\n  el"
                    + " 4 para el cuarto dueño \n  el numero 5 para mostar todos los contenedores\n   y el numero 6 para  salir\n ");

            b = entrada.nextInt();

            if (b == 1) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + cont1 + " le peretenecen a el dueño " + dueño[0] + " el contenido  del contenedor es : " + d1);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
                b = entrada.nextInt();
            }

            if (b == 2) {

                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + cont2 + " le peretenecen a el dueño " + dueño[1] + " el contenido  del contenedor es : " + d2);
                 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if (b == 3) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + cont3 + " le peretenecen a el dueño " + dueño[2] + " el contenido  del contenedor es  : " + d3);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if (b == 4) {
                System.out.println("el barco tiene:" + a + " contenedores de los cuales :" + cont4 + " le peretenecen a el dueño " + dueño[3] + " el contenido  del contenedor es : " + d4);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if (b == 5) {
                System.out.println("contenedor del dueño " + dueño[0] + d1);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + dueño[1] + d2);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + dueño[2] + d3);
                System.out.println("----------------------------------");
                System.out.println("contenedor del dueño " + dueño[3] + d4);
            }

        } while (b <= 5);

    }

}
