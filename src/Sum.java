public class Sum implements Operation {
    private static int addValorePence;
    private static int addValoreShillings;


    public int sumPence(int p1, int p2) {
        if ((p1 + p2) >= 12) {
            int sum = (p1 + p2) - 12;
            addValorePence += 1;
            return sum;
        } else {
            int sum = p1 + p2;
            return sum;
        }
    }

    public int sumShillings(int s1, int s2) {
        if ((s1 + s2) >= 20) {
            int sum = (s1 + s2 + addValorePence) - 20;
            addValoreShillings += 1;
            return sum;
        } else {
            int sum = s1 + s2 + addValorePence;
            return sum;
        }
    }

    public int sumPounds(int p1, int p2) {
        int sum = p1 + p2 + addValoreShillings;
        return sum;
    }

}

