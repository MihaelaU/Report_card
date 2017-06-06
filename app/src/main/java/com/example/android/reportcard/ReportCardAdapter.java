package com.example.android.reportcard;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ursum on 05/06/2017.
 */

public class ReportCardAdapter extends ArrayAdapter<RecordCard> {
    Context context;
    int id;
    RecordCard listDetails[] = null;

    public ReportCardAdapter(Context context, int id, RecordCard[] lists ) {
        super(context, id, lists);
        this.id = id;
        this.context = context;
        this.listDetails = lists;
    }

    static class ReportCardDetails
    {
        ImageView subIcon;
        TextView subName;
        TextView subGrade;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list = convertView;
        ReportCardDetails reportCardBox = null;

        if(list == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            list = inflater.inflate(id, parent, false);

            reportCardBox = new ReportCardDetails();
            reportCardBox.subIcon = (ImageView)list.findViewById(R.id.image);
            reportCardBox.subName = (TextView)list.findViewById(R.id.name);
            reportCardBox.subGrade = (TextView)list.findViewById(R.id.grade);

            list.setTag(reportCardBox);
        }
        else
        {
            reportCardBox = (ReportCardDetails)list.getTag();
        }

        RecordCard Card = listDetails[position];

        reportCardBox.subName.setText(Card.getStudentName());
        reportCardBox.subIcon.setImageResource(Card.getStudentPhoto());
        reportCardBox.subGrade.setText(Card.getGrade());

        return list;
    }


}
//test upload