package dominio;

public class prueba {
 private String nombre; 
  private String img;
  private String nombreImg;

    public prueba() {
    }

    public prueba(String nombre, String img, String nombreImg) {
        this.nombre = nombre;
        this.img = img;
        this.nombreImg = nombreImg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombreImg() {
        return nombreImg;
    }

    public void setNombreImg(String nombreImg) {
        this.nombreImg = nombreImg;
    }
   
  
}
