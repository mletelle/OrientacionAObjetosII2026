package unrn.punto4;

public class ComboBuilder {
    private Combo combo;

    public ComboBuilder(Combo combo) {
        this.combo = combo;
    }

    public static ComboBuilder basico() {
        return new ComboBuilder(new ComboBasico());
    }

    public static ComboBuilder familiar() {
        return new ComboBuilder(new ComboFamiliar());
    }

    public static ComboBuilder especial() {
        return new ComboBuilder(new ComboEspecial());
    }

    public ComboBuilder conTomate() {
        this.combo = new ConTomate(this.combo);
        return this;
    }

    public ComboBuilder conPapas() {
        this.combo = new ConPapas(this.combo);
        return this;
    }

    public ComboBuilder conCarne() {
        this.combo = new ConCarne(this.combo);
        return this;
    }

    public ComboBuilder conQueso() {
        this.combo = new ConQueso(this.combo);
        return this;
    }

    public Combo build() {
        return this.combo;
    }
}
