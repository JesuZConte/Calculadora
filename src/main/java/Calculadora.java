import static org.junit.Assert.assertArrayEquals;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String operacion = "";
		boolean continuar = false;
		int numeroUno = 0;
		int numeroDos = 0;
		int resultado = 0;
		
		do
		{
		System.out.println("Por favor, elija operación a realizar: +, -, *, /");
		operacion = scanner.next();
		if(operacion.equals("+") || operacion.equals("-") || operacion.equals("*") || operacion.equals("/")){
			continuar = true;
			}
		}
		while(!continuar);

		
		if(operacion.trim().equals("+") || operacion.equals("-") || operacion.equals("*") || operacion.equals("/"))
			System.out.println("Por favor, ingrese el primer número");
			numeroUno = scanner.nextInt();
			System.out.println("Por favor, ingrese el segundo número");
			numeroDos = scanner.nextInt();
			if(operacion.trim().equals("+") || operacion.equals("-") || operacion.equals("*")){
				if(operacion.trim().equals("+")){			
				resultado = numeroUno + numeroDos;
				}
				
				else if(operacion.trim().equals("-")){
					resultado = numeroUno - numeroDos;
				}
				else if(operacion.trim().equals("*")){
					resultado = numeroUno * numeroDos;
				}
				System.out.println("El resultado es: " + resultado);
			}
			
			else if(operacion.trim().equals("/")){
				while(numeroDos == 0){
					System.out.println("El segundo número debe ser distinto a 0. Ingrese el segundo número");
					numeroDos = scanner.nextInt();
					}
				double nuevoResultado = numeroUno/numeroDos;
				System.out.println("El resultado es: " + nuevoResultado);
					
			}
	}

}
