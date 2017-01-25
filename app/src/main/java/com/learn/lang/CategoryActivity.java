package com.learn.lang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CategoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        if(getIntent().hasExtra(Constants.CATEGORY_TITLE)){
            setTitle(getIntent().getStringExtra(Constants.CATEGORY_TITLE));
        }
        String[] numbers = new String[10];

    }
}
