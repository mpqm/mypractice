package com.mpqm.practice.RecyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import com.mpqm.practice.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView iv_img, iv_like, iv_share;
    public TextView tv_likecount, tv_username, tv_posttext;
    private PostAdapter mAdapter;

    public PostViewHolder(@NonNull View itemView, PostAdapter postAdapter) {
        super(itemView);
        mAdapter = postAdapter;
        iv_img = itemView.findViewById(R.id.iv_img);
        iv_like = itemView.findViewById(R.id.iv_like);
        iv_share = itemView.findViewById(R.id.iv_share);
        tv_likecount = itemView.findViewById(R.id.tv_likecount);
        tv_username = itemView.findViewById(R.id.tv_username);
        tv_posttext = itemView.findViewById(R.id.tv_posttext);
        iv_like.setOnClickListener(this);
        iv_share.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();
        switch (view.getId()){
            case R.id.iv_like:
                mAdapter.onLikeClicked(position);
                break;
            case R.id.iv_share:
                break;
        }


    }
}
