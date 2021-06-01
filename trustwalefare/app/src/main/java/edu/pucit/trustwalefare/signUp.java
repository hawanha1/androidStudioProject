package edu.pucit.trustwalefare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class signUp extends AppCompatActivity {
    Bundle bundle;
    Intent i;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.logInButton).setOnClickListener(this::onClick);
        findViewById(R.id.signUpButton).setOnClickListener(this::onClick);
    }
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.signUpButton:
                i=new Intent(this,HomeActivity.class);
                editText=findViewById(R.id.inputEmail);
                bundle=new Bundle();
                String email=editText.getText().toString();
                bundle.putString("keyEmail",email);
                i.putExtras(bundle);
                editText=findViewById(R.id.inputPassword);
                String password=editText.getText().toString();
                bundle.putString("keyPassword",password);
                i.putExtras(bundle);
                editText=findViewById(R.id.inputName);
                String name = editText.getText().toString();
                bundle.putString("keyName",name);
                i.putExtras(bundle);
                editText=findViewById(R.id.inputPhone);
                String phone = editText.getText().toString();
                bundle.putString("keyPhone",phone);
                i.putExtras(bundle);
                startActivity(i);
                break;
            default:
                i=new Intent(this,MainActivity.class);
                startActivity(i);
                break;
        }
    }
}