import java.util.Scanner;

public class Bai2B1 {
    public static void main(String[] args) {
        System.out.print("Moi nhap vao so giay: ");
        Scanner sc=new Scanner(System.in);
        int sogiay=sc.nextInt();
        int gio=sogiay/3600;
        int phut=sogiay%3600/60;
        int giay=sogiay%60;
        System.out.println(gio+" Gio "+phut+" Phut "+giay+" giay ");
    }
}