package com.law.sanghae;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;


import java.util.ArrayList;

/**
 * Created by k on 2016-02-11.
 */
public class AddListAdapter extends BaseAdapter {

    ArrayList<String> addList;

    public AddListAdapter(ArrayList<String> add){
        addList = add;

    }

    @Override
    public int getCount() {
        return addList.size();
    }

    @Override
    public Object getItem(int position) {
        return addList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final int pos = position;
        final Context context = parent.getContext();

        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_add_item, parent, false);

            viewHolder.layoutBack = (RelativeLayout) convertView.findViewById(R.id.layout_list_back_apart);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if(addList.get(pos).equals("list1")){
            viewHolder.layoutBack.setBackgroundResource(R.drawable.main_list_1);
        }
        else if(addList.get(pos).equals("list2")){
            viewHolder.layoutBack.setBackgroundResource(R.drawable.main_list_2);
        }

        viewHolder.layoutBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.samsungsales.co.kr/main/main.sesc"));
                context.startActivity(i);
//                Intent i = new Intent(v.getContext(), CaseDetailActivity.class);
////                i.putExtra("case_idx", addList.get(pos).getCase_idx());
//                context.startActivity(i);
            }
        });

            return convertView;
    }

    public class ViewHolder {
        RelativeLayout layoutBack;
    }
}
