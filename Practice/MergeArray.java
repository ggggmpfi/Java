
/*合并数组**/
import java.util.Arrays;             //加载已定义好的类或包
public class MergeArray {
    public static void main(String[] args) {
        int[] firstArray={1,3,3};
        int[] secondArray={4,5};
        int[] newArray=new int[firstArray.length+secondArray.length];
        for(int i=0;i<newArray.length;i++){                   //合并数组，i为新数组的索引
            newArray[i]=i<firstArray.length?firstArray[i]:secondArray[i-firstArray.length];
        }
        /*
        System.arraycopy(a, 0, newArray, 0, a.length);
        System.arraycopy(b, 0, newArray, a.length, b.length);   //浅复制，使用要慎重
         */
        for(int see_newArray:newArray){
            System.out.print(see_newArray+"\t");
        }
    }
}
