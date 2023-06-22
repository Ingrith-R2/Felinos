package Felinos;
public class tigre extends Felinos {
    public String carac;
    int subespecies;
    public tigre(String nombre_felino, String nom_cientifico,
                 String habitad, String carac, int subespecies) {
        super(nombre_felino, nom_cientifico, habitad);
        this.carac = carac;
        this.subespecies = subespecies;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public int getSubespecies() {
        return subespecies;
    }

    public void setSubespecies(int subespecies) {
        this.subespecies = subespecies;
    }
    private void saltar(){
        System.out.println("Es uno de los felinos que mas alto salta");
    }

    private void correr(){
        System.out.println("Se le puede comparar con los leopardos ya que el tigre puede  alcanzar" +
                "una velocidad de hasta 90 kilometros por hora");
    }

    private void pelea(){
        System.out.println("El tigre supera al leon por poco en sus colmillos y tamaño de garras ");
    }

    public void imprimirD(){
        System.out.println("Sus carcateristicas son: "+carac);
        System.out.println("El numero de subespecies es "+subespecies);
        saltar();
        correr();
        pelea();
    }

}
