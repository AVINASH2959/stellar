import java.util.Scanner;

public class finallymckxok{
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println(e);

        }
        finally{
            System.out.println("operation pending");        }
    }
}