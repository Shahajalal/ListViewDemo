package com.example.shahajalalsamrat.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DesignActivity extends AppCompatActivity {

    private ImageView image;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        image=findViewById(R.id.imageid);
        text=findViewById(R.id.textidindesign);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String s=bundle.getString("key");
            showdetails(s);
        }
    }

   void showdetails(String s){
        if(s.equals("bangladesh")){
            image.setImageResource(R.drawable.bangladeshpicc);
            text.setText(R.string.bangladesh);
        } if(s.equals("india")){
            image.setImageResource(R.drawable.indiapicc);
            text.setText(R.string.india);
        } if(s.equals("pakistan")){
            image.setImageResource(R.drawable.pakistanpicc);
            text.setText(R.string.pakistan);
        }
   }
}
