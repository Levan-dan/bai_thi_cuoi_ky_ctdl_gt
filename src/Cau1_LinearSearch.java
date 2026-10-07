public class Cau1_LinearSearch {


    //      Các bước Mã giả

//        Hàm TimKiemTuyenTinh(a, n, x)
//    For i ← 1 to n do
//        Nếu a[i] = x thì
//            Trả về i
//        Kết thúc nếu
//    Kết thúc For
//
//    Trả về -1
//Kết thúc hàm
//
//Bắt đầu
//    Nhập n
//    Nhập mảng a[1...n]
//    Nhập x
//
//    Vị trí ← TimKiemTuyenTinh(a, n, x)
//
//    Nếu Vị trí ≠ -1 thì
//        Xuất "Tìm thấy tại vị trí", Vị trí
//    Ngược lại
//        Xuất "Không tìm thấy"
//    Kết thúc nếu
//Kết thúc



//    Thuật toán

    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 9, 10, 30};

        int x = 8;

        int result = search(arr, x);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + result);
        }
    }
}