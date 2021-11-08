public class sapxepChen {
    public static void main(String[] args) {
        int[] = {5,1,12,-5,16,2,12,14};
        SC(arr;) 
    void sort(int arr[]){
        int n=arr.length;
        for (int i=1; i<n; ++i){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
        System.out.println("Mang da duoc sap xep");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
