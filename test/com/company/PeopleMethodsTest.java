package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.company.Sex.MAN;
import static com.company.Sex.WOMEN;
import static org.junit.Assert.*;

public class PeopleMethodsTest {
    private PeopleMethods peopleMethods = new PeopleMethods();

   List<People> list= new ArrayList<>();
    @Before
    public void createDefaultList() {
        list.add(new People("Erik", 20, MAN));
        list.add(new People("Anthony", 18, MAN));
        list.add(new People("Ann", 50, WOMEN));
        list.add(new People("John", 70, MAN));
        list.add(new People("Elena", 33, WOMEN));
        list.add(new People("Ivan", 33, MAN));
    }

    @Test
    public void testReturnManLis()
    {
        List<People> ExpectedMAN_List = Arrays.asList(list.get(0),list.get(1), list.get(3),list.get(5));
        Assert.assertEquals(ExpectedMAN_List, peopleMethods.getManList(list));
    }
}