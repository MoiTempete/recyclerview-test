package com.moi.example.fragments;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.moi.example.GridDividerDecoration;
import com.moi.example.layout.FixedGridLayoutManager;

public class FixedTwoWayFragment extends RecyclerFragment{

    public static FixedTwoWayFragment newInstance() {
        FixedTwoWayFragment fragment = new FixedTwoWayFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        FixedGridLayoutManager manager = new FixedGridLayoutManager();
        manager.setTotalColumnCount(10);

        return manager;
    }

    @Override
    protected RecyclerView.ItemDecoration getItemDecoration() {
        return new GridDividerDecoration(getActivity());
    }

    @Override
    protected int getDefaultItemCount() {
        return 5;
    }
}
