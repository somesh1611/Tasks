package com.example.tasks;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class ContentAdapter extends ArrayAdapter<Content> {

    public ContentAdapter(@NonNull Activity context, ArrayList<Content> contents) {
        super(context, 0,contents);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitem = convertView;
        if(listitem == null){
            listitem = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Content content = getItem(position);

        TextView title = (TextView)listitem.findViewById(R.id.title);
        title.setText(content.getTitle());

        TextView body = (TextView)listitem.findViewById(R.id.body);
        body.setText(content.getBody());

        TextView authors = (TextView)listitem.findViewById(R.id.author);
        String admins = "";
        for(String admin : content.getAdmins()){
            admins += admin + " ";
        }
        authors.setText(admins);

        return listitem;

    }
}
