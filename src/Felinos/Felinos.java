package Felinos;
public class Felinos {

    String nombre_felino;
    String nom_cientifico;
    String habitad;

    public Felinos(String nombre_felino, String nom_cientifico, String habitad) {
        this.nombre_felino = nombre_felino;
        this.nom_cientifico = nom_cientifico;
        this.habitad = habitad;
    }

    public String getNombre_felino() {
        return nombre_felino;
    }

    public void setNombre_felino(String nombre_felino) {
        this.nombre_felino = nombre_felino;
    }

    public String getNom_cientifico() {
        return nom_cientifico;
    }

    public void setNom_cientifico(String nom_cientifico) {
        this.nom_cientifico = nom_cientifico;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public void imprimirDatos(){
        System.out.println("El nombre del felinoe es: "+ nombre_felino);
        System.out.println("El nombre cientifico del felino es: "+ nom_cientifico );
        System.out.println("EL habitad del felino es: "+ habitad);
    }
}
