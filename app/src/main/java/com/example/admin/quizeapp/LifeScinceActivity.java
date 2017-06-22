package com.example.admin.quizeapp;

import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class LifeScinceActivity extends AppCompatActivity {
    public static RadioButton R1, R2, R3, R4, R5, R6, R7, R8, R9,R10;
   double tot = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_scince);

        R1 = (RadioButton) findViewById(R.id.rad1);
        R2 =(RadioButton)findViewById(R.id.rad2);
        R3 = (RadioButton) findViewById(R.id.rad3);
        R4 =(RadioButton)findViewById(R.id.rad4);
        R5 = (RadioButton) findViewById(R.id.rad5);
        R6 =(RadioButton)findViewById(R.id.rad6);
        R7 = (RadioButton) findViewById(R.id.rad7);
        R8 =(RadioButton)findViewById(R.id.rad8);
        R9 = (RadioButton) findViewById(R.id.rad9);
        R10 = (RadioButton) findViewById(R.id.rad10);
    }

    public void submitScore(View view)
    {

        if (R1.isChecked())
        {
            tot=tot+1;
        }
        if (R2.isChecked())
        {
            tot=tot+1;
        }

        if (R3.isChecked())
        {
            tot=tot+1;
        }

        if (R4.isChecked())
        {
            tot=tot+1;
        }

        if (R5.isChecked())
        {
            tot=tot+1;
        }

        if (R6.isChecked())
        {
            tot=tot+1;
        }

        if (R7.isChecked())
        {
            tot=tot+1;
        }

        if (R8.isChecked())
        {
            tot=tot+1;
        }
        if (R9.isChecked())
        {
            tot=tot+1;
        }
        if (R10.isChecked())
        {
            tot=tot+1;
        }


        AlertDialog.Builder a_builder = new AlertDialog.Builder(LifeScinceActivity.this);
        a_builder.setMessage("My total score is :" + tot/10*100 +"%")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alert = a_builder.create();
        alert.setTitle("alert");
        alert.show();



    }


}

