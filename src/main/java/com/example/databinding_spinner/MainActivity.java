package com.example.databinding_spinner;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.databinding_spinner.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        data = new Data();
        binding.setData(data);

    }

    public void add(View view) {
        data.numbers.add(0,new Random().nextInt(100));
    }

    public void remove(View view) {
        if (data.numbers.size() > 0){
        data.numbers.remove(data.numbers.size()-1);
        }
    }

}

