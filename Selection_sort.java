import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Take array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n ; i++) {
            int ind = i;
            for (int j = i ; j < n; j++) {
                if (arr[ind] > arr[j]) {
                    ind = j;
                }
            }
            // swap arr[ind] and arr[i] (your style)
            arr[ind] = arr[ind] + arr[i] - (arr[i] = arr[ind]);
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
