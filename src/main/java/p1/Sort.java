package p1;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = {1,5,7,4,2,};

        for (int i=0;i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if (a[i]>a[j]){
                    int temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
