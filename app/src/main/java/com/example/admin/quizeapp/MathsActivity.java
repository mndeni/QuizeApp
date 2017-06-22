package com.example.admin.quizeapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.R.attr.alertDialogIcon;
import static android.R.attr.id;
import static android.R.attr.value;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.admin.quizeapp.R.id.Submit;

public class MathsActivity extends AppCompatActivity {
    public static RadioGroup radio_g1, radio_g2, radio_g3, radio_g4, radio_g5, radio_g6, radio_g7, radio_g8, radio_g9, radio_g10;
    private static RadioButton Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10;

    double total = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);





        Q1 = (RadioButton) findViewById(R.id.radio1);
        Q2=(RadioButton)findViewById(R.id.radio2);
        Q3=(RadioButton)findViewById(R.id.radio3);
        Q4=(RadioButton)findViewById(R.id.radio4);
        Q5=(RadioButton)findViewById(R.id.radio5);
        Q6=(RadioButton)findViewById(R.id.radio6);
        Q7=(RadioButton)findViewById(R.id.radio7);
        Q8=(RadioButton)findViewById(R.id.radio8);
        Q9=(RadioButton)findViewById(R.id.radio9);
        Q10=(RadioButton)findViewById(R.id.radio10);
    }


    public void sumbit(View view){
        if (Q1.isChecked())
        {
            total = total + 1;
        }
        if (Q2.isChecked())
        {
            total = total + 1;
        }
        if(Q3.isChecked())
        {
            total = total + 1;
        }
        if(Q4.isChecked())
        {
            total = total + 1;
        }
        if(Q5.isChecked())
        {
            total = total + 1;
        }
        if(Q6.isChecked())
        {
            total = total + 1;
        }
        if(Q7.isChecked())
        {
            total = total + 1;
        }

        if(Q8.isChecked())
        {
            total = total + 1;
        }

        if(Q9.isChecked())
        {
            total = total + 1;
        }
        if(Q10.isChecked())
        {
            total = total + 1;
        }
        AlertDialog.Builder a_builder = new AlertDialog.Builder(MathsActivity.this);
        a_builder.setMessage("My total score is :" + total/9*100 +"%")
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