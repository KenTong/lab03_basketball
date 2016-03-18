package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.opro.ken.lab03_basketball.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class twins extends Fragment {



    private TextView tv4;
    private TextView tv2;
    public twins() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_twins, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        tv2=(TextView)getView().findViewById(R.id.tv2);
        tv4=(TextView)getView().findViewById(R.id.tv4);
    }
}
