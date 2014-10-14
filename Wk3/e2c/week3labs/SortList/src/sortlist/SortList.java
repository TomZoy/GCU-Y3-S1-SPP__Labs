/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sortlist;

/**
 *
 * @author Richard
 */
public class SortList {
    public int[] sort(int[] values, int size){
        int temp;
        for (int p = 0; p<size; p++){
            for (int q=(p+1); q<size; q++) {
                    if (values[q]<values[p]){
                        temp=values[q];
                        values[q]=values[p];
                        values[p]=temp;
                    }
            }
        }
        return values;
    }

}
