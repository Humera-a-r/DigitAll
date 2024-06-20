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
import com.example.digitall.databinding.CourseLibraryFragmentBinding;

public class CourseLibraryFragment extends DialogFragment{
    CourseLibraryFragmentBinding courseLibraryFragmentBinding;
    public static CourseLibraryFragment newInstance() {
        return new CourseLibraryFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        courseLibraryFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.course_library_fragment, container,false);
        View courseview = courseLibraryFragmentBinding.getRoot();
        return courseview;
    }
}
