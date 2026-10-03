package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkintechList<T> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (contains(element)) {
            return false;
        }
        return super.add(element);
    }

    @Override
    public void add(int index, T element) {
        if (!contains(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> elements) {
        boolean changed = false;
        for (T element : elements) {
            changed |= add(element);
        }
        return changed;
    }

    @SuppressWarnings("unchecked")
    public void sort() {
        Collections.sort((ArrayList<Comparable<Object>>) (ArrayList<?>) this);
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        sort();
        return removed;
    }
}
