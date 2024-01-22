package refactoring;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero:");
		int numeroUno = sc.nextInt();
		System.out.println("Escribe otro numero:");
		int numeroDos = sc.nextInt();
		MayorMenor(numeroUno, numeroDos);
		sc.close();
	}

	public static void MayorMenor(int numeroUno, int numeroDos) {
		if (numeroUno > numeroDos) {
			System.out.println("Error el primer número es mayor que el segundo");
		} else {
			System.out.println("Los números comprendidos entre " + numeroUno + " y " + numeroDos + " son:");
			for (int i = numeroUno; i <= numeroDos; i++) {
				System.out.println(i);
			}
		}
	}
}