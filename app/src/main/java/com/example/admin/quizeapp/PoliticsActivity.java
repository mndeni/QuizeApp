package com.example.admin.quizeapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class PoliticsActivity extends AppCompatActivity {
public static RadioButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10;
  double tottt =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics);


        B1= (RadioButton) findViewById(R.id.badio1) ;
        B2= (RadioButton) findViewById(R.id.badio2) ;
        B3= (RadioButton) findViewById(R.id.badio3) ;
        B4= (RadioButton) findViewById(R.id.badio4) ;
        B5= (RadioButton) findViewById(R.id.badio5) ;
        B6= (RadioButton) findViewById(R.id.badio6) ;
        B7= (RadioButton) findViewById(R.id.badio7) ;
        B8= (RadioButton) findViewById(R.id.badio8) ;
        B9= (RadioButton) findViewById(R.id.badio9) ;
        B10= (RadioButton) findViewById(R.id.badio10) ;


    }
    public void sumbitPolitics(View view)
    {
        if (B1.isChecked())
        {
            tottt =tottt + 1;
        }

        if (B2.isChecked())
        {
            tottt =tottt + 1;
        }

        if (B3.isChecked())
        {
            tottt =tottt + 1;
        }

        if (B4.isChecked())
        {
            tottt =tottt + 1;
        }

        if (B5.isChecked())
        {
            tottt =tottt + 1;
        }

        if (B6.isChecked())
        {
            tottt =tottt + 1;
        }
        if (B7.isChecked())
        {
            tottt =tottt + 1;
        }
        if (B8.isChecked())
        {
            tottt =tottt + 1;
        }
        if (B9.isChecked())
        {
            tottt =tottt + 1;
        }
        if (B10.isChecked())
        {
            tottt =tottt + 1;
        }









        AlertDialog.Builder a_builder = new AlertDialog.Builder(PoliticsActivity.this);
        a_builder.setMessage("My total score is :" + tottt/10*100 +"%")
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
