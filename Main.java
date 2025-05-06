public class Main {
    public static void main(String[] args) {
        Soldado soldadoAssis = new Soldado(TipoDeArma.INFANTARIA);
        Capitao capitaoAmerica = new Capitao(TipoDeArma.ARTILHARIA);
        General generalJulio = new General(TipoDeArma.CAVALARIA);

        System.out.println("General > Soldado? " + generalJulio.superiorA(soldadoAssis)); // true
        System.out.println("Capitão < Soldado? " + capitaoAmerica.inferiorA(soldadoAssis)); // false
        System.out.println("Soldado == Soldado? " + soldadoAssis.equivalenteA(new Soldado(TipoDeArma.ARTILHARIA))); // true
    }
}
