 import java.util.Scanner;

    public class Bai1B1 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Nhap vao so nguyen thu nhat: ");
            int n1= sc.nextInt();
            System.out.print("Nhap vao so nguyen thu hai: ");
            int n2=sc.nextInt();
            int tong=n1+n2;
            int hieu=n1-n2;
            int tich=n1*n2;
            int thuong=n1/n2;
            int du=n1%n2;
            System.out.println("Tong hai so nguyen la: "+tong);
            System.out.println("Hieu hai so nguyen la: "+hieu);
            System.out.println("Tich hai so nguyen la: "+tich);
            System.out.println("Thuong hai so nguyen la: "+thuong);
            System.out.println("Chia du hai so nguyen la: "+du);
        }
    }
