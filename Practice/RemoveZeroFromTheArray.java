/*去除数组中的0元素（或某一元素）**/
public class RemoveZeroFromTheArray {
    public static void main(String[] args) {
        int[] oldArray=new int[]{0,0,1,2,3,0,0,4,5,0,6,0,0,0,7,0,0};
        int newArrayLength=0;
        for (int value : oldArray) {                //确定非零元素的数量
            newArrayLength+=value!=0?1:0;
        }
        int[] newArray=new int[newArrayLength];
        for(int i=0,j=0;i<oldArray.length;i++){     //将非零元素放进新数组中，i为旧数组索引，j为新数组索引
            if(oldArray[i]!=0){
                newArray[j]=oldArray[i];
                j++;
            }
        }
        oldArray=null;                              //清除旧数组的引用（地址），旧数组会被视为垃圾，垃圾回收器会将其回收，
        for(int value:newArray){
            System.out.println(value);
        }
    }
}
