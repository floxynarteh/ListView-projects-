package com.example.korkor.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] Food = {"Yam","Beans","Rice","Jollof","Apem","Kokonte","Millet","Cocoyam","Fufu","Gari",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView)findViewById(R.id.listView_item);

        CustomAdapter customAdapter = new CustomAdapter();
        list.setAdapter(customAdapter);
    }


    class CustomAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return Food.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customview,null);

            TextView textView_food =(TextView)view.findViewById(R.id.food_list);

            textView_food.setText(Food[position]);


            return view;
        }
    }


}
