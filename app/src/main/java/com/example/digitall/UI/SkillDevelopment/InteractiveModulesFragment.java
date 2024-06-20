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
import com.example.digitall.databinding.InteractiveModulesFragmentBinding;

public class InteractiveModulesFragment extends DialogFragment {
    InteractiveModulesFragmentBinding interactiveModulesFragmentBinding;
    public static InteractiveModulesFragment newInstance() {
        return new InteractiveModulesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        interactiveModulesFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.interactive_modules_fragment, container,false);
        View interactview = interactiveModulesFragmentBinding.getRoot();
        return interactview;
    }
}
