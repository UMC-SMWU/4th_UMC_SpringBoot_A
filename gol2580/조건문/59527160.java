import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,result, max;
        a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
        if(a==b&&b==c) {
            result=10000+a*1000;
        } else if(a!=b&&b!=c&&a!=c) {
            if(a>b) {
                if(a>c) {max=a;}
                else {max=c;}
            }
            else {
                if(b>c) {max=b;}
                else {max=c;}
            }
            result=max*100;
        } else {
            if(a==b || a==c) {result=1000+a*100;}
            else {result=1000+b*100;}
        }
        System.out.println(result);
    }

}
