package edu.pucit.trustwalefare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Organization extends AppCompatActivity {
    String s1[];
    int images[]={R.drawable.admin,R.drawable.donor,R.drawable.background,R.drawable.organization,R.drawable.member,R.drawable.admin,R.drawable.donor};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization);

        s1=getResources().getStringArray(R.array.OrganizationNames);
    }
}