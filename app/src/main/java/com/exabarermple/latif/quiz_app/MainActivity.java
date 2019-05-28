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
    RadioButton rbOne,rbTwo,rbThree,rbFour,rbFive,rbSix,rbSeven,rbEight,rbNine;
    EditText input;
    CheckBox one, two, three, four;
    Button sbm, rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        sbm = (Button) findViewById ( R.id.submitButton );
        sbm.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                rbOne = (RadioButton)findViewById ( R.id.rb1 );
                rbTwo = (RadioButton)findViewById ( R.id.rb2 );
                rbThree = (RadioButton)findViewById ( R.id.rb3 );
                rbFour = (RadioButton)findViewById ( R.id.rb4 );
                rbFive = (RadioButton)findViewById ( R.id.rb5 );
                rbSix = (RadioButton)findViewById ( R.id.rb6 );
                rbSeven = (RadioButton)findViewById ( R.id.rb7 );
                rbEight = (RadioButton)findViewById ( R.id.rb8 );
                rbNine = (RadioButton)findViewById ( R.id.rb9 );

                if(rbOne.isChecked ()){
                    Toast.makeText ( MainActivity.this, "main" , Toast.LENGTH_SHORT ).show ();
                }
                if(rbTwo.isChecked ()){
                    Toast.makeText ( MainActivity.this, "implements" , Toast.LENGTH_SHORT ).show ();
                }
                if(rbThree.isChecked ()){
                    Toast.makeText ( MainActivity.this, "extends" , Toast.LENGTH_SHORT ).show ();
                }
                if(rbFour.isChecked ()){
                    Toast.makeText ( MainActivity.this, "java.lang" , Toast.LENGTH_SHORT ).show ();
                }
                if(rbFive.isChecked ()){
                    Toast.makeText ( MainActivity.this, "java.awt" , Toast.LENGTH_SHORT ).show ();
                }
                if(rbSix.isChecked ()){
                    Toast.makeText ( MainActivity.this, "java.awt.font" , Toast.LENGTH_SHORT ).show ();
                }
                if(rbSeven.isChecked ()){
                    Toast.makeText ( MainActivity.this, "extend a class" , Toast.LENGTH_SHORT ).show ();
                }
                if(rbEight.isChecked ()){
                    Toast.makeText ( MainActivity.this, "instantiate an object" , Toast.LENGTH_SHORT ).show ();
                }
                if(rbNine.isChecked ()){
                    Toast.makeText ( MainActivity.this, "make objects" , Toast.LENGTH_SHORT ).show ();
                }

                //  calling input method  /////
                input ( v );

                //  for the checkboxes
                one = (CheckBox) findViewById ( R.id.checkbox_true );
                two = (CheckBox) findViewById ( R.id.checkbox_long );
                three = (CheckBox) findViewById ( R.id.checkbox_static );
                four = (CheckBox) findViewById ( R.id.checkbox_end );

                if (one.isChecked ()) {
                    Toast.makeText ( MainActivity.this, "Answer one", Toast.LENGTH_SHORT ).show ();
                }
                if (two.isChecked ()) {
                    Toast.makeText ( MainActivity.this, "Answer two", Toast.LENGTH_SHORT ).show ();
                }
                if (three.isChecked ()) {
                    Toast.makeText ( MainActivity.this, "Answer three", Toast.LENGTH_SHORT ).show ();
                }
                if (four.isChecked ()) {
                    Toast.makeText ( MainActivity.this, "Answer four", Toast.LENGTH_SHORT ).show ();
                }


            }


        } );


    }

    public void input(View view) {
        // getting value form editText
        input = (EditText) findViewById ( R.id.editText_input );
        String answer = input.getText ().toString ();
        Toast.makeText ( MainActivity.this, answer, Toast.LENGTH_SHORT ).show ();

    }


}
