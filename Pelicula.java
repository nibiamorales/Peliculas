import java.time.Year;

/**
 * Clase que modela una película del catálogo.
 * Autor: Nibia Morales
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int anioEstreno;
    private String genero;
    private int duracion; 

    public Pelicula(String titulo, String director, int anioEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(titulo).append("\n");
        sb.append("Director: ").append(director).append("\n");
        sb.append("Año de estreno: ").append(anioEstreno).append("\n");
        sb.append("Genero: ").append(genero).append("\n");
        sb.append("Duracion ").append(duracion).append(" min").append("\n");
        sb.append("Clásica: ").append(esClasica() ? "Sí" : "No").append("\n");
        return sb.toString();
    }

    public boolean esClasica() {
        int actual = Year.now().getValue();
        return (actual - anioEstreno) > 25;
    }

    public String toString() {
        return getInformacion();
    }

    public String getTitulo() {
        return titulo;
    }
}
