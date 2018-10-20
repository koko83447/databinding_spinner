package com.example.databinding_spinner;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;

public class Data {
    public final ObservableArrayList<Integer> numbers = new ObservableArrayList<>();
    public final ObservableInt idx = new ObservableInt();

    public Data(){
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        idx.set(1);
    }

}
