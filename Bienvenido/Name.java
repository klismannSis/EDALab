import java.util.Scanner;
public class Name{
	
	public static void main(String args[]){
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("Ingrese su nombre: ");
	String name = entrada.nextLine();
	System.out.println("Hola " + name );
	}
}
