package com.abhis.ucpartner_clone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class ProfileFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile,null);

        TextView username = view.findViewById(R.id.username);
        ImageView imageView = view.findViewById(R.id.userimage);

        Toolbar toolbar = getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Profile");
        setHasOptionsMenu(true);

        //username.setText("Abhishek");
        //imageView.setImageDrawable(R.drawable.ic_dashboard_black_24dp);

        //return inflater.inflate(R.layout.fragment_profile,null);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.toolbar_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
