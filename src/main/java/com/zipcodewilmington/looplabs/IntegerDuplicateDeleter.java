package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }
    //    removes all values in the array which occur at least the specified number of times.
    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        StringBuilder noDupes = new StringBuilder();
//        counting number of occurrences
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
                }
//            if count not equal to or not greater than int number of times occurs
                if (!(count >= maxNumberOfDuplications)) {
                    noDupes.append(array[i]);
                }
            }
            Integer[] removed = new Integer[noDupes.length()];
            for (int i = 0; i < noDupes.length(); i++) {
                removed[i] = Integer.parseInt("" + noDupes.charAt(i));
            }
        return removed;
    }

//    removes all values in the array which occur exactly the specified number of times.
    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }
}
