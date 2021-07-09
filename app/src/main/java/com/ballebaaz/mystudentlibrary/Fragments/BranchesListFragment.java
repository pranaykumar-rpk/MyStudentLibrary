package com.ballebaaz.mystudentlibrary.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ballebaaz.mystudentlibrary.databinding.BranchesListFragmentBinding;

public class BranchesListFragment extends Fragment {
    private BranchesListFragmentBinding branchesListFragmentBinding;
    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        branchesListFragmentBinding=BranchesListFragmentBinding.inflate(inflater,container,false);
        recyclerView=branchesListFragmentBinding.recyclerView;
        return branchesListFragmentBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
