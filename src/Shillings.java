public class Shillings extends Pence {


    private final int valore;
    private final Pence pence;

    public Shillings(Pence pence) {
        super(pence);
        this.valore = 12;
        this.pence = pence;
    }

    public int getValore() {
        return valore;
    }

    public Pence getPence() {
        return pence;
    }

}
