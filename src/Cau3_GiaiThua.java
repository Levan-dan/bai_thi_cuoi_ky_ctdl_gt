import java.util.Scanner;

public class Cau3_GiaiThua {

//    Các bước mã giả

//Bắt đầu
//
//    Nhập n
//
//    Hàm GiaiThua(n)
//        Nếu n = 0 thì
//            Trả về 1
//        Ngược lại
//            Trả về n × GiaiThua(n - 1)
//        Kết thúc nếu
//    Kết thúc hàm
//
//    Kết quả ← GiaiThua(n)
//
//    Xuất Kết quả
//
//Kết thúc



//    Thuật toán
    public static int tinhGiaiThua(int n) {

        if (n == 0) {
            return 1;
        }

        return n * tinhGiaiThua(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number n: ");

        int n = scanner.nextInt();

        int result = tinhGiaiThua(n);

        System.out.println(n + "! = " + result);
    }
}