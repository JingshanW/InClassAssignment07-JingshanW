package com.example.android.inclassassignment07_jingshanw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference titleRef = database.getReference("title");
    private DatabaseReference carRef = database.getReference("car");

    private TextView title;
    private TextView brand;
    private TextView price;
    private CheckBox suv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title= (TextView) findViewById(R.id.title_text_view);
        brand= (TextView) findViewById(R.id.brand_text_view);
        price= (TextView) findViewById(R.id.price_text_view);
        suv= (CheckBox) findViewById(R.id.suv_checkbox);
    }


    public void setTitle(View view) {
        titleRef.setValue(title.getText().toString());
    }

    public void addCar(View view)
    {
        String n=brand.getText().toString();
        int p=Integer.parseInt(price.getText().toString());
        boolean s=((CheckBox) findViewById(R.id.suv_checkbox)).isChecked();
        carRef.push().setValue(new Car(n,p,s));
    }
}
