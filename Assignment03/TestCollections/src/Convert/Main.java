package Convert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
int[] arr = {9,8,7,6,5,4,3,2,1};
        List<Integer> arrayList = new ArrayList<>();
        //Array -> ArrayList
        for(Integer index : arr){
            arrayList.add(index);
        }
        System.out.println(arrayList);
        //Array -> Array
        Object[] arr1 = arrayList.toArray();
        for(Object object : arr1){
            System.out.print(object +"");
        }
        System.out.println();
        //Reverse
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    //Replace
        System.out.println("Mang sau khi thay the phan tu thu 6:");
        arrayList.set(5,100);
        System.out.println(arrayList);
    }
}
