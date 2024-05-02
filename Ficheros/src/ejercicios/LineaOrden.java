package ejercicios;

public class LineaOrden {
	
	private String descripcion;
	private int unidades;
	private double precio;
	
	public LineaOrden( String descripcion, int unidades, double precio) {
		this.descripcion=descripcion;
		this.unidades=unidades;
		this.precio=precio;
	}
	@Override
	public String toString() {
		return "LineaOrden [descripcion=" + descripcion + ", unidades=" + unidades + ", precio=" + precio + "]";
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}