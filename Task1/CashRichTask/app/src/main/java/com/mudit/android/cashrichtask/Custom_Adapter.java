package com.mudit.android.cashrichtask;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;


public class Custom_Adapter extends RecyclerView.Adapter<ListViewHolder> {
    private List<ListItem> mList;
    private LayoutInflater mInflater;

    public Custom_Adapter(Context context)
    {

        this.mInflater = LayoutInflater.from(context);
        this.mList = new ArrayList<>();
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = mInflater.inflate(R.layout.list_item, parent, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position)
    {
        ListItem listItem = mList.get(position);
        holder.name.setText(listItem.getName());
        holder.fund.setText(listItem.getFund());
        holder.currentValue.setText(listItem.getCurrentValue());
        holder.imageLogo.setImageResource(R.drawable.hdfc);

    }

    @Override
    public int getItemCount()
    {
        return (mList == null) ? 0 : mList.size();
    }

    public void setList(List<ListItem> listItems)
    {
        this.mList.clear();
        if(listItems!=null)
            this.mList.addAll(listItems);

        notifyDataSetChanged();
    }
}
