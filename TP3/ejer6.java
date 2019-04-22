package Calculador;
import java.util.*;
public class Empleado {
	public static void main(String[] args) {
	  private String nombre = null;
      private int sueldo;

      Scanner teclado = new Scanner(System.in);
      System.out.print("Nombre del empleado: ");
      nombre = teclado.next();
      System.out.print("Sueldo total: ");
      sueldo= teclado.nextInt();
      
      System.out.print("Empleado");
      System.out.print("*************");
      System.out.print("Nombre:" + nombre);
      System.out.print("Sueldo:" + sueldo);
      if(sueldo > 3000)
      {
      	System.out.print("El empleado debe pagar impuestos.");
      }
      else
      {
      	System.out.print("El empleado no debe pagar impuestos.");
      }
     System.out.println();
	}

}