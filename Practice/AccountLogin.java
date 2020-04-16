
/*账号登录**/
import java.util.Scanner;
public class AccountLogin {
    public static void main(String[] args) {
        boolean judge = false;//标记
        String[] userAccount = new String[]{"xiaoming", "xiaohong", "xiaogang", "xiaoqiang"};
        String[] userPassword = new String[]{"ihje1995", "ihxa1995", "ihmq1995", "ihxk1995"};   //充当小型数据库，存储用户账号及密码
        String account,password;    //用户输入的账号密码
        Scanner input= new Scanner(System.in);
        outer:for(int j=0;j<3;) {   //控制输入机会
            System.out.println("Please enter your account:");
            account = input.nextLine();
            System.out.println("Please enter your password:");
            password = input.nextLine();
            for (int i = 0; i < userAccount.length;i++) {   //从数据库中索引账号
                if((account.equals(userAccount[i]))) {
                    if ((password.equals(userPassword[i]))) {
                        judge = true;
                        break outer;    //账号密码均正确，标记（登录成功），跳出外层循环
                    }
                    break;  //账号正确，密码不正确，跳出里层循环，进行下一次输入账号密码
                }
            }
            System.out.println("Account does not exist or the password is incorrect.");
            j++;
        }
        if (judge) {
            System.out.println("Login successful!");
        } else {
            System.out.println("You have entered too many times,please tray again later.");
        }
    }
}

