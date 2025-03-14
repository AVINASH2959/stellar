class car{
    int speedlimit=1234;
}


class audi extends car{
    int speedlimit=123;
    void show(){
        System.out.println("speed limite is :"+super.speedlimit);
        System.out.println("local :" +speedlimit);
    }
}
 
public class key{
    public static void  main (String[]args){
         audi d= new audi();
         d.show();
    }
}