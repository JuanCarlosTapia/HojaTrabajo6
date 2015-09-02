// Universidad del Valle de Guatemala
// Algoritmos y estructuras de datos
// Hoja de trabajo 6 
// Juan Carlos Tapia Flores 14133
// Leonel Guillen del Valle 14451

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets implements Set{
	// Los 3 Sets para los 3 tipos de programadores
	private LinkedHashSet<String> ExpCel = new LinkedHashSet<String>();
	private LinkedHashSet<String> ExpWeb = new LinkedHashSet<String>();
	private LinkedHashSet<String> ExpJava = new LinkedHashSet<String>();
	
	// Esta funcion recibe las respuestas del usuario a las preguntas de la interfaz, y mete a los programadores en los Sets apropiado	
	public void clasificar(boolean Java,boolean Celular,boolean Web,String persona){
	       if ((Celular== true)){
	           ExpCel.add(persona);
	               }
	       if ((Java== true)){
	           ExpJava.add(persona);
	               }
	       if ((Web== true)){
	           ExpWeb.add(persona);
	               }
	}

	// Getters y Setters
	public LinkedHashSet<String> getExpCel() {
		return ExpCel;
	}

	public void setExpCel(LinkedHashSet<String> expCel) {
		ExpCel = expCel;
	}

	public LinkedHashSet<String> getExpWeb() {
		return ExpWeb;
	}

	public void setExpWeb(LinkedHashSet<String> expWeb) {
		ExpWeb = expWeb;
	}

	public LinkedHashSet<String> getExpJava() {
		return ExpJava;
	}

	public void setExpJava(LinkedHashSet<String> expJava) {
		ExpJava = expJava;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
