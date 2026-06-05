package unrn.punto3;

class Producto {
    public TipoProducto tipo;
    public double precio;

    public Producto(TipoProducto tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public double precioFinal() {
        double impuestos = 0;
        double descuentos = 0;
        boolean envioGratis = false;

        if (tipo == TipoProducto.LIBRO) {
            impuestos = 0.1;
            descuentos = 0.1;
            if (precio > 100) {
                envioGratis = true;
            }
        } else if (tipo == TipoProducto.ALIMENTO) {
            impuestos = 0.05;
            if (precio > 100) {
                descuentos = 0.15;
            }
            if (precio > 200) {
                envioGratis = true;
            }
        } else if (tipo == TipoProducto.MEDICINA) {
            impuestos = 0;
            if (precio > 50) {
                descuentos = 0.1;
            }
            if (precio > 100) {
                envioGratis = true;
            }
        } else {
            impuestos = 0.15;
            if (precio > 50) {
                descuentos = 0.05;
            }
            if (precio > 200) {
                envioGratis = true;
            }
        }

        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }

        return total;
    }
}