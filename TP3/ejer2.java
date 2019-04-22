package Calculador;
import java.util.*;
public class Digitos {
	public static void main(String[] args) {
	 Scanner teclado = new Scanner(System.in);
	 int num;
	 System.out.print("Escriba un numero:");
	 num=teclado.nextint();
	 System.out.println("El número ingresado tiene " + Integer.toString(num).length() + " dígitos");

	 System.out.println();
	}

}