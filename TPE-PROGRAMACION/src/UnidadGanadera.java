import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public abstract class UnidadGanadera {
	private Set<Categoria> categorias = new HashSet<>();

	public abstract int getEdad();
	public abstract double getPeso();
	public abstract int getCantidad();
	public abstract boolean llenarCamion(Camion x);
	//public abstract String getRaza();
	public Set<Categoria> getCategorias(Animal a) {
	    Set<Categoria> categoria = new HashSet<>();
		for (Categoria cat :
				categorias) {
			if (cat.pertence(a))
				categoria.add(cat);
		}
		System.out.println(categoria.toString());
		return categoria;
	}
	
	public void addCategorias(Categoria c) {
		categorias.add(c);
	}
}
