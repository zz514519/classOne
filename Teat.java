

import java.util.Arrays;

/**
 * Author : Zhang Zhe
 */
public class Teat {
    public static void main(String[] args) {
        int[][] arr = {{12,45,32},{11,23,68}};
        for(int i = 0;i<2;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]>arr[i][j+1]){
                    int tmp = arr[i][j];
                    arr[i][j] = arr[i][j+1];
                    arr[i][j+1] = tmp;
                }
           }
        }
        for(int i = 0;i<3;i++){
            for(int j=0;j<1;j++){
                if(arr[j][i]>arr[j+1][i]) {
                    int tmp = arr[j][i];
                    arr[j][i] = arr[j + 1][i];
                    arr[j+ 1][i] = tmp;
                }
            }
        }
                System.out.println(Arrays.deepToString(arr));
        }
    }
