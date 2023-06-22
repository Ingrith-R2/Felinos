package Felinos;
public class jaguar extends Felinos {
    public String carac;
    double porcentaje_perdida;
    public jaguar(String nombre_felino, String nom_cientifico, String habitad,
                  String carac, double porcentaje_perdida) {
        super(nombre_felino, nom_cientifico, habitad);
        this.carac =carac;
        this.porcentaje_perdida=porcentaje_perdida;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public double getPorcentaje_perdida() {
        return porcentaje_perdida;
    }

    public void setPorcentaje_perdida(double porcentaje_perdida) {
        this.porcentaje_perdida = porcentaje_perdida;
    }

    private void defender(){
        System.out.println("Su madre puede defenderlos de cualquier animal e incluso de su padre" );
    }

    private void nadador(){
        System.out.println("Se los puede observar la mayor parte del tiempo nadando");
    }

    private void caza(){
        System.out.println("Sus presas son capturadas y arrastradas hasta un lugar seguro durante las noches");
    }

    public void imprimirD(){
        System.out.println("Sus carcateristicas son: "+carac);
        System.out.println("La perdida de su habitad es del "+porcentaje_perdida+"%");
        defender();
        nadador();
        caza();
    }

}
