
public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Pelicula p1 = new Pelicula("Casa Blanca", "Michael Curtiz", 1942, "Romance/Drama", 102);
        Pelicula p2 = new Pelicula("Annie Hall", "Woody Allen", 1977, "Comedia/Romance", 93);
        Pelicula p3 = new Pelicula("Eterno resplandor de una mente sin recuerdos", "Michel Gondry", 2004, "Romance/Drama", 108);

        catalogo.agregarPelicula(p1);
        catalogo.agregarPelicula(p2);
        catalogo.agregarPelicula(p3);

        System.out.println(" LISTA DE PELICULAS ");
        System.out.print(catalogo.getPeliculas());

        System.out.println(" BUSQUEDA POR TÍTULO ");
        catalogo.buscarPeliculaPorTitulo("Casa Blanca"); // Eencuentra
        catalogo.buscarPeliculaPorTitulo("No existe");   // no encuentra
    }
}
