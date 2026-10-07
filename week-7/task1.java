import java.util.Scanner;
public class rev {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = input.nextInt();

        int s = 0;          
        int e = n - 1;      
        int m;              
        boolean found = false;

        while (s <= e) {
            m = (s + e) / 2;

            if (arr[m] == target) {
                System.out.println("Element found at index: " + m);
                found = true;
                break;
            } 
            else if (arr[m] < target) {
                s = m + 1;
            } 
            else {
                e = m - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        input.close();
    }
}
