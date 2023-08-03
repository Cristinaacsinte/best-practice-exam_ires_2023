public class Subtraction implements Operation {
    private int subValOfShillings =0;
    private int subValOfPounds =0;

    public int SubtractionPence(int p1, int p2) {
        if (p1 < p2) {
            subValOfShillings -= 1;
            int sub = (12 + p1) - p2;
            return sub;
        } else {
            int sub = p1 - p2;
            return sub;
        }
    }

    public int SubtractionShillings(int s1, int s2) {
        s1-=subValOfShillings;
        if (s1 <s2) {
            subValOfPounds -= 1;
            int sub = (20 + s1) - s2;
            return sub;
        } else {
            int sub = s1 - s2;
            return sub;
        }
    }

    public int SubtractionPounds(int p1, int p2) {
        p1-=subValOfPounds;
        if (p1 < p2) {
            int sub = p1 - p2;
            System.out.println("imposible");
            return sub;
        } else {
            int sub = p1 - p2;
            return sub;
        }
    }
}
