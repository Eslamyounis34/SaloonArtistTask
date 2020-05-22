package com.example.saloonbooking.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.saloonbooking.R;
import com.example.saloonbooking.model.SalonArtist;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ArtistsRecyclerAdapter extends RecyclerView.Adapter<ArtistsRecyclerAdapter.ViewHolder>{
    List<SalonArtist>artists=new ArrayList<>();
    Context context;

    public ArtistsRecyclerAdapter(List<SalonArtist> artists, Context context) {
        this.artists = artists;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return new ViewHolder(v);    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Picasso.get().load(artists.get(position).getImage()).into(holder.artistImage);
        holder.artistName.setText(artists.get(position).getArtistName());
    }

    @Override
    public int getItemCount() {
        return artists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView artistImage;
        TextView artistName;

        public ViewHolder(View itemView) {
            super(itemView);
            artistImage= itemView.findViewById(R.id.artistimag);
            artistName=itemView.findViewById(R.id.artistname);
        }
    }
}
