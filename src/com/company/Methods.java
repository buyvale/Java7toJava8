package com.company;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods<T> {


    public int streamCountA1(Collection<String> collection) {
        List<String> filteredList = collection.
                stream()
                .filter(s -> s.equals("a1"))
                .collect(Collectors.toList());
        return filteredList.size();
    }

    public T streamReturnFirstElement(List<T> listStrings) {

        Optional<T> returnFirst = listStrings.
                stream()
                .findFirst();
        return returnFirst.get();
    }

    public T streamReturnLastElement(List<T> listStrings) {

        long returnLast = listStrings.
                stream()
                .count();
        return listStrings.get((int) returnLast - 1);
    }

    public boolean streamFindElement(T value, List<T> listStrings) {

        long returnElements = listStrings.
                stream()
                .filter(s -> s.equals(value))
                .count();

        if (returnElements > 0) {
            return returnElements > 0;
        }
        throw new NoSuchElementException("Element " + value + " wasn't found");
    }

    //Вернуть третий элемент коллекции по порядку
    public T streamFindElementByIndex(int index, List<T> collection) {

        List<String> filteredList =  collection.
                stream()
                .


        return null;
    }

    //------------JAVA7---------------------------

    public int countA1(List<String> list) {
        int count = 0;
        for (String s : list) {
            if (s.equals("a1")) {
                count++;
            }

        }
        return count;
    }

    public T returnFirstElement(List<T> listStrings) {

        return listStrings.get(0);
    }

    public T returnLastElement(List<T> listStrings) {

        return listStrings.get(listStrings.size() - 1);
    }

    public boolean findElement(T value, List<T> listStrings) {

        for (T t : listStrings) {
            if (t == value) ;
            return true;
        }

        return false;
    }

    public T findElementByIndex(int index, List<T> listStrings) {
        for (int i = 0; i <= listStrings.size(); i++) {
            if (i == index) {
                return listStrings.get(i);
            }
        }
        return null;
    }

    public List<T> returnRangeValues(int first, int last, List<T> listStrings) {

        List<T> range = new ArrayList<>((last - first) + 1);
        T element;
        if (first > 0 && last <= listStrings.size()) {
            for (int i = first; i <= last; i++) {
                element = listStrings.get(i);
                range.add(element);
            }
            return range;
        }
        return null;
    }
}
