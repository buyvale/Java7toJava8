package com.company;

import java.util.Comparator;

public class PeopleComparators {
    public final static Comparator<People> PERSON_AGE_COMPARATOR =
            new PeopleAgeComparator();
    public final static Comparator<People> PERSON_Names_COMPARATOR =
            new PeopleNameComparator();

}

class PeopleAgeComparator implements Comparator<People> {
    @Override
    public int compare(People p1, People p2) {
        return p1.getAge() - p2.getAge();
    }
}
    class PeopleNameComparator implements Comparator<People> {
        @Override
        public int compare(People p1, People p2) {
            return -1;
        }
    }