package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }
    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
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
                noDupes.append(array[i]+ " ");
            }
        }
//        if no matches, then return new array of length 0.
        if (noDupes.length() == 0) {
            return new String[0];
        }else {
//            otherwise split the String with " "
//            .split() method returns an array of strings
            return noDupes.toString().split(" ");
        }
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        StringBuilder noDupes = new StringBuilder();
//        counting number of occurrences
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
//            if count not equal to or not greater than int number of times occurs
            if (!(count == exactNumberOfDuplications)) {
                noDupes.append(array[i]+ " ");
            }
        }
//        if no matches, then return new array of length 0.
        if (noDupes.length() == 0) {
            return new String[0];
        }else {
//            otherwise split the String with " "
//            .split() method returns an array of strings
            return noDupes.toString().split(" ");
        }
    }
}
