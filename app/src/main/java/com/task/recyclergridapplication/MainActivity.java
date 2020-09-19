package com.task.recyclergridapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;
    List<Person> personList;
    public static final int PERMISSION_WRITE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        personList = preparePersonList();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //checkPermission();
        recyclerView =findViewById(R.id.recycler_view);
        layoutManager=  new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter= new RecyclerViewAdapter(personList);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);
    }

    public boolean checkPermission() {
        int READ_EXTERNAL_PERMISSION = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
        if((READ_EXTERNAL_PERMISSION != PackageManager.PERMISSION_GRANTED)) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSION_WRITE);
            return false;
        }
        return true;
    }

    private List<Person> preparePersonList() {
        List<Person>  personList1 = new ArrayList<>();
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/astonished-face-icon.png","ABV",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/beaming-face-with-smiling-eyes-icon.png","VMD",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/face-savoring-food-icon.png","ABV",23));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/sleeping-face-icon.png","ABV",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/slightly-smiling-face-icon.png","ABV",23));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/astonished-face-icon.png","ABV",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/beaming-face-with-smiling-eyes-icon.png","VMD",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/face-savoring-food-icon.png","ABV",23));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/sleeping-face-icon.png","ABV",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/slightly-smiling-face-icon.png","ABV",23));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/astonished-face-icon.png","ABV",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/beaming-face-with-smiling-eyes-icon.png","VMD",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/face-savoring-food-icon.png","ABV",23));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/sleeping-face-icon.png","ABV",24));
        personList1.add(new Person("https://filedn.com/lgUoohV9TXEbD0gO5xIIyuV/faces/slightly-smiling-face-icon.png","ABV",23));
        return personList1;
    }
}