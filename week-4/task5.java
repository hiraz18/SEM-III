public class NewClass2 {
    public static void main(String[] args) {
        int number = 100; 

        System.out.println("Starting number: " + number);

        while (number >= 10) {
            number = number / 2; 
            System.out.println("Current value: " + number);
        }
        
        System.out.println("Final value " + number + " is less than 10.");
    }
}   
