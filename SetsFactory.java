// Universidad del Valle de Guatemala
// Algoritmos y estructuras de datos
// Hoja de trabajo 6 
// Juan Carlos Tapia Flores 14133
// Leonel Guillen del Valle 14451

import java.util.Set;

public  class SetsFactory{
	public   Set getSet(int tipo){
		// Dependiendo del parametro que se le envie al factory, se crea un conjuntos de los sets apropiados.
		if (tipo == 1){
			return new HashSets();
		}
		
		if (tipo == 2){
			return new TreeSets();
		}
		if (tipo == 3){
			return new LinkedHashSets();
		}
		return null;
	}
}
