import java.util.Scanner;

public class nested{
     public static void main(String[]args){
        Scanner av=new Scanner (System.in);
        int mark= av.nextInt();
        if(mark>35){
            System.out.println("pass");
                if(mark<=80){
                    System.out.println(" above 80");
                    if(mark==100){
                        System.out.println("centam");
                    }
                }
            }
                else{
                    System.out.println("faill");
                }
            
        }
     }

