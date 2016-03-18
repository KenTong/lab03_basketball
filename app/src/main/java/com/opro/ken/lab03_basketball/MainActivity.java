package com.opro.ken.lab03_basketball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int atotal = 0;
    int btotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void athreePoint(View view) {
        atotal += 3;
        asetTotal();
    }
    public void atwoPoint(View view) {
        atotal += 2;
        asetTotal();
    }
    public void aonePoint(View view) {
        ++atotal;
        asetTotal();
    }

    public void bthreePoint(View view) {
        btotal += 3;
        bsetTotal();
    }
    public void btwoPoint(View view) {
        btotal += 2;
        bsetTotal();
    }
    public void bonePoint(View view) {
        ++btotal;
        bsetTotal();
    }

    public void reset(View view) {
        atotal=0;
        btotal=0;
        asetTotal();
        bsetTotal();
    }

    private void asetTotal() {
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(String.valueOf(atotal));
    }
    private void bsetTotal() {
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText(String.valueOf(btotal));
    }

    public void Point(View view){

        switch (view.getId()){
            case R.id.b1:
                athreePoint(view);
            break;
            case R.id.b2:
                atwoPoint(view);
                break;
            case R.id.b3:
                aonePoint(view);
                break;
            case R.id.b4:
                bthreePoint(view);
                break;
            case R.id.b5:
                btwoPoint(view);
                break;
            case R.id.b6:
                bonePoint(view);
                break;
            case R.id.b7:
                reset(view);
                break;
        }


    }

}