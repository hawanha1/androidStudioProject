package edu.pucit.trustwalefare;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.MyViewHolder> {
    String data[];
    int images[];
    Context context;
    recyclerViewAdapter(Context ct,String names[],int img[]){
        context=ct;
        data=names;
        images=img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.organization_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myTextView.setText(data[position]);
        holder.myImages.setImageResource(images[position]);
        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,add_donor.class);
                context.startActivity(intent);
            }
        });
        holder.edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,add_donor.class);
                intent.putExtra("organizationName",data[position]);
                intent.putExtra("organizationImage",images[position]);
                context.startActivity(intent);
            }
        });
        holder.main_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,add_donor.class);
                intent.putExtra("organizationName",data);
                intent.putExtra("organizationImage",images);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myTextView;
        ImageView myImages;
        ConstraintLayout main_layout;
        Button add,edit;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myTextView=itemView.findViewById(R.id.textView);
            myImages=itemView.findViewById(R.id.imageView);
            add= itemView.findViewById(R.id.addButton);
            edit= itemView.findViewById(R.id.editButton);
            main_layout= itemView.findViewById(R.id.mainRowLayout);
        }
    }
}
