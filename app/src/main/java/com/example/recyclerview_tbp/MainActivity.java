package com.example.recyclerview_tbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvUser;
    private UserAdapter mUserAdapter;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcv_user);
        mUserAdapter = new UserAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        rcvUser.setLayoutManager(gridLayoutManager);
        mUserAdapter.setData(getListUser());

        rcvUser.setAdapter(mUserAdapter);
    }
    private List<User> getListUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.avt11,"User name 1"));
        list.add(new User(R.drawable.avt2,"User name 2"));
        list.add(new User(R.drawable.avt3,"User name 3"));
        list.add(new User(R.drawable.avt4,"User name 4"));

        list.add(new User(R.drawable.avt5,"User name 5"));
        list.add(new User(R.drawable.avt6,"User name 6"));
        list.add(new User(R.drawable.avt1,"User name 7"));
        list.add(new User(R.drawable.avt2,"User name 8"));

        list.add(new User(R.drawable.avt3,"User name 9"));
        list.add(new User(R.drawable.avt3,"User name 9"));
        list.add(new User(R.drawable.avt3,"User name 9"));
        list.add(new User(R.drawable.avt3,"User name 9"));


        return list;

    }
}