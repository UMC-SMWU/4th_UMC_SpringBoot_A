import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m,t,tm,th;
        h= sc.nextInt(); m= sc.nextInt(); t=sc.nextInt();
        tm=t%60; th=t/60;

        if (tm+m>=60) {
            h=h+th+1;
            if(h>=24) {h-=24;}
            m=(tm+m)-60;
        } else {
            h+=th;
            if(h>=24) {h-=24;}
            m+=tm;
        }
        System.out.println(h+" "+m);
    }
}