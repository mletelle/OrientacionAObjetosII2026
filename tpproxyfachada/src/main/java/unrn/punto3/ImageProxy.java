package unrn.punto3;

public class ImageProxy implements Image {
    private String path;
    private Image imagen;

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (imagen == null) {
            imagen = new ImageFile(path);
        }
        imagen.display();
    }
}
