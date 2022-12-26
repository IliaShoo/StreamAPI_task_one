package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();

        for (int polozh: list) {
            if(polozh>0){
                if(polozh%2==0){
                    newList.add(polozh);
                }
            }
        }
        Collections.sort(newList);


        for (int a :newList) {
            System.out.print(a+ " ");
        }

    }
}
