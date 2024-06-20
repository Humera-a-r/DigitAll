package com.example.digitall.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.UI.AgriTech.AdministrationFragment;
import com.example.digitall.UI.AgriTech.TechnologyFragment;
import com.example.digitall.databinding.AgritechFragmentBinding;
import com.example.digitall.UI.AgriTech.FarmManagementFragment;

public class AgriTechFragment extends DialogFragment implements View.OnClickListener {
    AgritechFragmentBinding agritechFragmentBinding;
    private Button farmmanagementbtn;
    private Button technologybtn;
    private Button administrationbtn;

    public static AgriTechFragment newInstance(){
        return new AgriTechFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        agritechFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.agritech_fragment, container, false);
        View agritechView = agritechFragmentBinding.getRoot();
        configureViewFinding();
        return agritechView;
    }

    private void configureViewFinding() {
        AppCompatImageView imageBack = agritechFragmentBinding.imageBack;
        imageBack.setOnClickListener(v -> dismiss());

        farmmanagementbtn  = agritechFragmentBinding.farmmanagementbtn;
        farmmanagementbtn.setOnClickListener(this);
        technologybtn  = agritechFragmentBinding.technologybtn;
        technologybtn.setOnClickListener(this);
        administrationbtn  = agritechFragmentBinding.administrationbtn;
        administrationbtn.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        if (view.getId() == farmmanagementbtn.getId()){
            DialogFragment farmmanagement = FarmManagementFragment.newInstance();
            farmmanagement.setArguments(new Bundle());
            farmmanagement.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            farmmanagement.show(getChildFragmentManager(), "Farm Management Fragment");
        } else if (view.getId() == technologybtn.getId()) {
            DialogFragment technology = TechnologyFragment.newInstance();
            technology.setArguments(new Bundle());
            technology.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            technology.show(getChildFragmentManager(), "Technology management");

        }else if (view.getId() == administrationbtn.getId()) {
            DialogFragment administration = AdministrationFragment.newInstance();
            administration.setArguments(new Bundle());
            administration.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            administration.show(getChildFragmentManager(), "Administration Module");

        }

    }
}
