package com.example.digitall.Fragments.HomePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.QueriesFragmentBinding;

public class QueriesFragment extends DialogFragment {

    QueriesFragmentBinding queriesFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        queriesFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.queries_fragment, container, false);
        View queriesView = queriesFragmentBinding.getRoot();

        EditText editTextName = queriesView.findViewById(R.id.editTextName);
        EditText editTextEmail = queriesView.findViewById(R.id.editTextEmail);
        EditText editTextQuery = queriesView.findViewById(R.id.editTextQuery);
        Button buttonSubmit = queriesView.findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Disable text fields
                editTextName.setEnabled(false);
                editTextEmail.setEnabled(false);
                editTextQuery.setEnabled(false);

                // Show toast message
                Toast.makeText(getActivity(), "Query submitted", Toast.LENGTH_SHORT).show();
            }
        });

        return queriesView;
    }
}
