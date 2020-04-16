/*交换两个数组中的元素*/
public class ArrayElementExchange {
    public static void main(String[] args){
        int[] a=new int[]{1,2,3,4};
        int[] b=new int[]{5,6,7,8};
        //方法一：
        int[] temp;
        temp=a;
        a=b;
        b=temp;                             //数组引用（地址）交换，两个数组元素数量可以不同，只须交换一次

        /*
        方法二：
        for(int i=0;i<4;i++){
            a[i]=a[i]^b[i];
            b[i]=a[i]^b[i];
            a[i]=a[i]^b[i];                 //数组对应位置元素交换，两个数组元素数量必须相同，要交换多次
        }
        */

        System.out.print("\n"+"---------------"+"\n");
        for(int see_a:a){
            System.out.print(see_a+"\t");
        }
        System.out.println("\n"+"---------------");
        for(int see_b:b){
            System.out.print(see_b+"\t");
        }                                   //交换后打印
    }
}
