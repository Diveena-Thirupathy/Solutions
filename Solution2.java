import java.util.Arrays;

/**
 * Created by Diveena on 6/14/2017.
 * the complexity is O(n^2)
 */
public class Solution2 {
    private static int countTriangle(int[] array){
        int n = array.length;
        if(n<3 || n==0) {
            return 0;
        }

        Arrays.sort(array);
        int count = 0;
        int i =0;
        int j =i+1;

        while(i<n-2){
            int k = j+1;

            while(k<n && array[k] < array[i] + array[j])
                k++;

            count += k-j-1;
            j++;

            if(j>=n){
                i++;
                j=i+1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] myarr = {10,21,22,100,101,200,300}; // returns 6
        int n = 4;
        System.out.print(countTriangle(myarr));
    }
}
