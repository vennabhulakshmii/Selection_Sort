import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Take array input (you forgot this part)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean b = true;
        for (int i = 1; b; i++) {
            b = false;  // reset for each pass
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1] - (arr[j + 1] = arr[j]); // swap
                    b = true;
                } 
               
            }
        }

        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
       }

        sc.close();
    }
}
