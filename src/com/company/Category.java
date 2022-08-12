package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Category implements Iterable<String> {
    private final LinkedList<String> list;

    public Category() {
        list = new LinkedList<String>();
    }

    public void addDetails(String product) {
        if (product != null) {
            list.add(product);
        }
    }

    public String print() {
        StringBuilder result = new StringBuilder();
        for (String product : list)
            result.append(product).append("\n");
        return result.toString();

    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }
}
