public class Switch {
    public static void main(String[] args) {
        int num = 3;
        switch (num){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("穿透switch语句输出 星期三");
                // break;
            default:
                System.out.println("非一周的前三个工作日");
                break;
        }
    }
}
