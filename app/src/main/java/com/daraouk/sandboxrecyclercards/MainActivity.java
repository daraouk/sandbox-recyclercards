package com.daraouk.sandboxrecyclercards;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_main);

        // set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("Mike", "Chief Executive Officer", "mike@dummycompany.com"));
        employeesList.add(new Employee("John", "Chief Finance Officer", "john@dummycompany.com"));
        employeesList.add(new Employee("Samantha", "Chief Marketing Officer", "samantha@dummycompany.com"));
        employeesList.add(new Employee("Lloyd", "Head of Regional Sales", "lloyd@dummycompany.com"));
        employeesList.add(new Employee("Belinda", "Head of Operations", "belinda@dummycompany.com"));
        employeesList.add(new Employee("Worker #1", "Packaging Officer", "packaging@dummycompany.com"));
        employeesList.add(new Employee("Worker #2", "Packaging Officer", "packaging@dummycompany.com"));
        employeesList.add(new Employee("Worker #3", "Packaging Officer", "packaging@dummycompany.com"));
        employeesList.add(new Employee("Worker #4", "Packaging Officer", "packaging@dummycompany.com"));
        employeesList.add(new Employee("Worker #5", "Packaging Officer", "packaging@dummycompany.com"));
        employeesList.add(new Employee("Worker #6", "Packaging Officer", "packaging@dummycompany.com"));

        // set adapter
        adapter = new MyAdapter(employeesList);
        recyclerView.setAdapter(adapter);
    }
}
