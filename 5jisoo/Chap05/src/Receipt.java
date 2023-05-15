import java.util.Scanner;

/**
 * Java - 반복문
 * 백준 예제 25304번
 */
public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAmount = sc.nextInt();
        int type = sc.nextInt();
        int checkPrice = 0;

        for (int i = 0; i < type; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();

            checkPrice += price * count;
        }

        if (checkPrice == totalAmount) {
            System.out.println("Yes");
        } else System.out.printf("No");
    }
}
