public class Division implements Operation {
    private int resOfPounds;
    private int resOfShillings;
    private int resOfPence;
    public int divisioOfPounds(int p1,int p2){
        if(p1<p2){
            System.out.println("operazione impossibile ");
            return -1;
        }else {
            int div= Math.floorDiv(p1, p2);
            resOfPounds= p1-(p2*div);
            return div;
        }
    }
    public int divisioOfShillings(int s1,int s2){
        s1+=resOfPounds*20;
        if(s1<s2){
            System.out.println("operazione impossibile ");
            return -1;
        }else {
            int div= Math.floorDiv(s1, s2);
            resOfShillings= s1-(s2*div);
            return div;
        }
    }
    public int divisioOfPence(int p1,int p2){
        p1+=resOfShillings*12;
        if(p1<p2){
            System.out.println("operazione impossibile ");
            return -1;
        }else {
            int div= Math.floorDiv(p1, p2);
            resOfPence= p1-(p2*div);
            return div;
        }
    }

}
