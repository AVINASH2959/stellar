import java.util.Scanner;
public class minandmax{
    public static void main(String[]args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=a.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter " +size+"number");
        for(int i=0;i<size;i++){
            arr[i] = a.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the minium element is" +min);
        System.out.println("the maximum element is" +max);

    }
}