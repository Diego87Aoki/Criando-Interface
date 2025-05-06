public abstract class PessoaMilitar implements Hierarquia {
    protected TipoDeArma arma;
    protected int patente;

    public PessoaMilitar(TipoDeArma arma, int patente) {
        this.arma = arma;
        this.patente = patente;
    }

    @Override
    public boolean superiorA(PessoaMilitar p) {
        return this.patente > p.patente;
    }

    @Override
    public boolean inferiorA(PessoaMilitar p) {
        return this.patente < p.patente;
    }

    @Override
    public boolean equivalenteA(PessoaMilitar p) {
        return this.patente == p.patente;
    }
}
