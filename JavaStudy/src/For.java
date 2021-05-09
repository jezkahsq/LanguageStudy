public class For {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            String s = String.format("第%s次输出", i);
            System.out.println(s);
        }
    }
}
