interface a{
    int i=10;
    void show();
}
interface b{
    int a=100;
    void dis();
}
interface c{
    int v=100;
    void res();
}
class demo{
        void demoo(){
            System.out.println("This is  demo class");
        }

}
class ny extends demo implements a,b,c{
    public void show(){
        System.out.println(i);
    }
    public void dis(){
        System.out.println(a);
    } public void res(){
        System.out.println(v);
    }
     
}
 public class interfacetwo{
    public static void main (String[]args){

        ny n= new ny();
        n.show();
        n.dis();
        n.res();
        n.demoo();
    }
 }
