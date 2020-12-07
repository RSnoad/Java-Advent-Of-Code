import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;
public class Day06_2017 {

    public static void main(String[] args) {

        System.out.println(redistribute(convertToListOfDigits("0 2 7 0")));
        System.out.println(redistribute(convertToListOfDigits("2 4 1 2")));



    }



    public static ArrayList<Integer> convertToListOfDigits(String banks) {
        String[] splitstring = banks.split("\\s+");

        ArrayList<Integer> intbank = new ArrayList<>();
        for (String s : splitstring) intbank.add(Integer.parseInt(s));

        return intbank;
    }


// TODO Won't work after first loop as wrong data type, look to change data input before calling this function?
    public static ArrayList<Integer> redistribute(ArrayList<Integer> banks) {

        // Sort edits bankslist if sortedbankslist = bankslist directly, find way to avoid doing this work twice. (clone?)
        ArrayList<Integer> sortedbankslist = (ArrayList<Integer>) banks.clone();

        sort(sortedbankslist, reverseOrder());
        int maximum = sortedbankslist.get(0);
        int maxindex = 0;

        while (banks.get(maxindex) < maximum) {
            maxindex ++;
        }
//        System.out.println(bankslist);
//        System.out.println("maxindex = " + maxindex);

        banks.set(maxindex, 0);
//        System.out.println(bankslist);

        for (int i = 1; i < maximum +1; i++) {
            int index = (maxindex + i) %  banks.size();
//            System.out.println(index);
            banks.set(index, banks.get(index)+1);
        }

        return banks;

    }


//    public static int balanceblocks(ArrayList<Integer> banks) {
//
//    }



}
