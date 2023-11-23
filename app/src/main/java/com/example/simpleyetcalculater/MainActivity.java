package com.example.simpleyetcalculater;

import static com.example.simpleyetcalculater.R.id;
import static com.example.simpleyetcalculater.R.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAdd,btnSub,btnMul,btnDiv,button;
    TextView textviewFirst,textviewSecond,textviewAnswer;
    EditText editTextFirst,editTextSecond;
    int num1,num2;
    float num3,num4,num5;
    String SIN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnSub=(Button) findViewById(R.id.btnSub);
        btnMul=(Button) findViewById(R.id.btnMul);
        btnDiv=(Button) findViewById(R.id.btnDiv);
        button=(Button) findViewById(R.id.button);
        textviewAnswer=(TextView) findViewById(R.id.textviewAnswer);
        textviewFirst=(TextView) findViewById(R.id.textviewFirst);
        textviewSecond=(TextView) findViewById(R.id.textviewSecond);
        editTextFirst=(EditText) findViewById(R.id.editTextFirst);
        editTextSecond=(EditText) findViewById(R.id.editTextSecond);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SIN == "@+id/btnAdd")
                    textviewAnswer.setText("=" + (num1 + num2));
                 else if (SIN=="@+id/btnSub")
                    textviewAnswer.setText( "="+(num1-num2));
                else if (SIN=="@+id/btnMul")
                    textviewAnswer.setText( "="+(num1*num2));

                else if (SIN=="@+id/btnDiv") {
                    if(num1%num2==0){
                        textviewAnswer.setText( "="+(num1/num2));
                    }
                    else {
                        num3 = num1;
                        num4 = num2;
                        num5 = num3 / num4;
                        textviewAnswer.setText("=" + (num5));
                    }
                }
               else
                    textviewAnswer.setText("0");
            }
        });

    }
    public int getNumbers(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText( this,"please enter number",Toast.LENGTH_SHORT).show();
            return 0;
        }else {
            return Integer.parseInt(editText.getText().toString());
        }
    }

    @Override
    public void onClick(View view) {
        num1=getNumbers(editTextFirst);
        num2=getNumbers(editTextSecond);
        switch (view.getId()){
            case R.id.btnAdd:
                SIN="@+id/btnAdd";
                break;
            case R.id.btnSub:
                SIN="@+id/btnSub";
                break;
            case R.id.btnMul:
                SIN="@+id/btnMul";
                break;
            case R.id.btnDiv:
                SIN="@+id/btnDiv";
              break;
        }
/*                           GROUP MEMBERS
            NAME                                      ID
            1.YISHAK TUMORO                       0233/13
            2.OKASHA MUSTAFA                      0192/13
            3.EPHRAM NIGUSE                       0084/13
            4.MOHAMMED MUHIDIAN                   0511/09

 */


    }

    }
