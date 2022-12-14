package dominio;
import java.io.InputStream;
public class ColectivodeArtesPopulares {
    private int id;
     private String carusel;
    private String historia;
    private String imgHistoria;
    private String Mision;
    private String Vision;

    public ColectivodeArtesPopulares() {
    }

    public ColectivodeArtesPopulares(int id, String carusel, String historia, String imgHistoria, String Mision, String Vision) {
        this.id = id;
        this.carusel = carusel;
        this.historia = historia;
        this.imgHistoria = imgHistoria;
        this.Mision = Mision;
        this.Vision = Vision;
    }

    public ColectivodeArtesPopulares(String historia, String imgHistoria, String Mision, String Vision,int id ) {
        this.id = id;
        this.historia = historia;
        this.imgHistoria = imgHistoria;
        this.Mision = Mision;
        this.Vision = Vision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarusel() {
        return carusel;
    }

    public void setCarusel(String carusel) {
        this.carusel = carusel;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getImgHistoria() {
        return imgHistoria;
    }

    public void setImgHistoria(String imgHistoria) {
        this.imgHistoria = imgHistoria;
    }

    public String getMision() {
        return Mision;
    }

    public void setMision(String Mision) {
        this.Mision = Mision;
    }

    public String getVision() {
        return Vision;
    }

    public void setVision(String Vision) {
        this.Vision = Vision;
    }

 
    
    
    
    
}
