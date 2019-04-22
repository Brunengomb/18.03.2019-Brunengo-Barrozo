import java.util.Scanner;
public class Operaciones {
	public static void main(String[] args){


System.out.print(carga1());
System.out.print(carga2());
System.out.print("Los resultados son:");
System.out.println("La suma es: " + Sumar(num1, num2));
System.out.println("La division es: " + Dividir(num1, num2));
System.out.println("La resta es: " + Restar(num1, num2));
System.out.println("La multiplicacion es: " + Multiplicar(num1, num2));    

  System.out.println();   
 }

 public void carga1() {
System.out.print("Ingrese el primer valor:");
num1=teclado.nextInt();
}
public void carga2() {
System.out.print("Ingrese el segundo valor:");
num2=teclado.nextInt();
}
 static int Sumar(int num1, int num2){
 int suma = num1 + num2;
 return suma;
 }

  static int Restar(int num1, int num2){
 int resta = num1 - num2;
 return resta;
 }

  static int Dividir(int num1, int num2){
 int division = num1 / num2;
 return division;
 }

  static int Multiplicar(int num1, int num2){
 int multiplicacion = num1 + num2;
 return multiplicacion;
 }

}