package edu.pucit.trustwalefare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DonorRecyclerViewAdapter extends RecyclerView.Adapter<DonorRecyclerViewAdapter.MyViewHolder> {
    String data[];
    int images[];
    Context context;
    DonorRecyclerViewAdapter(Context ct, String names[], int img[]){
        context=ct;
        data=names;
        images=img;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.donor_organizations_row,parent,false);
        return new DonorRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myTextView.setText(data[position]);
        holder.myImages.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myTextView;
        ImageView myImages;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myTextView=itemView.findViewById(R.id.textView);
            myImages=itemView.findViewById(R.id.imageView);
        }
    }
}
