package com.abhis.ucpartner_clone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import Adapter.RecyclerAdapter;
import Model.ListItem;

public class NewFragment extends Fragment{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_new, container, false);

        setHasOptionsMenu(true);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        listItems = new ArrayList<>();


        ListItem item = new ListItem("Mridul Gupta" , "Yoga Instructor at home", "Male, Morning Slot, Weight Loss", "Ansal Plaza, Udyog Vihar, Gurgaon");
        listItems.add(item);

        ListItem item2 = new ListItem("Arpit" , "Yoga Instructor at home", "Male, Evening Slot, Stamina Building", "Ardee City, Gurgaon");
        listItems.add(item2);

        adapter = new RecyclerAdapter(getActivity(),listItems);
        recyclerView.setAdapter(adapter);

        Toolbar toolbar = getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("New Leads");

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.toolbar_leads, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
