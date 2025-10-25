public class Utils {
    public static void Sum(int[] A) {
        int sum = 0;
        for (int x : A)
            sum += x;
        System.out.println("1. Tong cac phan tu trong mang la: " + sum);
    }

    public static void FindMinMax(int[] A) {
        int min = A[0];
        int max = A[0];
        for (int x : A) {
            if (x < min)
                min = x;
            if (x > max)
                max = x;
        }
        System.out.println("2.1. Phan tu nho nhat trong mang la: " + min);
        System.out.println("2.2. Phan tu lon nhat trong mang la: " + max);
    }

    public static void Sort(int[] A, int n) {
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = i + 1; j < n; j++)
                if (A[j] < A[m])
                    m = j;
            if (m != i) {
                int tg = A[m];
                A[m] = A[i];
                A[i] = tg;
            }
        }
        System.out.println("3. Mang sau khi sap xep tang la: ");
        for (int x : A)
            System.out.print(x + " ");
    }

    public static boolean Prime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void MaxPrime(int[] A) {
        int MaxPrime = -1;
        for (int x : A) {
            if (Prime(x) && x > MaxPrime)
                MaxPrime = x;
        }
        if (MaxPrime != -1)
            System.out.println("4. So nguyen to lon nhat trong mang la: " + MaxPrime);
        else
            System.out.println("4. Khong co");
    }
}
