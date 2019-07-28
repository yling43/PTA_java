package P1006;



import java.util.Scanner;
class Node{
    String name;
    int begin_time;
    int end_time;
    Node(String string)
    {
        String[] list = string.split(" ");
        name = list[0];
        String[] time = list[1].split(":");
        int a = Integer.parseInt(time[0])*3600;
        a = Integer.parseInt(time[1])*60;
        a = Integer.parseInt(time[2]);
        begin_time = Integer.parseInt(time[0])*3600+Integer.parseInt(time[1])*60+Integer.parseInt(time[2]);
        time = list[2].split(":");
        end_time = Integer.parseInt(time[0])*3600+Integer.parseInt(time[1])*60+Integer.parseInt(time[2]);
    }
}
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String num1 = in.nextLine();
        int num = Integer.parseInt(num1);
        Node max;
        Node min;
        Node Node1 = new Node(in.nextLine());
        max = Node1;
        min = Node1;
        int i =0;
        while(in.hasNextLine())
        {
            Node Node2 = new Node(in.nextLine());
            if(Node2.begin_time<min.begin_time)
            {
                min = Node2;
            }
            if(Node2.end_time>max.begin_time)
            {
                max = Node2;
            }
            Node2 = null;
        }
        System.out.print(min.name);
        System.out.print(" ");
        System.out.print(max.name);
    }
}
