package calculadora;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("ingrese a1");
		double a1 = reader.nextInt();
		System.out.println("ingrese b1");
		double b1 = reader.nextInt();
		System.out.println("ingrese a2");
		double a2 = reader.nextInt();
		System.out.println("ingrese b2");
		double b2 = reader.nextInt();
		
		Complex num1 = new Complex(a1,b1);
		Complex num2 = new Complex(a2,b2);
		
		System.out.println("Suma: ");
		Complex ans = num1.complexSum(num2);
		System.out.println(ans.numToString());
		
		System.out.println("Resta: ");
		Complex ans2 = num1.resta(num2);
		System.out.println(ans2.numToString());
		
		System.out.println("Multiplicacion: ");
		Complex ans4 = num1.multiplicacion(num2);
		System.out.println(ans4.numToString());
		
		System.out.println("Division: ");
		Complex ans5 = num1.division(num2);
		if (ans5 != null) {
			System.out.println(ans5.numToString());
		}
			
		System.out.println("Modulo del primer numero: ");
		double ans6 = num1.modulo();
		System.out.println(ans6);
		
		System.out.println("Modulo del segundo numero: ");
		double ans7 = num2.modulo();
		System.out.println(ans7);
		
		System.out.println("conjugado del primer numero: ");
		Complex ans8 = num1.conjugado();
		System.out.println(ans8.numToString());
		
		System.out.println("Conjugado del segundo numero: ");
		Complex ans9 = num2.conjugado();
		System.out.println(ans9.numToString());
		
		System.out.println("Las coordenadas polares del primer numero son: ");
		double[] ans10 = num1.polar();
		System.out.print(ans10[0]);
		System.out.print(",");
		System.out.println(ans10[1]);
		
		System.out.println("Las coordenadas polares del segundo numero son: ");
		double[] ans11 = num2.polar();
		System.out.print(ans11[0]);
		System.out.print(",");
		System.out.println(ans11[1]);
		
		System.out.println("La fase del primer numero es: ");
		double ans14= num1.fase();
		System.out.println(ans14);
		
		System.out.println("La fase del segundo numero es: ");
		double ans15= num2.fase();
		System.out.println(ans15);
		
		System.out.println("Las coordenadas cartesianas de la primera coordenada polar es: ");
		Complex ans12= cartesiano(ans6,ans14);
		System.out.println(ans12.numToString());
		
		System.out.println("Las coordenadas cartesianas de la segunda coordenada polar es: ");
		Complex ans13= cartesiano(ans7,ans15);
		System.out.println(ans13.numToString());
	}
	/**
	 * Saca la coordenada cartesiana de las coordenadas polares
	 * @return
	 */
	public static Complex cartesiano(double modulo, double angulo) {
		angulo = (double)Math.round(Math.toRadians(angulo) * 100d) / 100d;
		return new Complex((double)Math.round((modulo * (Math.cos(angulo))) * 100d) / 100d,
		(double)Math.round((modulo * (Math.sin(angulo))) * 100d) / 100d);
	}
}