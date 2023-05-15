import java.util.Scanner;

/**
 * Java - 문자열
 * 백준 예제 11654번
 */
public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = s.charAt(0);

        System.out.printf("%d", i);
    }
}
