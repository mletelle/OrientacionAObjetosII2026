package unrn.punto6;

public class TortaBuilder {
    private Torta torta;

    private TortaBuilder(Torta torta) {
        this.torta = torta;
    }

    public Torta build() {
        return torta;
    }

    public static TortaBuilder chocolate() {
        return new TortaBuilder(new TortaChocolate());
    }

    public static TortaBuilder vainilla() {
        return new TortaBuilder(new TortaVainilla());
    }

    public static TortaBuilder frutilla() {
        return new TortaBuilder(new TortaFrutilla());
    }

    public TortaBuilder conBanioChocolate() {
        this.torta = new BanioChocolate(this.torta);
        return this;
    }

    public TortaBuilder conRockets() {
        this.torta = new Rockets(this.torta);
        return this;
    }
}
