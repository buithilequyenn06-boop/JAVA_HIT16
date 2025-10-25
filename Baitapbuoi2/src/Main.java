import org.w3c.dom.ls.LSInput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Moi nhap vao so luong phan tu mang: ");
        int n= sc.nextInt();
        int[] A= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A["+ i +"]"+ "=");
            A[i]= sc.nextInt();
        }
        System.out.println("---Menu---");
        System.out.println("1. Tính tổng các phẩn tử trong mảng ");
        System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng");
        System.out.println("3. Sắp xếp lại mảng theo chiều tăng dần");
        System.out.println("4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra \"Không có\")");
        System.out.println("Nhập lựa chọn:");
        int choise;
        System.out.print("Moi nhap vao lua chon cua ban: ");
        choise= sc.nextInt();
        switch (choise){
            case 1:
                Utils.Sum(A);
                return;
            case 2:
                Utils.FindMinMax(A);
                return;
            case 3:
                Utils.Sort(A,n);
                return;
            case 4:
                Utils.MaxPrime(A);
                return;
        }
    }
}