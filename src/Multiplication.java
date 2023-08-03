public class Multiplication implements Operation {
    private int mulValOfShillings=0;
    private int mulValOfPounds=0;

    public int multiplicationPence(int p1, int p2){
        int mul= p1*p2;
        if (mul>=12){
            int res=mul-12;
            mulValOfShillings+=1;
            return res;
        }else return mul;
    }
    public int multiplicationShillings(int s1, int s2){
        int mul= (s1*s2)+mulValOfShillings;
        if (mul>=20){
            int res=mul-20;
            mulValOfPounds+=1;
            return res;
        }else return mul;
    }
    public int multiplicationPound(int p1, int p2){
        int mul= (p1*p2)+mulValOfPounds;
        return mul;
    }
}
