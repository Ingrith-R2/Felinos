package Felinos;
public class leopardo extends Felinos {
    public String carac;
    String habitos;
    public leopardo(String nombre_felino, String nom_cientifico, String habitad, String carac, String habitos) {
        super(nombre_felino, nom_cientifico, habitad);
        this.carac = carac;
        this.habitos = habitos;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }
    private void caza(){
        System.out.println("Caza principalmente en las noches, es una estrategia ");
    }
    private  void leopardos(){
        System.out.println("Se puede encontrar otros tipos de leopardo como: ");
        System.out.println("Leopardo de las nieves (Panthera uncia).");
        System.out.println("Leopardo de Amur (Panthera pardus orientalis).");
        System.out.println("Leopardo longibando o pantera nebulosa (Neofelis nebulosa).");

    }
    private void alimento(){
        System.out.println("Lo que mas les gusta comer es: ");
        System.out.println("Aves, reptiles, roedores o artropodos (Presas de entre 10 a 40kg)");
    }
    public void imprimirD(){
        System.out.println("Sus carcateristicas son: "+carac);
        System.out.println("Sus habitos son: "+habitos );
        alimento();
        caza();
        leopardos();
    }
}
