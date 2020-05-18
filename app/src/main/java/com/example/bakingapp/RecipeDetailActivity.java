package com.example.bakingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.bakingapp.model.Recipe;

public class RecipeDetailActivity extends AppCompatActivity {
    // variable for the Recipe
    private Recipe mRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
        //intent that started this activity
        Intent intentThatStartedThisActivity = getIntent();
        if (intentThatStartedThisActivity == null) {
            closeOnError();
        }
        mRecipe = intentThatStartedThisActivity.getParcelableExtra("Recipe");
    }

    private void closeOnError() {
        finish();
        Toast.makeText(this, " no image available", Toast.LENGTH_SHORT).show();
    }
}
