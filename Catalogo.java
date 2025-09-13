import java.util.ArrayList;

public class Catalogo {
    private final ArrayList<Pelicula> peliculas;

    public Catalogo() {
        this.peliculas = new ArrayList<>();
    }

    /** Añade una película al catálogo. Ignora nulos. */
    public void agregarPelicula(Pelicula pelicula) {
        if (pelicula != null) {
            peliculas.add(pelicula);
        }
    }

 public String getPeliculas() {
        if (peliculas.isEmpty()) {
            return "No hay películas en el catálogo.\n";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < peliculas.size(); i++) {
            sb.append("— Película #").append(i + 1).append(" —\n");
            sb.append(peliculas.get(i).getInformacion());
            sb.append("------------------------------\n");
        }
        return sb.toString();
    }


    public Pelicula buscarPeliculaPorTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Título inválido.");
            return null;
        }
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo.trim())) {
                System.out.println("Se encontró el título:\n" + p.getInformacion());
                return p;
            }
        }
        System.out.println("Título no encontrado: " + titulo);
        return null;
    }

    @Override
    public String toString() {
        return "Catálogo con " + peliculas.size() + " película(s)";
    }
}
