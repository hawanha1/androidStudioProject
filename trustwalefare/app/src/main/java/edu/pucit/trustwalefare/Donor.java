package edu.pucit.trustwalefare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Donor extends AppCompatActivity {
    String s1[];
    int images[]={R.drawable.admin,R.drawable.donor,R.drawable.background,R.drawable.organization,R.drawable.member,R.drawable.admin,R.drawable.donor};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor);
        recyclerView=findViewById(R.id.DonorOrganizationsRecyclerView);
        s1=getResources().getStringArray(R.array.OrganizationNames);

        DonorRecyclerViewAdapter donorRecyclerViewAdapter=new DonorRecyclerViewAdapter(this,s1,images);
        recyclerView.setAdapter(donorRecyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}