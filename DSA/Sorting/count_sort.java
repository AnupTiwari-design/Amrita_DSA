package DSA.Sorting;

public class count_sort {

    public static void countsort(int arr[]){
       
        int max = arr[0];
          for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
         int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

    }


    public static void main(String[] args) {
        
    }
    
}
