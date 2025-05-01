//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Cocineros[] cocineros = new Cocineros[3];
       for (int i = 0; i < cocineros.length; i++) {
           System.out.println("Ingrese el nombre del cocinero: ");
           String nombre = sc.nextLine();
           System.out.println("Ingrese el experiencia del cocinero: ");
           int experiencia = sc.nextInt();
           sc.nextLine();
           System.out.println("Ingrese el especialidad del cocinero: ");
           String especialidad = sc.nextLine();

           cocineros[i] = new Cocineros(nombre, experiencia, especialidad);
           System.out.println("---INFORMACION DE COCINEROS---");
           cocineros[i].mostrarInfo();
       }
       sc.close();
    }
}
