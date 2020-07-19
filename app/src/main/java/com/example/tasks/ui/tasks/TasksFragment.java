package com.example.tasks.ui.tasks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.tasks.Content;
import com.example.tasks.ContentAdapter;
import com.example.tasks.R;

import java.util.ArrayList;
import java.util.List;

public class TasksFragment extends Fragment {

    private TasksViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
               new ViewModelProvider(this).get(TasksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tasks, container, false);

        ArrayList<Content> contents = new ArrayList<Content>();

        for(int i = 0; i < 10;i++){
            contents.add(new Content("Hello Title",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam id risus ac nisl dignissim faucibus. Aliquam eget sapien varius, tempus neque eget, sodales lectus. Proin eu ligula eu dui tempor viverra eget in tellus. Fusce placerat et magna non hendrerit. Morbi auctor sed neque eget faucibus. Maecenas fringilla, lacus at placerat sodales, felis tortor elementum nunc, sed lobortis dolor nibh sed augue. Proin pharetra, elit vel viverra commodo, turpis libero cursus lorem, in vehicula risus neque sit amet tortor. Fusce placerat tellus augue, non fringilla metus dictum ut. Sed turpis velit, scelerisque nec tristique nec, aliquam non nibh. Donec varius elit vitae gravida bibendum. Maecenas molestie dapibus lacus sit amet laoreet. Cras in posuere sapien. Proin eleifend leo eget odio tempus, et venenatis dui posuere. Nam porttitor consequat ipsum eget commodo. Vivamus pharetra consectetur tincidunt. Morbi dapibus semper elit vel molestie.",
                    "Greals","Admin","Telles"
                    ));
        }
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        ListView listView = root.findViewById(R.id.tasks_list);
        ContentAdapter adapter = new ContentAdapter(getActivity(),contents);
        listView.setAdapter(adapter);

       return root;
    }
}