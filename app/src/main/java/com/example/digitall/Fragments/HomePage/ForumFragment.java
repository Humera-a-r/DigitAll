package com.example.digitall.Fragments.HomePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.ForumFragmentBinding;

import java.util.ArrayList;
import java.util.List;

public class ForumFragment extends DialogFragment {

    ForumFragmentBinding forumFragmentBinding;
    EditText editTextPostTitle, editTextPostContent;
    Button buttonSubmitPost;
    ListView listViewPosts;
    List<String> postList;
    PostAdapter postAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        forumFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.forum_fragment, container, false);
        View forumView = forumFragmentBinding.getRoot();

        editTextPostTitle = forumView.findViewById(R.id.editTextPostTitle);
        editTextPostContent = forumView.findViewById(R.id.editTextPostContent);
        buttonSubmitPost = forumView.findViewById(R.id.buttonSubmitPost);
        listViewPosts = forumView.findViewById(R.id.listViewPosts);

        // Initialize post list
        postList = new ArrayList<>();

        // Initialize post adapter
        postAdapter = new PostAdapter(getContext(), R.layout.post_item, postList);
        listViewPosts.setAdapter(postAdapter);

        buttonSubmitPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String postTitle = editTextPostTitle.getText().toString().trim();
                String postContent = editTextPostContent.getText().toString().trim();

                if (!postTitle.isEmpty() && !postContent.isEmpty()) {
                    // Add post to the list
                    postList.add(postTitle + "\n" + postContent);

                    // Notify adapter
                    postAdapter.notifyDataSetChanged();

                    // Clear input fields
                    editTextPostTitle.setText("");
                    editTextPostContent.setText("");

                    // Show success message
                    Toast.makeText(getContext(), "Post submitted", Toast.LENGTH_SHORT).show();
                } else {
                    // Show error message if fields are empty
                    Toast.makeText(getContext(), "Please fill all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return forumView;
    }
}
