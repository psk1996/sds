public class aaaaa {

    public static void main(String [] args){
        int []arr = new int[10];

        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
        }
        for (int str:arr) {
            System.err.print("["+str+"]");
        }
        for (int i =0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int index=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=index;
                }
            }
        }
        for (int str:arr
             ) {
            System.out.println();
            System.err.print("["+str+"]");

        }

    }
}
