public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do{
            String s = String.format("第%s次输出", i);
            System.out.println(s);
            i ++;
        }while(i <= 10);
    }
}
