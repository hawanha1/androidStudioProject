package edu.pucit.trustwalefare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class add_donor extends AppCompatActivity {
    int logo;
    String name;
    TextView organizationName;
    ImageView organizationLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_donor);

        organizationName = findViewById(R.id.textView);
        organizationLogo = findViewById(R.id.imageView);

        name = getIntent().getStringExtra("organizationName");
        logo = getIntent().getIntExtra("organizationImage", 1);


        organizationName.setText(name);
        organizationLogo.setImageResource(logo);
    }
}