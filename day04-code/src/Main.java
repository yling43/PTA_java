import java.util.Scanner;
public class Main{
    public static void printff(double a)
    {
        if(a -(int)a ==0)
        {
            System.out.print((int)a);
            return;
        }
        System.out.print(a);
        return;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i=0;
        double[][] list1 =new double[10][2];
        double[][] list2 =new double[10][2];
        double[][] result = new double[20][2];
        int K1 = in.nextInt();
        i =0;
        while(i<K1)
        {
            list1[i][0] = in.nextDouble();
            list1[i][1] = in.nextDouble();
            i++;
        }

        int K2 = in.nextInt();
        i =0;
        while(i<K2)
        {
            list2[i][0] = in.nextDouble();
            list2[i][1] = in.nextDouble();
            i++;
        }
        int j=0;
        i=0;
        int K3 = 0;
        while((i<K1)&(j<K2))
        {
            if(list1[i][0]<list2[j][0])
            {
                result[K3][0] = list2[j][0];
                result[K3][1] = list2[j][1];
                K3++;
                j++;
            }
            else{
                if(list1[i][0]>list2[j][0])
                {
                    result[K3][0] = list1[i][0];
                    result[K3][1] = list1[i][1];
                    K3++;
                    i++;
                }
                else
                {
                    result[K3][0] = list1[i][0];
                    result[K3][1] = list1[i][1]+list2[j][1];
                    K3++;
                    i++;
                    j++;
                }
            }
        }
        while(i<K1)
        {
            result[K3][0] = list1[i][0];
            result[K3][1] = list1[i][1];
            K3++;
            i++;
        }
        while(j<K2){
            result[K3][0] = list2[j][0];
            result[K3][1] = list2[j][1];
            K3++;
            j++;
        }
        System.out.print(K3);
        System.out.print(' ');
        i =0;
        while(i<K3)
        {
            printff(result[i][0]);
            System.out.print(' ');
            printff(result[i][1]);
            if(i+1!=K3)
                System.out.print(' ');
            i++;
        }
    }
        }