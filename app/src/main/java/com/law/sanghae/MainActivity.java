package com.law.sanghae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnMainMenu;
    AddListAdapter adapter;
    ListView listView;

    ImageView img1;
    ImageView img2;
    ImageView img3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        //
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("list1");
        arrayList.add("list2");
        //
        listView = (ListView) findViewById(R.id.list);
        adapter = new AddListAdapter(arrayList);
        listView.setAdapter(adapter);
    }

    public void initView() {
        btnMainMenu = (Button) findViewById(R.id.btn_main);
        btnMainMenu.setOnClickListener(this);

        img1 = (ImageView) findViewById(R.id.img_stamp);
        img1.setOnClickListener(this);
        img2 = (ImageView) findViewById(R.id.img_point);
        img2.setOnClickListener(this);
        img3 = (ImageView) findViewById(R.id.img_search);
        img3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main:
                Toast.makeText(getApplicationContext(), "안녕상하이!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img_stamp:
                Toast.makeText(getApplicationContext(), "안녕상하이!!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext(), CaseDetailActivity.class);
                i.putExtra("case_idx", "1");
                startActivity(i);
                break;
            case R.id.img_point:
                Toast.makeText(getApplicationContext(), "안녕상하이!!", Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(v.getContext(), CaseDetailActivity.class);
                i2.putExtra("case_idx", "2");
                startActivity(i2);
                break;
            case R.id.img_search:
                Toast.makeText(getApplicationContext(), "안녕상하이!!", Toast.LENGTH_SHORT).show();
                Intent i3 = new Intent(v.getContext(), CaseDetailActivity.class);
                i3.putExtra("case_idx", "3");
                startActivity(i3);
                break;

        }
    }
}
