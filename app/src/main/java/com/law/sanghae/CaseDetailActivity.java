package com.law.sanghae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CaseDetailActivity extends Activity {


    Button btnBack;
    RelativeLayout layoutCom;
    TextView txtCom;
    TextView txtAdd;
    TextView txtKind;

    TextView txtAskLoad;
    ImageView imgStar1;
    ImageView imgStar2;
    ImageView imgStar3;
    ImageView imgStar4;
    ImageView imgStar5;
    TextView txtReview;

    RelativeLayout layoutTop;

    String com_idx;


//    TextView txtComId;
    RelativeLayout layoutBottom;
    Button btnPic;

    TextView txtAll;

    String case_idx;

    RelativeLayout layoutReview;

    String star;
    String content;
    String url;

    String theme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_detail);
        initView();

        Intent i = getIntent();
        theme = i.getStringExtra("case_idx");
        if(theme.equals("1")){
            layoutTop.setBackgroundResource(R.drawable.stamp_activ);
        } else if(theme.equals("2")){
            layoutTop.setBackgroundResource(R.drawable.bacord);
        } else{
            layoutTop.setBackgroundResource(R.drawable.map);
        }

    }
    public void initView() {
        layoutTop = (RelativeLayout) findViewById(R.id.layout_top);

    }



}
