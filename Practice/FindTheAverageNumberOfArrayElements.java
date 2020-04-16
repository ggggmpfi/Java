/*求数组元素的平均数**/
public class FindTheAverageNumberOfArrayElements {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6};
        double average=0;
        for (int value : array) {             //求和
            average += ( value*1.0 / array.length);
        }
        System.out.println(average);
    }
}
