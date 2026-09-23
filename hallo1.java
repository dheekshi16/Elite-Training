import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        int n = ref.nextInt();

        
        if (n % 2 == 0) {
            n--;
        }

        // Upper half
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    System.out.print(j + 1);
                else if (j >= n - i - 1)
                    System.out.print(n - j);
                else
                    System.out.print(i + 1);
            }
            System.out.println();
        }

        // Lower half
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    System.out.print(j + 1);
                else if (j >= n - i - 1)
                    System.out.print(n - j);
                else
                    System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
