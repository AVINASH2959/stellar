class matho{
    void formula(){
        System.out.println("math formula");
    }
}
class chem extends math{
    void chemical(){
        System.out.println("chemical formula");
    }
}
class bio extends chem{
    void bio (){
        System.out.println("biology formula");
    }
}
public class dse {
    public static void main(String[]args){
        bio obj = new bio();
        obj.formula();
        obj.chemical();
        obj.bio();
    }
}