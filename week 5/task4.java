package javaapplication4;
import java.util.Scanner;
public class NewClass3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter n");
        int n=input.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(1.0/i);
        }
        System.out.println(sum);
        input.close();
    }
    
}
