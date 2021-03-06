package edu.pucit.trustwalefare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Organization extends AppCompatActivity {
    String s1[];
    int images[]={R.drawable.admin,R.drawable.donor,R.drawable.background,R.drawable.organization,R.drawable.member,R.drawable.admin,R.drawable.donor};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization);

        recyclerView=findViewById(R.id.OrganizationRecyclerView);
        s1=getResources().getStringArray(R.array.OrganizationNames);

        recyclerViewAdapter recyclerAdapter=new recyclerViewAdapter(this,s1,images);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}