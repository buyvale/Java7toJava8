package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.company.Sex.*;

public class PeopleMethods {
    static List<People> getPeopleList() {
        List<People> list = new ArrayList<>();
        list.add(new People("Erik", 20, MAN));
        list.add(new People("Anthony", 18, MAN));
        list.add(new People("Ann", 50, WOMEN));
        list.add(new People("John", 70, MAN));
        list.add(new People("Elena", 33, WOMEN));
        return list;
    }

    public List<People> getManList(List<People> list) {
        ValueIsWomananFilterPredicate filter = new ValueIsWomananFilterPredicate();
        List<People> MAN_list;
        list.removeIf(filter);

        MAN_list = list;
        return MAN_list;
    }

    static void printSortedList() {
        List<People> list = getPeopleList();


        Collections.sort(list, PeopleComparators.PERSON_AGE_COMPARATOR);
    }

    class ValueIsWomananFilterPredicate implements Predicate<People> {

        @Override
        public boolean test(People value) {
            return value.getSex().equals(WOMEN);
        }
    }

    class PrintConsumer implements Consumer<String> {

        @Override
        public void accept(String value) {
            System.out.println("<<<" + value + ">>>");
        }
    }
}
