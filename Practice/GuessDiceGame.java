import java.util.Scanner;//导包
public class GuessDiceGame {
    public static void main(String[] args) {
        int randNum = (int) (Math.random() * 6) + 1;//电脑摇骰子

        System.out.println("您选择猜大还是猜小？");
        Scanner input = new Scanner(System.in);
        String playerChoose = input.nextLine();//玩家猜大小

        while ((!playerChoose.equals("大"))
                &&(!playerChoose.equals("小"))) {
            System.out.println("抱歉，您的输入有误，请重新输入：（请输入“大”或“小”）");
            playerChoose = input.nextLine();
        }//玩家输入错误，重新输入

        System.out.println("本次摇出的骰子为" + randNum + "点");//开骰子

        if (randNum>3&&playerChoose.equals("大")
                ||randNum<4&&playerChoose.equals("小")) {
            System.out.println("恭喜您，猜对了！");
        } else {
            System.out.println("抱歉，您猜错了，下次继续努力哦！");
        }//判断结果
    }
}
