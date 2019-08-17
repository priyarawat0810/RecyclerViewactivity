package com.example.recyclerviewactivity;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Socialnet> list=new ArrayList<>();
    RecyclerView recyclerView;

    private void initData(){
        Socialnet s1 = new Socialnet(R.drawable.facebook,"Facebok","Dhoka");
        Socialnet s2 = new Socialnet(R.drawable.twitter,"Twitter","Complaints");
        Socialnet s3 = new Socialnet(R.drawable.youtube,"Youtube","Study");
        Socialnet s4 = new Socialnet(R.drawable.insta,"Instagram","barbadi");
        Socialnet s5 = new Socialnet(R.drawable.pinterest,"Pinterest","pics");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);

    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = getLayoutInflater().inflate(R.layout.mylist,parent,false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Socialnet data = list.get(position);
            holder.t1.setText(data.getTitle());
            holder.t2.setText(data.getSubTitle());
            holder.img.setImageDrawable(getDrawable(data.getImg()));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView t1,t2;
            ImageView img;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                t1 = itemView.findViewById(R.id.title);
                t2 = itemView.findViewById(R.id.subtitle);
                img = itemView.findViewById(R.id.imageView);
            }
        }
    }

}
