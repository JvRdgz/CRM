package model;

import tipo.TipoInteriorExterior;
import tipo.TipoVentaAlquiler;
import tipo.TipoVivienda;

public class Inmueble {

	private int id;
	private int refInmueble;
	private double precio;
	private int numDormitorios;
	private int numBanos;
	private boolean garaje;
	private TipoVentaAlquiler tipoVentaAlquiler;
	private String ciudad;
	private String provincia;
	private String pais;
	private String zona;
	private TipoInteriorExterior tipoInteriorExterior;
	private String estado;
	private int numPlanta;
	private String calefaccion;
	private String aguaCaliente;
	private boolean aireAcondicionado;
	private String cocina;
	private boolean armariosEmpotrados;
	private boolean terraza;
	private boolean ascensor;
	private boolean conserje;
	private boolean jardin;
	private boolean piscina;
	private TipoVivienda tipoVivienda;

	public Inmueble(int id, int refInmueble, double precio, int numDormitorios, int numBanos, boolean garaje,
			TipoVentaAlquiler tipoVentaAlquiler, String ciudad, String provincia, String pais, String zona,
			TipoInteriorExterior tipoInteriorExterior, String estado, int numPlanta, String calefaccion,
			String aguaCaliente, boolean aireAcondicionado, String cocina, boolean armariosEmpotrados, boolean terraza,
			boolean ascensor, boolean conserje, boolean jardin, boolean piscina, TipoVivienda tipoVivienda) {
		this.id = id;
		this.refInmueble = refInmueble;
		this.precio = precio;
		this.numDormitorios = numDormitorios;
		this.numBanos = numBanos;
		this.garaje = garaje;
		this.tipoVentaAlquiler = tipoVentaAlquiler;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.zona = zona;
		this.tipoInteriorExterior = tipoInteriorExterior;
		this.estado = estado;
		this.numPlanta = numPlanta;
		this.calefaccion = calefaccion;
		this.aguaCaliente = aguaCaliente;
		this.aireAcondicionado = aireAcondicionado;
		this.cocina = cocina;
		this.armariosEmpotrados = armariosEmpotrados;
		this.terraza = terraza;
		this.ascensor = ascensor;
		this.conserje = conserje;
		this.jardin = jardin;
		this.piscina = piscina;
		this.tipoVivienda = tipoVivienda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRefInmueble() {
		return refInmueble;
	}

	public void setRefInmueble(int refInmueble) {
		this.refInmueble = refInmueble;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumDormitorios() {
		return numDormitorios;
	}

	public void setNumDormitorios(int numDormitorios) {
		this.numDormitorios = numDormitorios;
	}

	public int getNumBanos() {
		return numBanos;
	}

	public void setNumBanos(int numBanos) {
		this.numBanos = numBanos;
	}

	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}

	public TipoVentaAlquiler getTipoVentaAlquiler() {
		return tipoVentaAlquiler;
	}

	public void setTipoVentaAlquiler(TipoVentaAlquiler tipoVentaAlquiler) {
		this.tipoVentaAlquiler = tipoVentaAlquiler;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public TipoInteriorExterior getTipoInteriorExterior() {
		return tipoInteriorExterior;
	}

	public void setTipoInteriorExterior(TipoInteriorExterior tipoInteriorExterior) {
		this.tipoInteriorExterior = tipoInteriorExterior;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumPlanta() {
		return numPlanta;
	}

	public void setNumPlanta(int numPlanta) {
		this.numPlanta = numPlanta;
	}

	public String getCalefaccion() {
		return calefaccion;
	}

	public void setCalefaccion(String calefaccion) {
		this.calefaccion = calefaccion;
	}

	public String getAguaCaliente() {
		return aguaCaliente;
	}

	public void setAguaCaliente(String aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public String getCocina() {
		return cocina;
	}

	public void setCocina(String cocina) {
		this.cocina = cocina;
	}

	public boolean isArmariosEmpotrados() {
		return armariosEmpotrados;
	}

	public void setArmariosEmpotrados(boolean armariosEmpotrados) {
		this.armariosEmpotrados = armariosEmpotrados;
	}

	public boolean isTerraza() {
		return terraza;
	}

	public void setTerraza(boolean terraza) {
		this.terraza = terraza;
	}

	public boolean isAscensor() {
		return ascensor;
	}

	public void setAscensor(boolean ascensor) {
		this.ascensor = ascensor;
	}

	public boolean isConserje() {
		return conserje;
	}

	public void setConserje(boolean conserje) {
		this.conserje = conserje;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public TipoVivienda getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(TipoVivienda tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", refInmueble=" + refInmueble + ", precio=" + precio + ", numDormitorios="
				+ numDormitorios + ", numBanos=" + numBanos + ", garaje=" + garaje + ", tipoVentaAlquiler="
				+ tipoVentaAlquiler + ", ciudad=" + ciudad + ", provincia=" + provincia + ", pais=" + pais + ", zona="
				+ zona + ", tipoInteriorExterior=" + tipoInteriorExterior + ", estado=" + estado + ", numPlanta="
				+ numPlanta + ", calefaccion=" + calefaccion + ", aguaCaliente=" + aguaCaliente + ", aireAcondicionado="
				+ aireAcondicionado + ", cocina=" + cocina + ", armariosEmpotrados=" + armariosEmpotrados + ", terraza="
				+ terraza + ", ascensor=" + ascensor + ", conserje=" + conserje + ", jardin=" + jardin + ", piscina="
				+ piscina + ", tipoVivienda=" + tipoVivienda + "]";
	}
}
