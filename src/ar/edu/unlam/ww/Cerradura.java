package ar.edu.unlam.ww;

public class Cerradura {
	private Integer claveApertura = null;
	private Boolean estadoAbierta = false;
	private Integer cantidadDeFallosPosibles = null;
	private Integer contadorDeFallos = 0; //null cannot be operated.
	private Boolean estadoBloqueada = false;

	public Cerradura(Integer clave, Integer cantidadFallosPosibles) {
		claveApertura = clave;
		cantidadDeFallosPosibles = cantidadFallosPosibles;
	}

	public Boolean abrir(Integer clave) {
		if (!estadoBloqueada) {
			if (cantidadDeFallosPosibles.equals(contadorDeFallos)) {
				estadoAbierta = false;
				estadoBloqueada = true;
				return false;
			} else {
				if (clave.equals(claveApertura)) {
					estadoAbierta = true;
					contadorDeFallos = 0;
					return true;
				} else {
					estadoAbierta = false;
					contadorDeFallos = contadorDeFallos + 1;
					return false;
				}
			}
		} else {
			return false;
		}

	}

	public Boolean estaAbierta() {
		if (estadoAbierta) {
			return true;
		}
		return false;
	}

}
