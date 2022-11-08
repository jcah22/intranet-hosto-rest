package com.hosto.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Odc implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_odc;

	private String descripcion;

	private String factura;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	private String flete;

	private Double total;

	@ManyToOne
	@JoinColumn(name = "req_id")
	private Req req;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private Status status;

	@ManyToOne
	@JoinColumn(name = "directivo_id")
	private Directivo directivo;

	@ManyToOne
	@JoinColumn(name = "cfdi_id")
	private Cfdi cfdi;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "area_id")
	private Area area;

	@ManyToOne
	@JoinColumn(name = "proveedor_id")
	private Proveedor proveedor;

	public Odc() {

	}

	public Odc(Long id_odc, String descripcion, String factura, Date fecha, String flete, Double total, Req req,
			Status status, Directivo directivo, Cfdi cfdi, Usuario usuario, Area area, Proveedor proveedor) {
		this.id_odc = id_odc;
		this.descripcion = descripcion;
		this.factura = factura;
		this.fecha = fecha;
		this.flete = flete;
		this.total = total;
		this.req = req;
		this.status = status;
		this.directivo = directivo;
		this.cfdi = cfdi;
		this.usuario = usuario;
		this.area = area;
		this.proveedor = proveedor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId_odc() {
		return id_odc;
	}

	public void setId_odc(Long id_odc) {
		this.id_odc = id_odc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFlete() {
		return flete;
	}

	public void setFlete(String flete) {
		this.flete = flete;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Req getReq() {
		return req;
	}

	public void setReq(Req req) {
		this.req = req;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Directivo getDirectivo() {
		return directivo;
	}

	public void setDirectivo(Directivo directivo) {
		this.directivo = directivo;
	}

	public Cfdi getCfdi() {
		return cfdi;
	}

	public void setCfdi(Cfdi cfdi) {
		this.cfdi = cfdi;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Odc [id_odc=" + id_odc + ", descripcion=" + descripcion + ", factura=" + factura + ", fecha=" + fecha
				+ ", flete=" + flete + ", total=" + total + ", req=" + req + ", status=" + status + ", directivo="
				+ directivo + ", cfdi=" + cfdi + ", usuario=" + usuario + ", area=" + area + ", proveedor=" + proveedor
				+ "]";
	}

}
