public class aaaaa {

    //程序运行的主体man方法
    public static void main(String [] args){
        //设置一个int类型的数组 不给予参数只定义元素数量
        int []arr = new int[10];
        //for循环开始产生元素
        for (int i=0;i<arr.length;i++){
            //元素开始随机产生1-100之间的数
            arr[i]=(int)(Math.random()*100+1);
        }
        //增强for循环开始遍历生产出来的元素内容
        for (int str:arr) {
            //打印元素
            System.err.print("["+str+"]");
        }
        //for循环开始进行排序 第一层循环为遍历次数
        for (int i =0;i<arr.length-1;i++){
            //第二层循环为遍历一层循环后一元素
            for (int j=0;j<arr.length-i-1;j++){
                //如果第一个元素大于第二个元素
                if (arr[j]>arr[j+1]){
                    //进行元素交换
                    int index=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=index;
                }
            }
        }
        //进行遍历
        for (int str:arr
             ) {
            System.out.println();
            System.err.print("["+str+"]");

        }

    }
}
