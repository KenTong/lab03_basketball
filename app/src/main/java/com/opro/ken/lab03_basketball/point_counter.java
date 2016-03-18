package com.opro.ken.lab03_basketball;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class point_counter extends Fragment {


    public point_counter() {
        // Required empty public constructor
    }
private TextView tv3;
    private TextView tv1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_point_counter2, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

tv3=(TextView)getView().findViewById(R.id.tv3);
        tv1=(TextView)getView().findViewById(R.id.tv1);
    }
}
