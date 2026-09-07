package com.mycompany.mavenproject2;
public class NewClass1 {
    public static void main(String[]args){
        int[]a={10,20,30,40,50};
        int last=a.length-1;
        int temp;
        temp=a[0];
        a[0]=a[last];
        a[last]=temp;
        for (int e:a){
            System.out.println(e);
        }
    }
    
}
