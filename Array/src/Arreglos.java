import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner(System.in);
		int edades[] = new int[5];
		for(int i = 0;i<edades.length;i++) {
			System.out.println("Ingrese edad");
			edades[i] = leer.nextInt();
		}

		
		System.out.println("Las edades ingresada son:");
		for(int i = 0; i<edades.length-1; i++) {
			System.out.println("La edad " + i + " es: " + edades[i]);
		}
		

		System.out.println("Estadisticas");
		double promedio = 0;
		int mayoresEdad = 0, menoresEdad = 0;
		for(int i = 0;i<edades.length;i++) {
			promedio = promedio + edades[i];
			
			if(edades[i] >=18) {
				mayoresEdad++;
			}
			
			else {
				menoresEdad++;
			}
			
		}
		promedio = promedio / edades.length;
		System.out.println("El promedio es: "+promedio);
		System.out.println("mayores de edad: "+mayoresEdad);
		System.out.println("menores de edad: "+menoresEdad);
		leer.close();
	}

}
