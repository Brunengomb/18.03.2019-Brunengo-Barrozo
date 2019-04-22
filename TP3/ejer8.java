import java.util.Scanner;
public class Persona {
	    private Scanner teclado;
		private String nombre;
		private int edad;

	    public void iniciar(){
			teclado=new Scanner(System.in);
			System.out.print("Nombre del empleado:");
			nombre=teclado.next();
			System.out.print("Edad del empleado:");
			edad=teclado.nextInt();
			}

		public void imprimir() {
			System.out.println("Nombre:"+nombre);
			System.out.println("Edad:"+edad);
			}

 public class Empleado extends Persona{
 	private Scanner teclado;
	private int sueldo;

	public void iniciarsueldo(){
		teclado=new Scanner(System.in);
		System.out.print("Ingresar sueldo:");
		sueldo=teclado.nextInt();
		}
	public void imprimirsueldo() {
			System.out.println("Sueldo"+sueldo);
			}


 	}

 public static void main(String[] ar) {
	Persona p1 ;
	p1=new Persona();
	p1.iniciar();
	p1.imprimir();
	Empleado em;
	em= new Empleado();
	em=inicialsueldo()
	em=imprimirsueldo()
	}
}


