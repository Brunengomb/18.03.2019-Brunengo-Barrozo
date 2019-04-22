package Calculador;
import java.util.Scanner;
public class Acumula
{
    public static void main(String[] ARGS)
    {
        Scanner teclado = new Scanner(System.in);
        int cant,total,i,numnew;
 
        System.out.print("Cantidad de numeros a sumar: ");
        cant = obtener.nextInt();
        total = 0;
        for(i = 1; i <= cant; i++)
        {
            System.out.print("Ingresar numero: ");
            numnew = teclado.nextInt();
            total = total + nuevoNumero;
        }
        System.out.print("La suma total de los numeros es : " + total);
        if (total > 0)
                {
                    System.out.print("Es mayor a cero.")
                }
        else
                {
                    System.out.print("Es igual a cero.") 
                }
         
        System.out.println();
    }
}


