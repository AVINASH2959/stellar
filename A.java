import java.util.Scanner;

interface Attack {
    int n = 10;   
    default void display() {
        System.out.println("Default display method in Attack interface");
    }
}
 
class B implements Attack {
    public void display() {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S = a.nextLine();
        System.out.println("You entered: " + S);
        System.out.println("Value of n: " + n);  
        a.close();  
    }
}

public class A {
    public static void main(String[] args) {
        B b = new B();  
        b.display(); 
    }
}
