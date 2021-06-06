package edu.pucit.trustwalefare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.OrganizationId).setOnClickListener(this::onClick);
        findViewById(R.id.donationId).setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        switch (view.getId()){
            case R.id.OrganizationId:
                intent=new Intent(this,Organization.class);
                startActivity(intent);
                break;
            default:
                intent = new Intent(this,Donor.class);
                startActivity(intent);
                break;
        }
    }
}