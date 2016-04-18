package ar.edu.unlam.ww;

public class Cerradura {
	private Integer claveApertura = null;
	private Boolean estadoAbierta = false;
	private Integer cantidadDeFallosConsecutivos = null;
	private Integer contadorDeFallos = null;

	public Cerradura(Integer clave, Integer cantidadFallosPosibles) {
		claveApertura = clave;
		cantidadDeFallosConsecutivos = cantidadFallosPosibles;
	}

	public Boolean abrir(Integer clave){
		if (cantidadDeFallosConsecutivos.equals(contadorDeFallos)){
			estadoAbierta = false;
			return false;
		}
		else {
			if (clave.equals(claveApertura)){
				estadoAbierta = true;
				contadorDeFallos = 0;
				return true;
			}
			else {
				estadoAbierta = false;
				contadorDeFallos += 1;
				return false;
			}
		}
	}
	
	public Boolean estaAbierta() {
		if (estadoAbierta) {
			return true;
		}
		return false;
	}

}
