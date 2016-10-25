package anzo.test;


import anzo.custom.CustomArrayList;
import anzo.custom.OutException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Tests {

    CustomArrayList list;

    @Before

    public void setUP()throws Exception {

        list = new CustomArrayList() ;
    }

    @Test
    public void BasicTest() {

        list.add("hi");
        list.add("hello");

        assertThat(list.get(0), is("hi"));
        assertThat(list.get(1), is("hello"));

    }

    @Test

    public void ArrayGrowTest() {

        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");


        assertThat(list.get(0), is("hi"));
        assertThat(list.get(12), is("hi"));

    }

    @Test

    public void ArrayDeleteTest() throws OutException {

        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");
        list.add("hi");
        list.add("hello");

        list.remove(0);


        assertThat(list.get(0), is("hello"));
        assertThat(list.get(12), is("hello"));
    }

//    @Test
//
//    public void ArrayIndexAddTest() throws Exception {
//
//        list.add("hi");
//
//        list.add(9, "YES");
//
//        assertThat(list.get(9), is("YES"));
//
//    }
}

