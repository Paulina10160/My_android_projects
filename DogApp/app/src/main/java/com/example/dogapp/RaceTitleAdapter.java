package com.example.dogapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class RaceTitleAdapter extends BaseAdapter {
    private List<String> races;
    private int resourceLayout;
    private Context mContex;

    public RaceTitleAdapter(@NonNull Context context, int resource, List<String> races) {
        this.races = races;
        this.resourceLayout = resource;
        this.mContex = context;
    }


    @Override
    public int getCount() {
        return races.size();
    }

    @Override
    public Object getItem(int position) {
        return races.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(mContex);
            v = vi.inflate(resourceLayout, parent);
        }

        String race = races.get(position);

        if (race != null) {
            TextView tt1 = v.findViewById(R.id.raceNumTv);
            if(tt1 != null)
            {
                tt1.setText(race.charAt(0));
            }
            TextView tt2 = v.findViewById(R.id.raceNameTv);
            if(tt1 != null)
            {
                tt1.setText(race);
            }
        }

        return v;
    }
}
