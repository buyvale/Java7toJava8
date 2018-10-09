package com.company;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MethodsTest {
    private Methods<String> methods = new Methods<>();
    List<String> listStrings;
    String[] listData = {"a1", "a2", "a3", "a4","a167"};

    @Before
    public void createDefaultList() {

        listStrings = Arrays.asList(listData);
    }


    //[STREAMS]Вернуть количество вхождений объекта «a1»
    @Test
    public void testStreamCountA1()
    {
        int expectedCount = 2;
        int actualCount = methods.streamCountA1(listStrings);
        assertEquals(expectedCount, actualCount);
    }

    //[STREAM]Вернуть первый элемент коллекции или 0, если коллекция пуста
    @Test
    public void testStreamReturnFirstElement() {
        assertEquals("a1", methods.streamReturnFirstElement(listStrings));
    }

    //[STREAM] Вернуть последний элемент коллекции или «empty», если коллекция пуста
    @Test
    public void testStreamReturnLastElement() {
        assertEquals("a167", methods.streamReturnLastElement(listStrings));
    }

    //[STREAM]Найти элемент в коллекции равный «a3» или кинуть ошибку
    @Test
    public void testStreamFindSomeElement()
    {
    assertEquals(true, methods.streamFindElement("a167",listStrings));
    }

    //Вернуть количество вхождений объекта «a1»
    @Test
    public void testCountA1() {

        int expectedCount = 2;
        int actualCount = methods.countA1(listStrings);
        assertEquals(expectedCount, actualCount);
    }


    //Вернуть первый элемент коллекции или 0, если коллекция пуста
    @Test
    public void testReturnFirstElement() {
        assertEquals("a1", methods.returnFirstElement(listStrings));
    }

    //Вернуть последний элемент коллекции или «empty», если коллекция пуста
    @Test
    public void testReturnLastElement() {
        assertEquals("a167", methods.returnLastElement(listStrings));
    }

    //Найти элемент в коллекции равный «a3» или кинуть ошибку
    @Test
    public void testIsContainsElement() {
        assertEquals(true, methods.findElement("a1", listStrings));
    }

    //Вернуть третий элемент коллекции по порядку
    @Test
    public void testGetElementByIndex() {
        assertEquals("a4", methods.findElementByIndex(3, listStrings));

    }

    //Вернуть два элемента начиная со второго
    @Test
    public void testReturnRangeValues() {
        List<String> range = Arrays.asList("a2", "a3");
//        String[] range = {"a2","a3"};
        assertEquals(range, methods.returnRangeValues(1, 2, listStrings));

    }
}

