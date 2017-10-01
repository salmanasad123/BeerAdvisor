package com.example.salman.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {


    private BeerExpert expert = new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }


        public void onClickFindBeer(View view)
    {
        TextView Brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.spinner);

        String beerType =String.valueOf(color.getSelectedItem());

        List<String> brandsList=expert.getBrands(beerType);
        StringBuilder builder = new StringBuilder();

        for(String s:brandsList)
        {
            builder.append(s).append('\n');


        }
        Brands.setText(builder);




    }

}
