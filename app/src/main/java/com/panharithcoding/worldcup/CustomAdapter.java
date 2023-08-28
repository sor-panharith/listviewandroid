package com.panharithcoding.worldcup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountryModel> {
    private ArrayList<CountryModel> countryArrayList;
    Context context;
    public CustomAdapter(ArrayList<CountryModel>data, Context context )
    {
        super(context, R.layout.item_list_layout, data);
        this.countryArrayList = data;
        this.context = context;
    }

    // view lookup Cache
    private static class ViewHolder{
        TextView txtCountry;
        TextView txtCupWin;
        ImageView flagImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      // get the data item for this position
        CountryModel dataModel = getItem(position);

        //check if an existing view is being reused , otherwise inflate the view
        ViewHolder viewHolder;
        final View result;
        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );
            viewHolder.txtCountry = (TextView) convertView.findViewById(R.id.country_name);
            viewHolder.txtCupWin = (TextView) convertView.findViewById(R.id.worldCup_win);
            viewHolder.flagImg = (ImageView) convertView.findViewById(R.id.imageView);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        //get data from the model class
        viewHolder.txtCountry.setText(dataModel.getCountry_name());
        viewHolder.txtCupWin.setText(dataModel.getWorldCup_win());
        viewHolder.flagImg.setImageResource(dataModel.getFlag_img());


        return convertView;

    }
}
