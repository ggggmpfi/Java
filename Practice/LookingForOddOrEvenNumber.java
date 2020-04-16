
/*将某一范围内的奇数（偶数）存储在数组中**/
import java.util.Scanner;
public class LookingForOddOrEvenNumber {
    public static void main(String[] args) {
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the target date that you want to index.(enter:Odd number or Even number)");
        String target = input.nextLine();				//输入索引目标
        System.out.println("Please enter two limits of your finding.(enter:0,1,2,3,4,.....)");
        int fistLimit = input.nextInt();
        int secondLimit = input.nextInt();				//用户输入索引范围
        int oneOrZero = target.equals("Odd number") ? 0 : 1;
        int adjustmentValue = fistLimit % 2 == oneOrZero && secondLimit % 2 == oneOrZero ? 0 : 1;          							//数组长度调节值
        int[] arrayNumber = new int[(int) (0.5 * Math.abs(fistLimit - secondLimit)) + adjustmentValue];
        for (int i = Math.min(fistLimit, secondLimit); i <= Math.max(fistLimit, secondLimit); i++) {
            if (i % 2 == Math.abs(oneOrZero - 1)) {
                arrayNumber[index] = i;
                index++;
            }
        }
        for (int lookArray : arrayNumber) {
            System.out.println(lookArray);
        }
    }
}
