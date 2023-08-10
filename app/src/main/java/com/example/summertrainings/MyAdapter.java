package com.example.summertrainings;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private List<FormationClass> formationList;

    public MyAdapter(Context context, List<FormationClass> formationList) {
        this.context = context;
        this.formationList = formationList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        Glide.with(context).load(formationList.get(position).getFormationImage()).into(holder.recImage);
        holder.recTitle.setText(formationList.get(position).getFormationTitle());
        holder.recDesc.setText(formationList.get(position).getFormationDesc());

        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailFormation_Activity.class);
                intent.putExtra("Image", formationList.get(holder.getAdapterPosition()).getFormationImage());
                intent.putExtra("Title", formationList.get(holder.getAdapterPosition()).getFormationTitle());
                intent.putExtra("Description", formationList.get(holder.getAdapterPosition()).getFormationDesc());

                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return formationList.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView recImage;
    TextView recTitle, recDesc;
    CardView recCard;

    public MyViewHolder (@NonNull View itemView){
        super(itemView);
        recImage = itemView.findViewById(R.id.recImage);
        recTitle = itemView.findViewById(R.id.recTitle);
        recDesc = itemView.findViewById(R.id.recDesc);
        recCard = itemView.findViewById(R.id.recCard);

    }
}