/*将一个数组首尾互换*/
public class InterchangedFirstAndLastElementOfArray {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6};
        for(int  i=0;i<array.length;i++){//i,j是数组的索引，i从小到大，j从大到小，其判断条件(i<3)的值为数组元素数量的一半
            array[i]=array[i]^array[array.length-i-1];
            array[array.length-i-1]=array[i]^array[array.length-i-1];
            array[i]=array[i]^array[array.length-i-1];;//首尾互换
        }
        /*
       int j=5;
        int i=0;//i,j是数组的索引，i从小到大，j从大到小
        for(;i<array.length;i++){    //其判断条件的值为数组元素数量的一半
            for(;j>=0;){
                a[j]=a[j]^a[i];
                a[i]=a[j]^a[i];
                a[j]=a[j]^a[i];//首尾互换
                j--;
                break;
            }
        }
        */
        for(int see_a:array){
            System.out.print(see_a+"\t");
        }//打印互换后的数组
    }
}
