public class Bubble {
    public static void main(String[] args) {
        int[]= {5,1,12,-5,16,2,12,14};
        SC(arr);

        static void bubbleSort(int[] arr){
            int n=arr.length;
            int temp = 0;
            for(int i=0; i<n; i++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Mang da duoc sap xep tang dan");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
