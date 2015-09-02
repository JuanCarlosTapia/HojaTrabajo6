// Universidad del Valle de Guatemala
// Algoritmos y estructuras de datos
// Hoja de trabajo 6 
// Juan Carlos Tapia Flores 14133
// Leonel Guillen del Valle 14451

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Conjunto {
	// Colecciones que representan los conjuntos de los 3 tipos de programadores
	private Collection<? extends Set> ExpCel ;
	private Collection<? extends Set> ExpWeb ;
	private Collection<? extends Set> ExpJava ;
	
	// Set que sirve para guardar los resultados de las operaciones
	private HashSet<Set> Resultado;  

	// Construcctor, recibe de parametros los 3 sets creados en el factory, y los guarda en los atributos de la clase
public Conjunto(Set Cel, Set Web, Set Java){
	ExpWeb = Web;
	ExpJava = Java;
	ExpCel = Cel;
	
}

// Funcion donde se opera los conjuntos y se imprimen los resultados
public void  Operaciones(){

   
	
    Resultado = new HashSet<Set>();  
    
    // Respuesta a pregunta 1
    System.out.println("Desarrolladores con experiencia en Java, web y celulares.");
    Resultado.addAll(ExpCel);
    Resultado.retainAll(ExpWeb);
    Resultado.retainAll(ExpJava);
    System.out.println(Resultado);
    System.out.println();
    
    Resultado.clear(); // Se vacia el conjunto
    
    // Respuesta a pregunta 2
    System.out.println("Desarrolladores con experiencia en Java, pero sin experiencia en web");
    Resultado.addAll(ExpJava);
    Resultado.removeAll(ExpWeb);
    System.out.println(Resultado);
    System.out.println(); 
   
    
    Resultado.clear();
    
    // Respuesta a pregunta 3
    System.out.println("Desarrolladores con experiencia en Web y Celulares, pero sin experiencia en Java ");
    Resultado.addAll(ExpCel);
    Resultado.retainAll(ExpWeb);
    Resultado.removeAll(ExpJava);
    System.out.println(Resultado);
    System.out.println();
    
    Resultado.clear();
    
    // Respuesta a pregunta 4
    System.out.println("Desarrolladores con experiencia en Web o Celulares, pero sin experiencia en Java ");
    Resultado.addAll(ExpCel);
    Resultado.addAll(ExpWeb);
    Resultado.removeAll(ExpJava);
    System.out.println(Resultado);
    System.out.println();
    
    Resultado.clear();
    
 // Respuesta a pregunta 5
    Resultado.addAll(ExpWeb);
    if (Resultado.containsAll(ExpJava) == true)
        System.out.println("El conjunto de desarrolladores Java  es un subconjunto del conjunto de desarrolladores Web");
    else
        System.out.println("El conjunto de desarrolladores Java no es un subconjunto del conjunto de desarrolladores Web");
  
    System.out.println();
    
    
 // Respuesta a pregunta 6 y 7
    
    // Se calculan la cantidad de programadores en cada conjunto
    int cantCel = ExpCel.size();
    int cantWeb = ExpWeb.size();
    int cantJava = ExpJava.size();
    
    
    if(cantCel > cantWeb)//se revisa si hay mas desarrolladores de celulares de de Web
        if(cantCel>cantJava){ // Si se cumple la condicion anterior, se revisa si hay mas desarrolladores de celulares que de JAva
           System.out.println("Hay mas desarrolladores de celulares");
          
           System.out.println("Estos son los desarrolladores");
           
           List<String> listaParaOrdenar = new ArrayList<String>((Set)ExpCel);//se crea una lista de String para ordenar con una funcion
           Collections.sort(listaParaOrdenar, Collections.reverseOrder());//se utiliza el sort de Collections para ordenar la lista
           System.out.println(listaParaOrdenar); // Se imprime la lista ordenada
           
        }
        else{//Si no se cumple, significa que hay mas desarrolladores de Java
           System.out.println("Hay mas desarrolladores de java");
           
           System.out.println("Estos son los desarrolladores");
           List<String> listaParaOrdenar = new ArrayList<String>((Set)ExpJava);//se crea una lista de String para ordenar con una funcion
           Collections.sort(listaParaOrdenar, Collections.reverseOrder());//se utiliza el sort de Collections para ordenar la lista
           System.out.println(listaParaOrdenar); // Se imprime la lista ordenada
        }
     else // Si no se cumple la primera condicion, entonces los desarrolladores de celulares no son la mayor cantidad 
    	 if(cantWeb>cantJava){ // Se revisa si hay mas desarrolladores Web que de Java
           System.out.println("Hay mas desarrolladores de Web");
           
           System.out.println("Estos son los desarrolladores");
           List<String> listaParaOrdenar = new ArrayList<String>((Set)ExpWeb);//se crea una lista de String para ordenar con una funcion
           Collections.sort(listaParaOrdenar, Collections.reverseOrder());//se utiliza el sort de Collections para ordenar la lista
           System.out.println(listaParaOrdenar); // Se imprime la lista ordenada
          
     }
     else{//Si no se cumple, significa que hay mas desarrolladores de Java
           System.out.println("Hay mas desarrolladores de java");
          
           System.out.println("Estos son los desarrolladores");
           List<String> listaParaOrdenar = new ArrayList<String>((Set)ExpJava);//se crea una lista de String para ordenar con una funcion
           Collections.sort(listaParaOrdenar, Collections.reverseOrder());//se utiliza el sort de Collections para ordenar la lista
           System.out.println(listaParaOrdenar); // Se imprime la lista ordenada
          
     }
     

}

}
