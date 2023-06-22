package Felinos;
public class lince extends Felinos {
    public String carac;
    String tamanio;
    int subespecie;
    public lince(String nombre_felino, String nom_cientifico, String habitad,
                 String carac, String tamanio, int subespecie) {
        super(nombre_felino, nom_cientifico, habitad);
        this.carac =carac;
        this.tamanio =tamanio;
        this.subespecie=subespecie;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getSubespecie() {
        return subespecie;
    }

    public void setSubespecie(int subespecie) {
        this.subespecie = subespecie;
    }

    private void especiesLince(){
        System.out.println("Las especies mas emblematicas son: ");
        System.out.println("Lince iberico - (Lynx pardinus)");
        System.out.println("Lince rojo o gato montés (Lynx rufus)");
        System.out.println("Lince boreal o eurasiático (Lynx lynx)");
        System.out.println("Lince canadiense (Lynx canadensis)");
    }
    private void reproducion(){
        System.out.println("Para que esta especie pueda crecer se los tienen en cautiverio");
        System.out.println("Estos cautiverios se encuentran ubicados al Sur de la Península Ibérica, en el Parque Natural y Nacional de Doñana. ");
    }
    private  void funcion(){
        System.out.println("Controlan las presas y mantienen la biodiversidad");
    }
    private void alimento(){
        System.out.println("Lo que mas les gusta comer es: ");
        System.out.println("Los lagomorfos (conejos, liebres, etc) y roedores");
    }
    public void imprimirD(){
        System.out.println("Sus carcateristicas son: "+carac);
        System.out.println("Su tamaño es: "+tamanio );
        System.out.println("Tiene " + subespecie);
        alimento();
        reproducion();
        funcion();
    }
}
