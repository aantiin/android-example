package com.example.antin.fragment.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.antin.fragment.R;
import com.example.antin.fragment.adapter.NameAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by antin on 12/14/15.
 */
public class Satu extends Fragment {

    private View view;
    private RecyclerView recyclerView;

    public Satu() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_satu, container, false);

        recyclerView = (RecyclerView) view.findViewById(android.R.id.list);
        final LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        loadList();
        return view;
    }

    private void loadList() {
        final String[] arrayName = {"ani", "abi", "aci", "adi", "aei", "afi", "agi", "ahi", "aii", "aji", "aki", "ali", "ami", "ani", "aoi", "api", "aqi", "ari", "ari", "ati", "aui", "avi", "awi", "axi", "ayi", "azi"};
        List<String> names = Arrays.asList(arrayName);

        NameAdapter nameAdapter = new NameAdapter(names);
        recyclerView.setAdapter(nameAdapter);
    }
}
