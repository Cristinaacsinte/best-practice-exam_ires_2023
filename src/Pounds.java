public class Pounds extends Shillings {
    private final int valore;
    private final Shillings shillings;


    public Pounds(Pence pence, Shillings shillings) {
        super(pence);
        this.valore = 20;
        this.shillings = shillings;
    }

    public int getValore() {
        return valore;
    }

    public Shillings getShillings() {
        return shillings;
    }
}
