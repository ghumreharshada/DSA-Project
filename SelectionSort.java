public class SelectionSort {
    public static void Selectionsort (int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] >arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }    
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

  public static void  selectionsort(int arr[]){
    for(int i =0; i<arr.length-1;i++){
        int minpos = i;
        for(int j =i+1 ; j<arr.length-1;j++){
            if(arr[minpos]>arr[j]){
              minpos = j;
            }
        }
        int temp = arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;

    }

  }

  public static void main(String args[]){
  int arr[]={5,4,1,3,2};
  selectionsort(arr);
  printArr(arr);
  }
}