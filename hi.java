class math{
    void formula(){
        System.out.println("math formula");
    }
}
class chemistry extends math{
    void chemical(){
        System.out.println("chemical formula");
    }
}
public class hi {
    public static void main(String[]args){
        chemistry obj = new chemistry();
        obj.formula();
        obj.chemical();
    }
}