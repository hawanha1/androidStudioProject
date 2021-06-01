package edu.pucit.trustwalefare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class signUp extends AppCompatActivity {
    Bundle bundle;
    Intent i;
    AutoCompleteTextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.logInButton).setOnClickListener(this::onClick);
        findViewById(R.id.signUpButton).setOnClickListener(this::onClick);
    }
    @SuppressLint("WrongViewCast")
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.signUpButton:
                i=new Intent(this,HomeActivity.class);
                textView=(AutoCompleteTextView)findViewById(R.id.inputEmail);
                bundle=new Bundle();
                String email=textView.getText().toString();
                bundle.putString("email",email);
                i.putExtras(bundle);
                textView=(AutoCompleteTextView)findViewById(R.id.inputPassword);
                String password=textView.getText().toString();
                bundle.putString("password",password);
                i.putExtras(bundle);
                textView=(AutoCompleteTextView)findViewById(R.id.inputName);
                String name = textView.getText().toString();
                bundle.putString("name",name);
                i.putExtras(bundle);
                textView=(AutoCompleteTextView)findViewById(R.id.inputPhone);
                String phone = textView.getText().toString();
                bundle.putString("phone",phone);
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