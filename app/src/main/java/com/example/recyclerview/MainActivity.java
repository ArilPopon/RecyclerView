package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initdata();
        initRecyclerView();


    }

    private void initdata() {

        userList=new ArrayList<>();

        userList.add(new ModelClass(R.drawable.boy, "Maxx","10:45Am", "How Are You?" , "_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy2, "Sam","10:45Am", "Hello" , "_______________________________________"));

        userList.add(new ModelClass(R.drawable.potocewek, "Alice","10:45Am", "Oiiii" , "_______________________________________"));

        userList.add(new ModelClass(R.drawable.potocewek2, "Queen","10:45Am", "How Are You?" , "_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy, "Dam","10:45Am", "Hello" , "_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy2, "Deddy","10:45Am", "Heloo" , "_______________________________________"));

        userList.add(new ModelClass(R.drawable.potocewek, "Funi","10:45Am", "Oiiii" , "_______________________________________"));

        userList.add(new ModelClass(R.drawable.potocewek2, "Vivi","10:45Am", "How Are You?" , "_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy, "Ivan","10:45Am", "I'm fine" , "_______________________________________"));

    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}