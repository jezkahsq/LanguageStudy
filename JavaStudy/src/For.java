/*
public class For {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i==4){
                break;
            }
            String s = String.format("第%s次输出", i);
            System.out.println(s);
        }
    }
}



public class For {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i==4 | i==5){
                continue;
            }
            String s = String.format("第%s次输出", i);
            System.out.println(s);
        }
    }
}
*/

// 嵌套循环
public class For {
    public static void main(String[] args) {
        for(int hour=0; hour<24; hour++){
            for(int minute=0; minute<60; minute++){
                System.out.println(hour +"时" +minute +"分");
            }
        }
    }
}
