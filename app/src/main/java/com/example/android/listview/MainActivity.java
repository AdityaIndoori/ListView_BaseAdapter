package com.example.android.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] t1={"Hyundai i20","BMW M3","Volkswagen Golf "};
    String[] d1={"Manual | Diesel","Automatic | Petrol","Manual | Petrol"};
    int[] i1 ={R.drawable.i20,R.drawable.bmw,R.drawable.volkswagen};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(new customList(t1,d1,i1));

    }

    class customList extends BaseAdapter{

        String[] Title, Detail;
        int[] imge;

        customList() {
            Title = null;
            Detail = null;
            imge=null;
        }


        public customList(String[] text, String[] text1,int[] images) {
            Title = text;
            Detail = text1;
            imge = images;

        }


        @Override
        public int getCount() {
            return Title.length;
        }



        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.list_item, parent , false);

            TextView title, detail;
            ImageView i1;
            title = (TextView) row.findViewById(R.id.text);
            detail = (TextView) row.findViewById(R.id.subText);
            i1=(ImageView)row.findViewById(R.id.imageView);
            title.setText(Title[position]);
            detail.setText(Detail[position]);
            i1.setImageResource(imge[position]);

            return (row);
        }

    }
}