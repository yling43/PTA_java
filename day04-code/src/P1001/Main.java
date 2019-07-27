package P1001;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b = in.nextInt();
        int c =a+b;
        boolean sign = true;
        if(c<0)
        {
            System.out.print('-');
        }
        c = Math.abs(c);
        if(c<1000)
        {
            System.out.print(c);
            return;
        }
        else
        {
            char[] list = new char[10];
            int i = 0;
            while(c != 0)
            {
                list[i] = (char)(c%10+'0');
                c = c/10;
                i++;
                if(((i+1)%4==0)&(c!=0)){
                    list[i] = ',';
                    i++;
                }
            }
            while(i!=0)
            {
                i--;
                System.out.print(list[i]);
            }
        }
    }
}
