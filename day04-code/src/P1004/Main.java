package P1004;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        if(N==0)
        {
            return;
        }
        int M = in.nextInt();
        //注意空节点的情况
        //读取量表
        int[][] List1 = new int[100][3];
        int sum =0; //目前已经使用的节点的数量;
        int i=0;
        int K = 0;
        int layer =0;
        int status =0;
        int max_layer =0;
        int a;
        while(in.hasNextInt())
        {
            K = in.nextInt();
            status =0;
            for(i=0;i<sum;i++)
            {
                if(List1[i][0]==K)
                {
                    status =1;
                    List1[i][2] = 1; //标记为不是no-leaf Node
                    layer = List1[i][1];
                }
            }
            if(status ==0)
            {
                List1[sum][0] = K;
                List1[sum][2] = 1;
                List1[sum][1] = 0;
                layer = 0;
                sum++;
            }
            K = in.nextInt();
            i=0;
            while(i<K)
            {
                a = in.nextInt();
                List1[sum][0] = a;
                List1[sum][1] = layer+1;
                if(layer+1>max_layer)
                {
                    max_layer = layer+1;
                }
                List1[sum][2] =0;
                sum++;
                i++;
            }
            if(sum ==N)
            {
                break;
            }
        }
        i=0;
        int[] result = new int[10];
        while(i<N)
        {
            if(List1[i][2]==0)
            {
                result[List1[i][1]]++;
            }
            i++;
        }
        for(i=0;i<=max_layer;i++)
        {
            System.out.print(result[i]);
            if(i !=max_layer) {
                System.out.print(' ');
            }
        }
    }
}
