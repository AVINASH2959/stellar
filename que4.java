import java.util.*;
public class que4{
    public static void main(String[] args) {
        
    int height;
    Scanner sc=new Scanner(System.in);

    height=sc.nextInt();
     
    for(int i=0 ; i< height; i++)
    {
        for(int j=1;j< height-i;j++){
            System.out.println("*");
        }
        System.out.println("*");
    }




    }
}