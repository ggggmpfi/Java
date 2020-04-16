//将某一范围内的素数存储在一个数组中,当upper较大（大于10000000时，强烈推荐方法1，当upper较小时，方法2更好
import java.util.Scanner;//加载已定义好的类或包
public class StorePrimeNumberInArray {
    public static void main(String[] args) {
        int temp;                                 //临时变量
        System.out.println("请输入您要存储素数的范围：");
        Scanner input=new Scanner(System.in);
        int lower=input.nextInt();
        int upper=input.nextInt();                //用户输入寻找区间
        temp=Math.min(lower,upper);
        upper=Math.max(lower,upper);
        lower=temp>2?temp:Math.max(temp,2);       //素数大于等于2，1不是素数
        //方法1：执行效率高，占用空间大
        int[] arrayPrimeTemp=new int[(upper-lower)/2+2];
        int index=0;                            //素数个数
        for(int i=lower;i<=upper;i++){          //将素数存放到数组中，index表示数组索引
            boolean judge=false;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    judge=true;
                    break;
                }
            }
            if(!judge){
                arrayPrimeTemp[index]=i;
                index++;
            }
        }
        int[] arrayPrime=new int[index];
        System.arraycopy(arrayPrimeTemp, 0, arrayPrime, 0, index);
        arrayPrimeTemp=null;
        /*
        //方法2，执行效率低，占用空间小
        int primeMount=0;
        for(int i=lower;i<=upper;i++){              //确定素数的数量，外层循环控制判断对象
            boolean judge=false;                    //judge用来标记
            for(int j=2;j<=Math.pow(i,0.5);j++){    //内层循环判断是否为素数
                if(i%j==0){
                    judge=true;                     //能被其它数整除，不是素数，进行标记
                    break;                          //确定不是素数，跳出内层循环
                }
            }
            if(!judge){                             //没被标记的数即为素数
                primeMount++;
            }
        }

        int[] arrayPrime=new int[primeMount];
        for(int i=lower,index=0;i<=upper;i++){          //将素数存放到数组中，index表示数组索引
            boolean judge=false;
            for(int j=2;j<=Math.pow(i,0.5);j++){
                if(i%j==0){
                    judge=true;
                    break;
                }
            }
            if(!judge){
                arrayPrime[index]=i;
                index++;
            }
        }
        */
        for(int value:arrayPrime){
            System.out.println(value);
        }
        System.out.println("素数共有："+index+"个");

    }
}
