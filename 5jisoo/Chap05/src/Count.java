import java.util.Scanner;

/**
 * Java - 1차원 배열
 * 백준 예제 10807번
 */
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int search = sc.nextInt();
        int count = 0;

        for (int num : nums) {
            if (num == search) {
                count ++;
            }
        }

        System.out.println(count);
    }
}
