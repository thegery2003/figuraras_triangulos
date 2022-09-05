package figura;


public class figuras {

    String nombre;
    int lados;
    String clasificacion;

    //& los metodos abstract no pueden ser instanciadas (osea no se pueden utilizar dentro de esea clase)

    public figuras(String nombre, int lados, String clasificacion) {
        this.nombre = nombre;
        this.lados = lados;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }


    public int getLados() {
        return lados;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("lados: " + lados);
        System.out.println("clasificación: " + clasificacion);
    }
}