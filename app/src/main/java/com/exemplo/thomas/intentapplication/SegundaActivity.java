package com.exemplo.thomas.intentapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.exemplo.thomas.intentapplication.R;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String show = extras.getString("OutPut");
            if (show != null) {
                TextView field = (TextView) findViewById(R.id.text);
                field.setText(show);
            }
        }

    }

    public void voltar(View view) {


        Intent intent = new Intent(this, PrimeiraActivity.class);
        startActivity(intent);


    }

}