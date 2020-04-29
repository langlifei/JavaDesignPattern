package AdapterPattern07.example.adapter;

import AdapterPattern07.example.action.ScoreOperation;
import AdapterPattern07.example.adapter.adaptee.BinarySearch;
import AdapterPattern07.example.adapter.adaptee.ShellSort;

public class SortAdapter implements ScoreOperation {
    private ShellSort shellSort;
    private BinarySearch binarySearch;

    public SortAdapter(){
        this.shellSort = new ShellSort();
        this.binarySearch = new BinarySearch();
    }

    @Override
    public void sort() {
        this.shellSort.shellSort();
    }

    @Override
    public void search() {
        this.binarySearch.binarySearch();
    }
}
