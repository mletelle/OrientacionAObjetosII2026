package unrn.punto2;

//double dispatch
public enum Tarjeta {
    VISA {
        @Override
        public double descontarBebida(double precio) {
            return precio * 0.97;
        }

        @Override
        public double descontarPlato(double precio) {
            return precio;
        }
    },
    MASTERCARD {
        @Override
        public double descontarBebida(double precio) {
            return precio * 0.98;
        }

        @Override
        public double descontarPlato(double precio) {
            return precio;
        }
    },
    COMARCA {
        @Override
        public double descontarBebida(double precio) {
            return precio * 0.98;
        }

        @Override
        public double descontarPlato(double precio) {
            return precio * 0.98;
        }
    },
    OTRA {
        @Override
        public double descontarBebida(double precio) {
            return precio;
        }

        @Override
        public double descontarPlato(double precio) {
            return precio;
        }
    };

    public abstract double descontarBebida(double precio);

    public abstract double descontarPlato(double precio);
}
