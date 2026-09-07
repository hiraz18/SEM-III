package com.mycompany.mavenproject2;
public class NewClass {
    public static void main(String[]args){
        int n=12;
        int count=0;
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}

