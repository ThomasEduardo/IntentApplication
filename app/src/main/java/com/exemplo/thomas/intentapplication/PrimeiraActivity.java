package com.exemplo.thomas.intentapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

public class PrimeiraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public void repetir(View v) {
        EditText field = (EditText) findViewById(R.id.field);
        Log.i("intentapplication3", field.getText().toString());
        Toast.makeText(this,"OutPut:  " + field.getText(), Toast.LENGTH_SHORT).show();

    }
    public void mudar(View v){
        EditText field = (EditText) findViewById(R.id.field);

        Intent i = new Intent();
        i.setClass(this, SegundaActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("OutPut", field.getText().toString());
        i.putExtras(bundle);

        startActivity(i);


    }
}