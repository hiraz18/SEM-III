import java.util.Scanner; 

public class NewClass4 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a starting number: "); 
        int number = scanner.nextInt(); 
        
        System.out.println("Starting number: " + number); 
        
        while (number >= 10) { 
            number = number / 2; 

            System.out.println("Current value: " + number); 
        } 
        

        System.out.println("Final value " + number + " is less than 10."); 
        
        scanner.close(); 
    } 
}
