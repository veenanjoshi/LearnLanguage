package com.learn.lang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.category_colors).setOnClickListener(this);
        findViewById(R.id.category_numbers).setOnClickListener(this);
        findViewById(R.id.category_family_members).setOnClickListener(this);
        findViewById(R.id.category_phrases).setOnClickListener(this);
    }

    public void onNumbersCategoryClicked(View view) {
        startCategoryActivity(getString(R.string.category_numbers));
    }

    public void onFamilyMembersClicked(View view) {
        startCategoryActivity(getString(R.string.category_family_members));
    }

    public void onColorsClicked(View view) {
        startCategoryActivity(getString(R.string.category_colors));
    }

    public void onPhrasesClicked(View view) {
        startCategoryActivity(getString(R.string.category_phrases));
    }

    private void startCategoryActivity(String categoryName){
        Intent intent = new Intent(this, CategoryActivity.class);
        intent.putExtra(Constants.CATEGORY_TITLE, categoryName);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        String categoryTitle = getString(R.string.category_numbers);
        boolean startCategoryActivity = false;
        switch (v.getId()){
            case R.id.category_numbers:
                categoryTitle = getString(R.string.category_numbers);
                startCategoryActivity = true;
                break;
            case R.id.category_colors:
                categoryTitle = getString(R.string.category_colors);
                startCategoryActivity = true;
                break;
            case R.id.category_family_members:
                categoryTitle = getString(R.string.category_family_members);
                startCategoryActivity = true;
                break;
            case R.id.category_phrases:
                categoryTitle = getString(R.string.category_phrases);
                startCategoryActivity = true;
                break;

        }
        if(startCategoryActivity){
            Intent intent = new Intent(this, CategoryActivity.class);
            intent.putExtra(Constants.CATEGORY_TITLE, categoryTitle);
            startActivity(intent);
        }
    }
}
