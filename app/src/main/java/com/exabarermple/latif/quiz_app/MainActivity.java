package com.exabarermple.latif.quiz_app;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup groupOne, groupTwo, groupThree;
    RadioButton rbOne, rbTwo, rbThree, rbFour, rbFive, rbSix, rbSeven, rbEight, rbNine;
    EditText input;
    CheckBox one, two, three, four;
    Button sbm, rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        //  Casting submitButton
        sbm = (Button) findViewById ( R.id.submitButton );
        rst = (Button) findViewById ( R.id.resetButton );
        sbm.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //  Casting for RadioButtons
                rbOne = (RadioButton) findViewById ( R.id.rb1 );
                rbTwo = (RadioButton) findViewById ( R.id.rb2 );
                rbThree = (RadioButton) findViewById ( R.id.rb3 );
                rbFour = (RadioButton) findViewById ( R.id.rb4 );
                rbFive = (RadioButton) findViewById ( R.id.rb5 );
                rbSix = (RadioButton) findViewById ( R.id.rb6 );
                rbSeven = (RadioButton) findViewById ( R.id.rb7 );
                rbEight = (RadioButton) findViewById ( R.id.rb8 );
                rbNine = (RadioButton) findViewById ( R.id.rb9 );

                //  Casting for CheckBoxes
                one = (CheckBox) findViewById ( R.id.checkbox_true );
                two = (CheckBox) findViewById ( R.id.checkbox_long );
                three = (CheckBox) findViewById ( R.id.checkbox_static );
                four = (CheckBox) findViewById ( R.id.checkbox_end );

                //  Casting for CheckBoxes
                input = (EditText) findViewById ( R.id.editText_input );
                String answer = input.getText ().toString ();

                if (rbTwo.isChecked () && rbFour.isChecked () && rbNine.isChecked () && two.isChecked () && three.isChecked () && answer.equals ( "java" )) {
                    Toast.makeText ( MainActivity.this, "Your score is 100", Toast.LENGTH_SHORT ).show ();
                } else if (rbTwo.isChecked () && rbFour.isChecked () && rbNine.isChecked () && two.isChecked () || three.isChecked () && answer.equals ( "java" )) {
                    Toast.makeText ( MainActivity.this, "Your score is 90", Toast.LENGTH_SHORT ).show ();
                } else if (rbTwo.isChecked () && rbFour.isChecked () && rbNine.isChecked () && answer.equals ( "java" )) {
                    Toast.makeText ( MainActivity.this, "Please make sure you answer all the questions", Toast.LENGTH_SHORT ).show ();
                } else {
                    Toast.makeText ( MainActivity.this, "Too low from estimated score", Toast.LENGTH_SHORT ).show ();
                }
            }


        } );

        rst.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // uncheck the radioButtons and CheckBoxes

                rbTwo.setChecked ( false );
                rbFour.setChecked ( false );
                rbNine.setChecked ( false );
                rbOne.setChecked ( false );
                rbThree.setChecked ( false );
                rbFive.setChecked ( false );
                rbSix.setChecked ( false );
                rbSeven.setChecked ( false );
                rbEight.setChecked ( false );
                one.setChecked ( false );
                two.setChecked ( false );
                three.setChecked ( false );
                four.setChecked ( false );

                // clear editText
                input.getText ().clear ();
            }
        } );

    }


}
