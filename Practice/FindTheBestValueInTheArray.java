/*寻找数组中的最大值、最小值，或某一常量值**/
public class FindTheBestValueInTheArray {
    public static void main(String[] args) {
        int[] array={1,3,5,7,9,0,2,4,6,8};
        int min,max;
        min=max=array[0];
        for(int i=1;i<array.length;i++){
            max=Math.max(max,array[i]);
            min=Math.min(min,array[i]);
        }
        System.out.println("max:"+max+"\n"+"min:"+min);
    }
}
