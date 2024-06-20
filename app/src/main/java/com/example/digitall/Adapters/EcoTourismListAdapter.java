package com.example.digitall.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitall.Models.EcoTourism.EcoTourismStateList;
import com.example.digitall.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EcoTourismListAdapter extends RecyclerView.Adapter<EcoTourismListAdapter.EcoTourismViewHolder> {

    private final Context context;
    private final List<EcoTourismStateList> ecoTourismStateList;

    public EcoTourismListAdapter(Context context, List<EcoTourismStateList> ecoTourismStateLst) {
        this.context = context;
        this.ecoTourismStateList = ecoTourismStateLst;
    }

    @NonNull
    @Override
    public EcoTourismListAdapter.EcoTourismViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.eco_tourism_list,parent,false);
        return new EcoTourismViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull EcoTourismListAdapter.EcoTourismViewHolder holder, int position) {

        EcoTourismStateList details = ecoTourismStateList.get(position);

        holder.stateName.setText(details.getName());
        holder.aboutState.setText(details.getAbout());

        String[] imgArray = details.getImg();

        // Convert String[] to ArrayList<String>
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(imgArray));

        ImageAdapter adapter = new ImageAdapter(context, arrayList);
        holder.stateImagesRecycler.setAdapter(adapter);

        adapter.setOnItemClickListener(new ImageAdapter.OnItemClickListener() {
            @Override
            public void onClick(ImageView imageView, String path) {
                //Do something like opening the image in new activity or showing it in full screen or something else.
            }
        });

    }

    @Override
    public int getItemCount() {
        return ecoTourismStateList.size();
    }

    public class EcoTourismViewHolder extends RecyclerView.ViewHolder {
        private final TextView stateName;
        private final TextView aboutState;
        private final RecyclerView stateImagesRecycler;
        public EcoTourismViewHolder(@NonNull View itemView) {
            super(itemView);

            stateName = itemView.findViewById(R.id.stateName);
            aboutState = itemView.findViewById(R.id.aboutState);
            stateImagesRecycler = itemView.findViewById(R.id.recycler);
        }
    }
}
