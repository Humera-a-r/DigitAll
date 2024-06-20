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
import com.example.digitall.UI.AgriTech.FarmManagementFragment;
import com.example.digitall.UI.AgriTech.TechnologyFragment;
import com.example.digitall.UI.SkillDevelopment.CourseLibraryFragment;
import com.example.digitall.UI.SkillDevelopment.InteractiveModulesFragment;
import com.example.digitall.UI.SkillDevelopment.LearningPathFragment;
import com.example.digitall.UI.SkillDevelopment.OfflineAccessFragment;
import com.example.digitall.UI.SkillDevelopment.ProgressTrackingFragment;
import com.example.digitall.databinding.SkilldevelopmentFragmentBinding;

public class SkillDevelopment extends DialogFragment implements View.OnClickListener {
    SkilldevelopmentFragmentBinding skilldevelopmentFragmentBinding;
    private Button courselibbtn;
    private Button LearningPathbtn;
    private Button offlineaccessbtn;
    private Button InteractiveModules;
    private Button progressTracking;

    public static SkillDevelopment newInstance(){
        return new SkillDevelopment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        skilldevelopmentFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.skilldevelopment_fragment, container, false);
        View skillView = skilldevelopmentFragmentBinding.getRoot();
        configureViewFinding();
        return skillView;
    }
    private void configureViewFinding() {
        AppCompatImageView imageBack = skilldevelopmentFragmentBinding.imageBack;
        imageBack.setOnClickListener(v -> dismiss());
        courselibbtn  = skilldevelopmentFragmentBinding.courselibbtn;
        courselibbtn.setOnClickListener(this);
        LearningPathbtn  = skilldevelopmentFragmentBinding.LearningPathbtn;
        LearningPathbtn.setOnClickListener(this);
        offlineaccessbtn  = skilldevelopmentFragmentBinding.offlineaccessbtn;
        offlineaccessbtn.setOnClickListener(this);
        InteractiveModules  = skilldevelopmentFragmentBinding.InteractiveModules;
        InteractiveModules.setOnClickListener(this);
        progressTracking  = skilldevelopmentFragmentBinding.progressTracking;
        progressTracking.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == courselibbtn.getId()){
            DialogFragment courselib = CourseLibraryFragment.newInstance();
            courselib.setArguments(new Bundle());
            courselib.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            courselib.show(getChildFragmentManager(), "Course Library");
        } else if (view.getId() == LearningPathbtn.getId()) {
            DialogFragment learning = LearningPathFragment.newInstance();
            learning.setArguments(new Bundle());
            learning.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            learning.show(getChildFragmentManager(), "Learning Path");

        }else if (view.getId() == offlineaccessbtn.getId()) {
            DialogFragment offlineaccess = OfflineAccessFragment.newInstance();
            offlineaccess.setArguments(new Bundle());
            offlineaccess.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            offlineaccess.show(getChildFragmentManager(), "Offline Access Fragment");

        }else if (view.getId() == InteractiveModules.getId()) {
            DialogFragment interactive = InteractiveModulesFragment.newInstance();
            interactive.setArguments(new Bundle());
            interactive.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            interactive.show(getChildFragmentManager(), "Interactive Modules Fragment ");

        }else if (view.getId() == progressTracking.getId()) {
            DialogFragment progresstracking = ProgressTrackingFragment.newInstance();
            progresstracking.setArguments(new Bundle());
            progresstracking.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            progresstracking.show(getChildFragmentManager(), "Progress Tracking ");

        }

    }
}
