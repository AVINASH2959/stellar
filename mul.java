interface mookoul{

    int i =100;
    void show();

}
class add implements mookoul{
    int i = 200;
    public void show(){
        System.out.println(i);
    }
}

class sub implements mookoul{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
    
}
public class  mul{
    public static void main(String[] args) {
        add n= new add();
        n.show();
        System.out.println(n);
    }
    
}