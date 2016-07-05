package com.implicitexamplesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.ed);
        btn=(Button)findViewById(R.id.bt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri=et.getText().toString();

                Intent i=new Intent(Intent.ACTION_SEARCH);
                i.putExtra(SearchManager.QUERY,uri);
                if(i.resolveActivity(getPackageManager())!=null) {
                    startActivity(i);
                }
            }
        });
    }
}
