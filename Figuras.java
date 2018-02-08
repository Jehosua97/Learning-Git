
import java.util.Scanner;
public class Figuras{
	public static void main(String[] args) {
		float area=0, perimetro=0;
		int opcion;
		float a,b;

		final float PI=3.14159f; //final es para dejar un valor fijo
								//la f al final se ocupa como valor fijo de decimales
		Scanner sc = new Scanner(System.in); //Declramos un objeto que ayude a recibir de teclado


		System.out.println("Selcciona la opción");
		System.out.println("1 .- Círculo");
		System.out.println("2 .- Triángulo");	
		System.out.println("3 .- Cuadrado");
		System.out.println("4 .- Salir");

		opcion=sc.nextInt();

		switch(opcion){
			case 1:
			System.out.println("Ingresa el radio");//Circulo
			a=sc.nextFloat();
			area=PI*a*a;
			perimetro=2*PI*a;
				break;
			case 2:
			System.out.println("Ingresa longitud de un lado");
			a=sc.nextFloat();//Triangulo
			area=(a*a)/2;
			perimetro=3*a;
				break;
			case 3: 
			System.out.println("Ingresa longitud de un lado");
			a=sc.nextFloat();	//Cuadrado
			area=a*a;
			perimetro=4*a;
				break;

			default:
			//Salida
				System.out.println("Adios");
				break;

		}

		System.out.println("El area es "+ area);
		System.out.println("\nEl perimetro es "+ perimetro);
	}

}