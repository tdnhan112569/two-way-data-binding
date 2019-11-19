package com.dragon.two_way_data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.dragon.two_way_data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setContact(new Contact("Empty","0123456789"));
        // Type on Edittext to test the data binding two way, and checkout the layout file focus on Edittext and Textview, and model object Contact
        setContentView(binding.getRoot());
    }
}
