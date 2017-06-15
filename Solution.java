import java.util.Arrays;
/**
 * Created by Diveena on 6/14/2017.
 * The complexity of the solution is O(n^2); because:
 *          For each i {
 *              iterate through j from i - n  --> O(n) execution
 *              and internal while loop iterates k from i - n --> O(n) execution
 *          }
 * The while loop (inner most) doesn't execute it's loop every time j iterates, while loop only iterates for each i.
 * Therefore, Complexity is n*(O(n)+O(n)) = O(n^2)
 * Complexity referred from "Introduction to Algorithm 3rd Edition - by Thomas H. Cormen" - Amortized Analysis
 */
public class Solution {
    public static void main(String[] args){
        int[] myarr = {4,6,3,7}; //return 3 as output
        int c = countofTriangles(myarr);
        System.out.print(c);
    }
    private static int countofTriangles(int[] array){
        int n = array.length;
        if(n == 0 || n < 3){
            System.out.print("Enter valid array");
        }
        Arrays.sort(array);
        int count = 0;


        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;++j){
                int k =j+1;
                while(k < n && array[i] + array[j] > array[k])
                    ++k;

                count += k -j -1;
            }
        }
        return count;
    }
}
