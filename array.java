import java util.*;
class array{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        //int[] a=new int[10];
        //System.out.println("hello");
       /* int[] ros;
        ros=new int[5];
        String arr=new String[4];
        System.out.println(arr[0]);*/
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=56;
        arr[2]=79;

        arr[3]=89;

        arr[4]=98;
        System.out.println(arr[3]);
        for(int i=0;i<arr.length;i++)
        {
        arr[i] = in.nextInt();
        }
    }



}
