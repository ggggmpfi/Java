/*中国象棋棋盘**/
public class ChineseChess {
    public static void main(String[] args) {
        int r = 0, c = 0, starOne = 10;	/*r表示行，c表示列，starOne表示棋盘小格的宽度
        								starOne的值可设置得更大，但是须为偶数，值越大，棋盘越大*/
        for (r = 0; r <= starOne * 9; r += 2) {            //第一行为0行，10行为1层，共9层（含楚河汉界），共91行（0-90）
            for (c = 0; c <= starOne * 8; c++) {      //第一列为0列，10列为1层，共8层，共81列（0-80）
                if ((r % starOne == 0 ||                                //无空格的行上的*号：0，10，20，30，40，50，60，70，80，90行
                        c % starOne == 0) && c % 2 == 0 && (r <= starOne * 4 || r >= starOne * 4 + starOne) ||    //楚河汉界一侧列的*号：0，10，20，30，40，50，60，70，80列
                        (r >= starOne * 4 && r <= starOne * 5 && (c == 0 || c == starOne * 8)) ||                //楚河汉界另一侧列的*号：0，10，20，30，40，50，60，70，80列
                        (r > 0 && r < starOne * 2) && (c > starOne * 3 && c < starOne * 5) && c == 3 * starOne + r /*捺*/ || (r > 0 && r < starOne * 2) && (c > starOne * 3 && c < starOne * 5) && c == 5 * starOne - r ||/*撇*/                            //楚河汉界一侧的斜线*号
                        (r > 7 * starOne && r < 9 * starOne) && (c > starOne * 3 && c < starOne * 6) && c == -4 * starOne + r/*捺*/ || (r > 7 * starOne && r < starOne * 9) && (c > starOne * 3 && c < starOne * 5) && c == 12 * starOne - r)/*撇*/    //楚河汉界另一侧的斜线*号
                {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");    //实现换行
        }
    }
}
