/*冒泡排序**/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayOld=new int[]{4,8,3,6,2,8,1,9,5,3,7,5};
        int temp;           //临时变量
        for(int i=0;i<arrayOld.length-1;i++){               //外层循环控制轮次
            for(int j=arrayOld.length-1;j>i;j--){           //内层循环控制比较次数
                temp=Math.max(arrayOld[j],arrayOld[j-1]);
                arrayOld[j-1]=Math.min(arrayOld[j],arrayOld[j-1]);
                arrayOld[j]=temp;
            }
        }
        for(int value:arrayOld){
            System.out.print(value+"\t");
        }
    }
}
