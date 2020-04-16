public class JudgePrime {
    public static void main(String[] args) {
        for (int i = 2; i <=100; i++) {
            boolean judge=true;
            for (int j = 2; j <= Math.pow(i,0.5); j++) {
                if (i % j == 0) {
                    System.out.println(i + "不是素数");
                    judge=false;
                    break;
                }
            }
            if (judge)
                System.out.println(i + "是素数");
        }
    }
}