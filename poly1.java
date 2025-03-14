class calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class poly1{
    public static void main (String[]args){
        calculator c = new calculator();
        
                System.out.println(c.add(1,2));
        System.out.println(c.add(1.5,3.5));
      }
} 