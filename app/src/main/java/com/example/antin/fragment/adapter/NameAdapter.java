package com.example.antin.fragment.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.antin.fragment.R;

import java.util.List;

/**
 * Created by antin on 12/14/15.
 */
public class NameAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> names;

    public NameAdapter(List<String> names) {
        this.names = names;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_name, parent, false);
        return new NameViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        NameViewHolder viewHolder = (NameViewHolder) holder;
        viewHolder.txtName.setText(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class NameViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        public final TextView txtName;

        public NameViewHolder(View view) {
            super(view);
            mView = view;
            txtName = (TextView) view.findViewById(R.id.txtName);
        }
    }
}
