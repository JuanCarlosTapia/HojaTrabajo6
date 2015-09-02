// Universidad del Valle de Guatemala
// Algoritmos y estructuras de datos
// Hoja de trabajo 6 
// Juan Carlos Tapia Flores 14133
// Leonel Guillen del Valle 14451
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;



public class ISets {

    
  public static void main (String[] args) {
      
	  Scanner teclado = new Scanner (System.in);
	  // Factory
	  SetsFactory setFactory = new SetsFactory();
	  
	  
	  // Variables temporales
	  boolean java=false;
	  boolean web= false;  
	  boolean celular= false;  
      String Nombre = "";
         
  // Se muestra e menu
  System.out.println("Bienvenido, Que tipo de Set quiere utilizar?");
  System.out.println("1. HashSet");
  System.out.println("2. TreeSet");
  System.out.println("3. LinkedHashSet");
  int opcion = teclado.nextInt();//opcion lleva el numero del set que se eligio
  while  (opcion != 3 && opcion != 2 && opcion!= 1){
	System.out.println("Por favor ingrese una opcion valida:");
	System.out.println("Intente de nuevo");	
	opcion = teclado.nextInt();
  } 
 
 
  Set setElegido = setFactory.getSet(opcion);
  teclado.nextLine();
 
	
            
																		
  int seguir = 1;
  		while (seguir==1){   //Hacer mientras no se ingrese un 2 al final del ciclo 
  			//se pide el nombre
  			System.out.println("Por favor Ingrese Nombre de Programador");
  			Nombre =teclado.nextLine();
  			//se pregunta por conocimientos de Java
  			System.out.println("Este desarrollador tiene experiencia enJava?  1.Si    2.No");
  			int SabeJava = teclado.nextInt();
			 while  (SabeJava != 1 && SabeJava != 2){
			System.out.println("Por favor ingrese una opcion valida:");
			 System.out.println("Intente de nuevo");
			SabeJava = teclado.nextInt();
			 }
			 
  			if (SabeJava==1){
  				java = true;
  			}
  			else {
  				java = false;
  			}
  		//se pregunta por conocimientos de Web
  			System.out.println("Este desarrollador tiene experiencia en Web?  1. Si   2. No");
  			int SabeWeb = teclado.nextInt();
			 while  (SabeWeb != 1 && SabeWeb != 2){
			System.out.println("Por favor ingrese una opcion valida:");
			 System.out.println("Intente de nuevo");
			SabeWeb = teclado.nextInt();
			 }
  			if (SabeWeb==1){
  				web = true;
  			}
  			else{
  				web = false;
  			}
  			
  		//se pregunta por conocimientos de Celulares
  			System.out.println("Este desarrollador tiene experiencia en Celulares?     1.Si    2.No");
  			int SabeCel = teclado.nextInt();
			 while  (SabeCel != 1 && SabeCel != 2){
			System.out.println("Por favor ingrese una opcion valida:");
			 System.out.println("Intente de nuevo");
			SabeCel = teclado.nextInt();
			 }
  			if (SabeCel==1){
  				celular =true;
  			}
  			else{
  				celular =false;
  			}
  			
  			// Este Switch llama a la funcion que clasifica a los programadores, pero se debe hacer uno para cada uno, debido a que se deben instanciar.
  			switch(opcion){
  			case 1:		
  				((HashSets) setElegido).clasificar (java, celular, web, Nombre);//se envia al clasificador para que los ingrese en el set adecuado
  				break;
  			case 2:		
  				((TreeSets) setElegido).clasificar (java, celular, web, Nombre);//se envia al clasificador para que los ingrese en el set adecuado
  				break;
  			case 3:		
  				((LinkedHashSets) setElegido).clasificar (java, celular, web, Nombre);//se envia al clasificador para que los ingrese en el set adecuado
  				break;
  			}
  		//se pregunta si se quiere agregar mas programadores
  			System.out.println("Quiere agregar? 1.Si  2.No");
  			seguir = teclado.nextInt();
			 while  (seguir != 1 && seguir != 2){
			System.out.println("Por favor ingrese una opcion valida:");
			 System.out.println("Intente de nuevo");
			seguir = teclado.nextInt();
			 }
  			teclado.nextLine();
                   
  		}
  		// Aqui se crea el objeto de la clase que opera los conjuntos
  		// Se manda como parametros los 3 sets para cada clasificaciond de programador
  		Conjunto driver = null;
  		switch(opcion){
  			case 1:
  				driver = new Conjunto(((HashSets) setElegido).getExpCel(), ((HashSets) setElegido).getExpWeb(), ((HashSets) setElegido).getExpJava());            
                	break;
  			case 2:
  				driver = new Conjunto(((TreeSets) setElegido).getExpCel(), ((TreeSets) setElegido).getExpWeb(), ((TreeSets) setElegido).getExpJava());            
                	break;
  			case 3:
  				driver = new Conjunto(((LinkedHashSets) setElegido).getExpCel(), ((LinkedHashSets) setElegido).getExpWeb(), ((LinkedHashSets) setElegido).getExpJava());            
                	break;
                
                }
  			// Se llama a la funcion que realiza las operaciones, y muestra los resultados
  			driver.Operaciones();
      
 
  
  }
}
  
