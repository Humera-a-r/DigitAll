package com.example.digitall.UI.SkillDevelopment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.UI.SupplyChain.CommunicateWithConsumerFragment;
import com.example.digitall.databinding.OfflineAccessFragmentBinding;

public class OfflineAccessFragment extends DialogFragment {
    OfflineAccessFragmentBinding offlineAccessFragmentBinding;
    public static OfflineAccessFragment newInstance() {
        return new OfflineAccessFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        offlineAccessFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.offline_access_fragment, container,false);
        View offlineview = offlineAccessFragmentBinding.getRoot();
        return offlineview;
    }
}
