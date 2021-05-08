public class Var {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a的值"+ a);
        a = 20;
        System.out.println("修改后a的值"+ a);
        System.out.println(a+b);
        System.out.println(a/b);
    }
}

