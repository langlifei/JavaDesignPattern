package AdapterPattern07.example.adapter;

import AdapterPattern07.example.action.ScoreOperation;
import AdapterPattern07.example.adapter.adaptee.BinarySearch;
import AdapterPattern07.example.adapter.adaptee.QuickSort;

public class OperationAdapter implements ScoreOperation {
    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public OperationAdapter(){
        this.quickSort = new QuickSort();
        this.binarySearch = new BinarySearch();
    }

    @Override
    public void sort() {
        this.quickSort.quickSort();
    }

    @Override
    public void search() {
        this.binarySearch.binarySearch();
    }
}
