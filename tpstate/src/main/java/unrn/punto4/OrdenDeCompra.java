package unrn.punto4;

import java.util.ArrayList;
import java.util.List;

public class OrdenDeCompra {
    static final String MSG_ERROR_PREPARACION = "La orden solo puede pasar a preparacion desde iniciada";
    static final String MSG_ERROR_SIN_PRODUCTOS = "La orden debe tener al menos un producto";
    static final String MSG_ERROR_ENVIAR = "La orden solo puede enviarse desde en preparacion";
    static final String MSG_ERROR_CANCELAR = "La orden no puede cancelarse en este estado";
    static final String MSG_ERROR_AGREGAR_PRODUCTO = "No se pueden agregar productos en este estado";
    private EstadoOrden estado;
    private List<Producto> productos;
    private double monto;
    private String numeroSeguimiento;

    public OrdenDeCompra() {
        this.estado = new EstadoIniciada(this);
        this.productos = new ArrayList<>();
        this.monto = 0;
        this.numeroSeguimiento = null;
    }

    public void agregarProducto(Producto producto) {
        this.estado.agregarProducto(producto);
    }

    public void confirmarCompra() {
        this.estado.confirmarCompra();
    }

    public void enviar() {
        this.estado.enviar();
    }

    public void cancelar() {
        this.estado.cancelar();
    }

    public String estado() {
        return this.estado.estado();
    }

    public double monto() {
        return this.monto;
    }

    public String numeroSeguimiento() {
        return this.numeroSeguimiento;
    }

    public List<Producto> productos() {
        return new ArrayList<>(this.productos);
    }

    private double calcularMonto() {
        return this.productos.stream().mapToDouble(Producto::precio).sum();
    }

    private String generarNumeroSeguimiento() {
        return "SEG-" + System.currentTimeMillis();
    }

    void agregar(Producto p) {
        this.productos.add(p);
    }

    void aPreparacion() {
        if (this.productos.isEmpty()) {
            throw new IllegalStateException(MSG_ERROR_SIN_PRODUCTOS);
        }
        this.monto = calcularMonto();
        this.estado = new EstadoEnPreparacion(this);
    }

    void aCancelada() {
        this.estado = new EstadoCancelada(this);
    }

    void aEnviada() {
        this.numeroSeguimiento = generarNumeroSeguimiento();
        this.estado = new EstadoEnviada(this);
    }
}