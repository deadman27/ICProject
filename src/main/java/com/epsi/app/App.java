package com.epsi.app;

import java.util.Scanner;

/**
 * Hello world!
 * Coucou
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );//Test
        
        while(true){
			Operation operation = new Operation();
			System.out.println("Quel type d'opération vouluez-vous faire ?");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			
			switch(input){
			case "+" :
				operation.setOperation("+");
				break;
			case "-" :
				operation.setOperation("-");
				break;
			case "*" :
				operation.setOperation("*");
				break;
			case "/" :
				operation.setOperation("/");
				break;
			}
			
			System.out.println("Entrez le 1er nombre");
			operation.setNombre1(sc.nextInt());
			System.out.println("Entrez le 2eme nombre");
			operation.setNombre2(sc.nextInt());
			
			System.out.println(operation.getResultat());

			
		}
    }
}
