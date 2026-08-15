public class w3t1 {
    public static void main(String[] args){
        double x1=2;
        double y1=3;
        
        double x2=1;
        double y2=4;
        
        double xdiff=x2-x1;
        double ydiff=y2-y1;
        
        double d=Math.hypot(xdiff,ydiff);
        System.out.println(d);
    }
    
}
