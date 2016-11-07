package com.allandroidprojects.ecomsample.options;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.product.ItemDetailsActivity;
import com.allandroidprojects.ecomsample.utility.ImageUrlUtils;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;

import static com.allandroidprojects.ecomsample.fragments.ImageListFragment.STRING_IMAGE_POSITION;
import static com.allandroidprojects.ecomsample.fragments.ImageListFragment.STRING_IMAGE_URI;

public class WishlistActivity extends AppCompatActivity {
    private static Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recylerview_list);
        mContext = WishlistActivity.this;

        ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
        ArrayList<String> wishlistImageUri =imageUrlUtils.getWishlistImageUri();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager recylerViewLayoutManager = new LinearLayoutManager(mContext);

        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerView.setAdapter(new SimpleStringRecyclerViewAdapter(recyclerView, wishlistImageUri));
    }

    public static class SimpleStringRecyclerViewAdapter
            extends RecyclerView.Adapter<WishlistActivity.SimpleStringRecyclerViewAdapter.ViewHolder> {

        private ArrayList<String> mWishlistImageUri;
        private RecyclerView mRecyclerView;

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final SimpleDraweeView mImageView;
            public final LinearLayout mLayoutItem;
            public final ImageView mImageViewWishlist;
            public ViewHolder(View view) {
                super(view);
                mView = view;
                mImageView = (SimpleDraweeView) view.findViewById(R.id.image_wishlist);
                mLayoutItem = (LinearLayout) view.findViewById(R.id.layout_item_desc);
                mImageViewWishlist = (ImageView) view.findViewById(R.id.ic_wishlist);
            }
        }

        public SimpleStringRecyclerViewAdapter(RecyclerView recyclerView, ArrayList<String> wishlistImageUri) {
            mWishlistImageUri = wishlistImageUri;
            mRecyclerView = recyclerView;
        }

        @Override
        public WishlistActivity.SimpleStringRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_wishlist_item, parent, false);
            return new WishlistActivity.SimpleStringRecyclerViewAdapter.ViewHolder(view);
        }

        @Override
        public void onViewRecycled(ViewHolder holder) {
            if (holder.mImageView.getController() != null) {
                holder.mImageView.getController().onDetach();
            }
            if (holder.mImageView.getTopLevelDrawable() != null) {
                holder.mImageView.getTopLevelDrawable().setCallback(null);
//                ((BitmapDrawable) holder.mImageView.getTopLevelDrawable()).getBitmap().recycle();
            }
        }

        @Override
        public void onBindViewHolder(final WishlistActivity.SimpleStringRecyclerViewAdapter.ViewHolder holder, final int position) {
            final Uri uri = Uri.parse(mWishlistImageUri.get(position));
            holder.mImageView.setImageURI(uri);
            holder.mLayoutItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, ItemDetailsActivity.class);
                    intent.putExtra(STRING_IMAGE_URI,mWishlistImageUri.get(position));
                    intent.putExtra(STRING_IMAGE_POSITION, position);
                    mContext.startActivity(intent);
                }
            });

            //Set click action for wishlist
            holder.mImageViewWishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                    imageUrlUtils.removeWishlistImageUri(position);
                    notifyDataSetChanged();
                }
            });
        }

        @Override
        public int getItemCount() {
            return mWishlistImageUri.size();
        }
    }
}
