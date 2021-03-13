package com.example.barbosa_lab3.model;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.example.barbosa_lab3.R;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private String TAG = "VIEW_HOLDER";

    public TextView name;
    public TextView capital;

    public ViewHolder(View itemView) {
        super(itemView);


        itemView.setOnClickListener(this);
        name = itemView.findViewById(R.id.text_name);
        capital = itemView.findViewById(R.id.text_capital);

    }

    @Override
    public void onClick(View v) {
        Log.i(TAG, "clicked" + String.valueOf(v.getId()).toString());
    }
}
