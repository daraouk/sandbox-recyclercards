package com.daraouk.sandboxrecyclercards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.EmployeeViewHolder> {

    private ArrayList<Employee> employeeArrayList;

    public MyAdapter(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    @Override
    public MyAdapter.EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_item, parent, false);

        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.EmployeeViewHolder holder, int position) {
        // bind data to cards
        holder.empName.setText(employeeArrayList.get(position).getName());
        holder.empTitle.setText(employeeArrayList.get(position).getTitle());
        holder.empEmail.setText(employeeArrayList.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return employeeArrayList.size();
    }

    /* Employee View Holder */
    class EmployeeViewHolder extends RecyclerView.ViewHolder {
        TextView empName, empTitle, empEmail;

        public EmployeeViewHolder(View itemView) {
            super(itemView);

            empName = (TextView) itemView.findViewById(R.id.txtName);
            empTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            empEmail = (TextView) itemView.findViewById(R.id.txtEmail);
        }
    }
}
