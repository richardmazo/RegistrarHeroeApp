package com.mazo.richard.registratuheroe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();

        Superheroe ironMan = extras.getParcelable(MainActivity.SUPER_HERO_KEY);

        TextView heroData = (TextView) findViewById(R.id.hero_data);
        if (ironMan!=null){
            heroData.setText(ironMan.getName() + ", "+ ironMan.getLastName() + ", " + ironMan.getHeroName() +
                    ", " + ironMan.getAge() + ", " + ironMan.getAddress() + ", " + ironMan.getCity());
        }

    }
}
