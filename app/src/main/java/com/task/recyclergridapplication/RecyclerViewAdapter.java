package com.task.recyclergridapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    //int[] arr;
    private List<Person> personList;

    public RecyclerViewAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view,parent,false);
       MyViewHolder myViewHolder =  new MyViewHolder(view);

        return myViewHolder;
    }

    //String imageUri = "https://i.imgur.com/tGbaZCY.jpg";

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Person person = personList.get(position);//new Person(R.drawable.image8,"Rupesh",28);
        //Picasso.with(context).load(imageUri).into(imageView);
        Picasso.get().load(person.imageId).fit().into(holder.imageView);
        //holder.imageView.setImageResource(person.imageId);
        holder.personNameView.setText("Name: "+person.name);
        holder.personNameAge.setText("Age: "+person.age);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView personNameView;
        TextView personNameAge;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            personNameView = itemView.findViewById(R.id.textview_name);
            personNameAge = itemView.findViewById(R.id.textview_age);
        }
    }
}
