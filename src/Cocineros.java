public class Cocineros {
    public String nombre;
    public int experiencia;
    public String especialidad;
    public Cocineros(String nombre, int experiencia, String especialidad) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Experiencia: " + experiencia+ " años");
        System.out.println("Especialidad: " + especialidad);
    }
}
