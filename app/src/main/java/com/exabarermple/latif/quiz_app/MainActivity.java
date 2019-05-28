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

                //  calling for editText input
                input(v);

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
