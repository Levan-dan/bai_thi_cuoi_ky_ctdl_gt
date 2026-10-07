import java.util.Arrays;

public class Cau2_BubbleSort {

//    Các bước mã giả

//Bắt đầu
//    Nhập n
//    Nhập mảng a[1...n]
//
//    For i ← 1 to n-1 do
//        For j ← 1 to n-i do
//            Nếu a[j] > a[j+1] thì
//                Đổi chỗ a[j] và a[j+1]
//            Kết thúc nếu
//        Kết thúc For
//    Kết thúc For
//
//    Xuất mảng a
//Kết thúc
//


    //    Thuật toán
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 9, 2};

        System.out.println("Original array: "
                + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Array after sorting: "
                + Arrays.toString(arr));
    }
}