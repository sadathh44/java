package sorting;
import java.util.Arrays;
public class selection_sort {

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-  1;
            int max=getmax(arr,0,last);
            swap(arr,max,last);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;        
    }
    
    public static int getmax(int[] arr,int first,int second){
        int max=first;
        for(int i=first;i<=second;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void main(String args[]){
        int[] a={2,1,5,3,0};
        selectionSort(a);
    }
}