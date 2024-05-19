package com.example.footballer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class FootballerAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Footballer> players;

    public FootballerAdapter(Context context, int layout, List<Footballer> players) {
        this.context = context;
        this.layout = layout;
        this.players = players;
    }


    @Override
    public int getCount() {
        return players.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView playerAva, playerFlag;
        TextView playerName, playerDes;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.playerName = convertView.findViewById(R.id.name);
            holder.playerDes = convertView.findViewById(R.id.des);
            holder.playerAva = convertView.findViewById(R.id.avatar);
            holder.playerFlag = convertView.findViewById(R.id.flag);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();

        }



        Footballer footballer = players.get(position);

        holder.playerName.setText(footballer.getName());
        holder.playerDes.setText(footballer.getDescription());
        holder.playerAva.setImageResource(footballer.getAvatar());
        holder.playerFlag.setImageResource(footballer.getNational());
        return convertView;
    }
}
