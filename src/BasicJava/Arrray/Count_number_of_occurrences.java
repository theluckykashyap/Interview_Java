package BasicJava.Arrray;

public class Count_number_of_occurrences {

    public static int countOccurrences(int arr[],int n,int x){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if (x==arr[i])
                count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        int x = 2;
        System.out.println(countOccurrences(arr, n, x));
    }
}
