package P1005;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        String[] aph = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Scanner in = new Scanner(System.in);
        String string1 = in.next();
        long sum=0;
        int i=0;
        for(i=0;i<string1.length();i++)
        {
            sum+=(int)(string1.charAt(i)-'0');
        }
        String a = sum+"";
        for(i=0;i<a.length();i++)
        {
            System.out.print(aph[(int)(a.charAt(i)-'0')]);
            if(i!=a.length()-1)
            {
                System.out.print(" ");
            }
        }

    }
}
