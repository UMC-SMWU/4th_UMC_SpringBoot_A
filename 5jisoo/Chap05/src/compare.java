import java.util.Scanner;

/**
 * Java - 조건문
 * 백준 예제 1330번
 *
 * 참고로 백준에서 Java 파일 제출을 위해선 class 이름을 Main으로 바꿔주어야 함.
 */
public class compare {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) System.out.println(">");
        else if (a < b) System.out.println("<");
        else System.out.println("==");
    }
}