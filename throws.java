public class throwgd{
    void Check-Age(int age){
        if (age<18){
            throw new ArithemticException("age must greater");
        }
        else{
            System.out..println("Access Granted");
        }
    }
    public static void main(String[]args){
        throo t= new throo();
        t.Check-Age(age:20);
        System.out.println("accse granted")
    }
}