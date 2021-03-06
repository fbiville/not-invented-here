package io.github.fbiville.fdk.sort;

public class QuickSortTest extends SortTestCases {

    @Override
    protected <T extends Comparable<T>> T[] sort(T[] values) {
        return QuickSort.INSTANCE.sort(values);
    }
}