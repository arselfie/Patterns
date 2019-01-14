package javaapplication10.lessons.patterns.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ars
 */
interface Sorting {

    void sort(List<Integer> list);

}

class RightSort implements Sorting {

    @Override
    public void sort(List<Integer> list) {
        Collections.sort(list);
    }

}

class ReverseSort implements Sorting {

    @Override
    public void sort(List<Integer> list) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        list.sort(comparator.reversed());
    }

}

class Strategy {

    private Sorting sorting;

    public Strategy(Sorting sorting) {
        this.sorting = sorting;
    }

    void execute(List<Integer> list) {
        sorting.sort(list);
    }

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }
    
}

class TestStrategy {

    public static void main(String[] args) {
                        
        Sorting rightSort = new RightSort();

        Sorting reverseSort = new ReverseSort();
        
        Strategy strategy = new Strategy(rightSort);
        
        List<Integer> list = new LinkedList<>();
        
        list.addAll(Arrays.asList(2, -1, 0, 5, -3));
        
        strategy.execute(list);
        
        System.out.println(list);
        
        strategy.setSorting(reverseSort);
        
        strategy.execute(list);
        
        System.out.println(list);

    }
}
