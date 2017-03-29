package com.mudit.android.cashrichtask;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageLogo;
    public ImageView currency;
    public TextView name;
    public TextView fund;
    public TextView current;
    public TextView currentValue;
    public TextView withdrawal;
    public SwitchCompat aSwitch;

    public ListViewHolder(View itemView){
        super(itemView);
        imageLogo = (ImageView)itemView.findViewById(R.id.imageLogo);
        currency = (ImageView)itemView.findViewById(R.id.currency);
        name=(TextView) itemView.findViewById(R.id.name);
        fund=(TextView) itemView.findViewById(R.id.fund);
        current=(TextView) itemView.findViewById(R.id.current);
        currentValue=(TextView) itemView.findViewById(R.id.currentValue);
        withdrawal=(TextView) itemView.findViewById(R.id.withdrawal);
        aSwitch=(SwitchCompat) itemView.findViewById(R.id.switch1);
    }
}
