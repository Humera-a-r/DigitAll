package com.example.digitall.Fragments.HomePage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.digitall.R;

import java.util.List;

public class PostAdapter extends ArrayAdapter<String> {

    private Context context;
    private int resource;
    private List<String> posts;

    public PostAdapter(@NonNull Context context, int resource, @NonNull List<String> posts) {
        super(context, resource, posts);
        this.context = context;
        this.resource = resource;
        this.posts = posts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(resource, parent, false);
        }

        String post = posts.get(position);

        TextView textViewPostTitle = listItem.findViewById(R.id.textViewPostTitle);
        TextView textViewPostContent = listItem.findViewById(R.id.textViewPostContent);

        // Assuming the post string contains both title and content separated by a newline character
        String[] parts = post.split("\n");
        String postTitle = parts[0];
        String postContent = parts[1];

        textViewPostTitle.setText(postTitle);
        textViewPostContent.setText(postContent);

        return listItem;
    }
}
