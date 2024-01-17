														package refactoring;
												   import java.util.Scanner;
												   public class Ejercicio4 {
public static void main(String[] args) {Scanner sc = new Scanner(System.in);
System.out.println("Escribe una frase:");
String LoCuRa = sc.nextLine();String NoLoCuRa = "";
int numLetras = LoCuRa.length();
			 for (int nUmErItO = numLetras - 1; nUmErItO >= 0; nUmErItO--) {
				 	   NoLoCuRa = NoLoCuRa  + "" + LoCuRa.charAt(nUmErItO);}
			 					  System.out.println(NoLoCuRa);sc.close();}}