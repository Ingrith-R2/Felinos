package Felinos;
public class guepardo extends Felinos {
    public  String carac;
    double peso;
    public guepardo(String nombre_felino, String nom_cientifico, String habitad,
                    String carac, double peso) {
        super(nombre_felino, nom_cientifico, habitad);
        this.carac=carac;
        this.peso=peso;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void alimento(){
        System.out.println("Alimentado por gacelas, ñus y liebres 'Dependiedo la zona'");
    }

    private void relacion(){
        System.out.println("Se los puede relacionar con: ");
        System.out.println("Los gatos montese, liences y pumas");
    }

    private void caza(){
        System.out.println("Puede realizar su caza gracias a su espectacular vision y velocidad. ");
    }

    public void imprimirD(){
        System.out.println("Sus carcateristicas son: "+carac);
        System.out.println("Su peso promedio es: "+peso);
        alimento();
        relacion();
        caza();
    }


}
