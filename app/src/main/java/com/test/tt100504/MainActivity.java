package com.test.tt100504;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner sp, sp2;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.spinner);
        sp2 = (Spinner) findViewById(R.id.spinner2);
        tv2 = (TextView) findViewById(R.id.textView2);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // TextView tv = (TextView) view;
                // tv2.setText(tv.getText().toString() + ":" + position);
                String[] f = getResources().getStringArray(R.array.fruits);
                tv2.setText(f[position]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        String cities[] = {"台北","台中","高雄","台南"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                                                android.R.layout.simple_list_item_1,
                                                cities);
        sp2.setAdapter(adapter);

    }
}
