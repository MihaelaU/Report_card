package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class ReportCardView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card_view);

        RecordCard data[] = new RecordCard[]
                {
                        new RecordCard(R.drawable.avatar1, "French", "A"),
                        new RecordCard(R.drawable.avatar2, "Romanian", "A+"),
                        new RecordCard(R.drawable.avatar1, "English", "A"),
                        new RecordCard(R.drawable.avatar2, "German", "B"),
                        new RecordCard(R.drawable.avatar1, "Chinese", "B"),
                        new RecordCard(R.drawable.avatar2, "Japanese", "C")
                };

        ReportCardAdapter adapter = new ReportCardAdapter(this,
                R.layout.list_view_report_card, data);

        ListView listView1 = (ListView) findViewById(R.id.CardView);
        listView1.setAdapter(adapter);
        listView1.setTextFilterEnabled(true);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}


//test upload