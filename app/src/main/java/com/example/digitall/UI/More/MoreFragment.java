package com.example.digitall.UI.More;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.MoreFragmentBinding;

public class MoreFragment extends DialogFragment {
    MoreFragmentBinding moreFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        moreFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.more_fragment, container, false);
        View moreView = moreFragmentBinding.getRoot();
        return moreView;
    }
}
