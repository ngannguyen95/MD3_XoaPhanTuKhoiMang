import java.util.Arrays;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 5, 54, 46, 48, 4, 8, 14, 86};

        System.out.print("Phần tử mảng gồm: "+ Arrays.toString(arr));

        System.out.println("\n"+"Nhập vào phần tử cần xóa: ");
        int inputNumber = scanner.nextInt();
        int[] newArr = new int[arr.length - 1];

        // vị trí của phần tử cần xoa
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inputNumber) {
                arr[i] = arr[i + 1];
                System.out.println("Vị trí của phần tử trong mảng: " + i);
            }
        }
        // xử lí mảng mới
        System.out.println("Phần tử mảng mới gồm: ");
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]= arr[i];
        }
        System.out.print(" Mảng mới"+ Arrays.toString(newArr));
    }
}
