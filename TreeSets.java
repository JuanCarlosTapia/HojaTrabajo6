import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets implements Set {
	// Los 3 Sets para los 3 tipos de programadores
	private TreeSet<String> ExpCel = new TreeSet<String>();
	private TreeSet<String> ExpWeb = new TreeSet<String>();
	private TreeSet<String> ExpJava = new TreeSet<String>();
	
	
	
	
  
   // Getters y Setters
   public TreeSet<String> getExpCel() {
		return ExpCel;
	}

	public void setExpCel(TreeSet<String> expCel) {
		ExpCel = expCel;
	}

	public TreeSet<String> getExpWeb() {
		return ExpWeb;
	}

	public void setExpWeb(TreeSet<String> expWeb) {
		ExpWeb = expWeb;
	}

	public TreeSet<String> getExpJava() {
		return ExpJava;
	}

	public void setExpJava(TreeSet<String> expJava) {
		ExpJava = expJava;
	}

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

@Override
public boolean add(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean addAll(Collection arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean contains(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsAll(Collection arg0) {
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
public boolean remove(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean removeAll(Collection arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean retainAll(Collection arg0) {
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
public Object[] toArray(Object[] arg0) {
	// TODO Auto-generated method stub
	return null;
}
}
