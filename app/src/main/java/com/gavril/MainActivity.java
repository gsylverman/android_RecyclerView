package com.gavril;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView projectsRecyclerView;
    private List<Project> projects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        projects = new ArrayList<Project>() {
            {
                add(new Project("First Project1", "Some description1", R.drawable.calculator));
                add(new Project("First Project2", "Some description2", R.drawable.getting_started));
                add(new Project("First Project3", "Some description3", R.drawable.hungry_developer));
                add(new Project("First Project4", "Some description4", R.drawable.quote));
                add(new Project("First Project5", "Some description5", R.drawable.tape));
            }
        };

        projectsRecyclerView = findViewById(R.id.recycler_list_view);

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        projectsRecyclerView.setAdapter(adapter);


    }
}


