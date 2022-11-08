package com.hfad.vacationdestination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{

    private ArrayList<VacationDestiation> destinationList;


    public  MyAdapter()
    {
        destinationList = Database.getData();
    }

    //inflate vacation row item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vaction_item, parent, false);

        return new MyViewHolder(view);

    }

    @Override
    public int getItemCount() {
        return destinationList.size();
    }

    //Index in list we wabt to show
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        VacationDestiation vd = destinationList.get(position);

        holder.setData(vd);
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        private TextView tvName;
        private ImageView imgvDestination;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgvDestination = itemView.findViewById(R.id.imvPlace);
            tvName =  itemView.findViewById(R.id.tvPlaceName);

        }

        public void setData(VacationDestiation vd)
        {
            imgvDestination.setImageResource(vd.getImageID());
            tvName.setText(vd.getPlaceName());
        }

    }

}
