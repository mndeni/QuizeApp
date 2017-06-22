package com.example.admin.quizeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openMathsQuestion(View view)
    {
        Intent maths = new Intent(this,MathsActivity.class);
        startActivity(maths);
    }

    public void openLifeScince(View view)
    {
        Intent lifeScience = new Intent(this, LifeScinceActivity.class);
        startActivity( lifeScience );
    }
public void openPolitics(View view)
{
         Intent Politics = new Intent(this, PoliticsActivity.class);
         startActivity(Politics);
}


}
