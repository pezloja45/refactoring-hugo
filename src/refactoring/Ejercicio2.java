										 								  package refactoring;
										 							 import java.util.Scanner;
																	 public class Ejercicio2 {
													  public static void main(String[] args) {
				 Scanner sc = new Scanner(System.in);System.out.println("Escribe un numero:");
				 		 int sevoya = sc.nextInt();System.out.println("Escribe otro numero:");
				 		 										  int tomeitou = sc.nextInt();
 if (sevoya > tomeitou) {System.out.println("Error el primer número es mayor que el segundo");		
																					  } else {
  System.out.println("Los números comprendidos entre " + sevoya + " y " + tomeitou + " son:");
							  for (int i = sevoya; i <= tomeitou; i++) {System.out.println(i);
				  															   }}sc.close();}}