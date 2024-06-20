package com.example.digitall.UI.AgriTech;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.AgritechFragmentBinding;

public class AgriTechFragment extends DialogFragment {
    AgritechFragmentBinding agritechFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        agritechFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.agritech_fragment, container,false);
        View agritechView = agritechFragmentBinding.getRoot();
        return agritechView;
    }
}
