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
    RadioGroup groupOne,groupTwo,groupThree;
   EditText input;
   CheckBox one,two,three,four;
    Button sbm, rst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        sbm = (Button)findViewById ( R.id.submitButton );

        sbm.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                groupOne = (RadioGroup) findViewById(R.id.group_one );
                groupTwo = (RadioGroup) findViewById(R.id.group_two );
                groupThree = (RadioGroup)findViewById ( R.id.group_three );

                switch (groupOne.getCheckedRadioButtonId())
                {
                    case R.id.rb2:
                        Toast.makeText ( MainActivity.this, "Correct answer" , Toast.LENGTH_SHORT ).show ();

                        break;

                    case R.id.rb1:
                        Toast.makeText ( MainActivity.this, "Wrong answer" , Toast.LENGTH_SHORT ).show ();
                        break;
                    case R.id.rb3:
                        Toast.makeText ( MainActivity.this, "Wrong answer" , Toast.LENGTH_SHORT ).show ();
                        break;
                }
                // for the second question
                switch (groupTwo.getCheckedRadioButtonId())
                {
                    case R.id.rb4:
                        Toast.makeText ( MainActivity.this, "Correct answer" , Toast.LENGTH_SHORT ).show ();

                        break;

                    case R.id.rb5:
                        Toast.makeText ( MainActivity.this, "Wrong answer" , Toast.LENGTH_SHORT ).show ();
                        break;
                    case R.id.rb6:
                        Toast.makeText ( MainActivity.this, "Wrong answer" , Toast.LENGTH_SHORT ).show ();
                        break;
                }
                // for the third question
                switch (groupThree.getCheckedRadioButtonId())
                {
                    case R.id.rb7:
                        Toast.makeText ( MainActivity.this, "Wrong answer" , Toast.LENGTH_SHORT ).show ();

                        break;

                    case R.id.rb8:
                        Toast.makeText ( MainActivity.this, "Wrong answer" , Toast.LENGTH_SHORT ).show ();
                        break;
                    case R.id.rb9:
                        Toast.makeText ( MainActivity.this, "Correct answer" , Toast.LENGTH_SHORT ).show ();
                        break;
                }
                //  calling input method  /////
                input(v);

                //  for the checkboxes
                one = (CheckBox)findViewById ( R.id.checkbox_true );
                two = (CheckBox)findViewById ( R.id.checkbox_long );
                three = (CheckBox)findViewById ( R.id.checkbox_static );
                four = (CheckBox)findViewById ( R.id.checkbox_end);

                if (one.isChecked ()){
                    Toast.makeText ( MainActivity.this, "Answer one" , Toast.LENGTH_SHORT ).show ();
                }
                if(two.isChecked ()){
                    Toast.makeText ( MainActivity.this, "Answer two" , Toast.LENGTH_SHORT ).show ();
                }
                if (three.isChecked ()){
                    Toast.makeText ( MainActivity.this, "Answer three" , Toast.LENGTH_SHORT ).show ();
                }
                if(four.isChecked ()){
                    Toast.makeText ( MainActivity.this, "Answer four" , Toast.LENGTH_SHORT ).show ();
                }


            }


    });



}

public void input(View view){
    // getting value form editText
    input = (EditText)findViewById ( R.id.editText_input );
    String answer = input.getText ().toString ();
    Toast.makeText ( MainActivity.this, answer , Toast.LENGTH_SHORT ).show ();

}


}
