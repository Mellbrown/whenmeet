package com.g2utools.whenmeet.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.g2utools.whenmeet.R;
import com.g2utools.whenmeet.model.PeopleItemData;
import com.makeramen.roundedimageview.RoundedImageView;

/**
 * Created by mlyg2 on 2018-02-11.
 */

public class PeopleSelectableViewHolder extends RecyclerView.ViewHolder{

    public View itemView;
    public RoundedImageView thumbnail;
    public TextView nickname;
    public TextView email;
    public CheckBox selected;

    public PeopleSelectableViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        thumbnail = itemView.findViewById(R.id.thumnail);
        nickname = itemView.findViewById(R.id.nickname);
        selected = itemView.findViewById(R.id.selected);
        email = itemView.findViewById(R.id.email);
    }

    public void dataBind(PeopleItemData data, boolean selected){
        nickname.setText(data.nickname);
        email.setText(data.email);
//        if (data.getThumbnail() != null) {
//            thumbnail.setImageBitmap(data.getThumbnail());
//        }else{
//            thumbnail.setImageResource(R.drawable.ic_person_black_24dp);
//        }
        data.setThumbnail(itemView.getContext(),thumbnail);
        this.selected.setChecked(selected);
    }
}
