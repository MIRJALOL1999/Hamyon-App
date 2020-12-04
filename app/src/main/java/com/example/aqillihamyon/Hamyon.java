package com.example.aqillihamyon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Hamyon extends Fragment {


    ArrayList<Model> models;
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    Model model;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hamyon, container, false);
        models=new ArrayList<>();
        models.add(new Model(R.drawable.burger,"Oziq Ovqat"));
        models.add(new Model(R.drawable.taxi,"Taksi"));
        models.add(new Model(R.drawable.education,"O`qish"));
        models.add(new Model(R.drawable.phonendoscope,"Sog`lik"));
        models.add(new Model(R.drawable.internet,"Internet"));
        models.add(new Model(R.drawable.jumper,"Kiyim"));
        models.add(new Model(R.drawable.car,"Mashina"));

        recyclerView=view.findViewById(R.id.recyclerview);
        myAdapter=new MyAdapter(getContext(),models);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(myAdapter);



        return view;
    }
}