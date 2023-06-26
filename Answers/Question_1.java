import java.util.Scanner;
public class Question_1 {
    static void moveZerosEnd(int[] arr)
    {
//        bubble sort
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]==0)
                {
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       int  n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        moveZerosEnd(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}