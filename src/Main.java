import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập chuỗi: ");
        string = scanner.nextLine();
        char[] arrStr;
        arrStr = string.toCharArray();
        System.out.println("Số lần xuất hiện ký tự: " + checkOccurrences(arrStr));
    }
    public static int checkOccurrences(char[] arr){
        String checkString;
        int count = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập ký tự để kiểm tra ");
        checkString = scanner1.nextLine();
        char[] stringCheck = checkString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (stringCheck[0] == arr[i]){
                count++;
            }
        }
        return count;
    }
}
