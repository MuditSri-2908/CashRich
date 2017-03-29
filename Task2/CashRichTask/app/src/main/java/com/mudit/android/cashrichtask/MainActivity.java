package com.mudit.android.cashrichtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public int val_1=0,val_2=0,val_3=0;
    public EditText input_1,input_2,input_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_1= (EditText)findViewById(R.id.editText1);
        input_2= (EditText)findViewById(R.id.editText2);
        input_3= (EditText)findViewById(R.id.editText3);
        input_3.setKeyListener(null);
        input_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value_ip =input_1.getText().toString();
                if(value_ip.equals("")|| value_ip.equals("-")){
                    val_1=0;
                }
                else {
                    val_1 = Integer.parseInt(value_ip);
                }
                val_3=val_1+val_2;
                String value_op=Integer.toString(val_3);
                input_3.setText(value_op);
            }
        });

        input_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String value_ip =input_2.getText().toString();
                if(value_ip.equals("") || value_ip.equals("-")){
                    val_2=0;
                }
                else {
                    val_2 = Integer.parseInt(value_ip);
                }
                val_3=val_1+val_2;
                String value_op=Integer.toString(val_3);
                input_3.setText(value_op);
            }
        });
    }

}
