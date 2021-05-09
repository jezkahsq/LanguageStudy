public class While {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10){
            String s = String.format("第%s次输出", i);
            System.out.println(s);
            i ++;
        }
        System.out.println("程序终止！");
    }
}
