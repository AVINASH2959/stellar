 abstract class mark{
    abstract void getpercentage();
}
class A extends mark{
    int mark1,mark2,mark3;
    public A(int mark1,int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    public void getpercentage(){
        int total=mark1+mark2+mark3;
        double percentage=(total/3);
        System.out.println(percentage);
    }
}
class B extends mark{
    private int mark1,mark2,mark3,mark4;
    public B(int mark1,int mark2,int mark3,int mark4){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
    }
    public void getpercentage(){
        int total=mark1+mark2+mark3+mark4;
        double percentage=(total/4);
        System.out.println(percentage);
    }
}
public class Z{
    public static void main(String[] args){
        A a=new A(70,80,95);
        B b=new B(90,78,95,87);
        a.getpercentage();
        b.getpercentage();
    }
}