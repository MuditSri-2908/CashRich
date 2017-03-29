package com.mudit.android.cashrichtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public List<ListItem> listItems = new ArrayList<>();
    public Custom_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_View);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Custom_Adapter(this);

        String name="HDFC", fund="ABC Mutual Fund",withdraw_amt="3500.00";
        ListItem listItem = new ListItem(name,fund,withdraw_amt);
        for(int i=0;i<15;i++){

            listItems.add(listItem);
        }

        adapter.setList(listItems);
        recyclerView.setAdapter(adapter);
    }
}
