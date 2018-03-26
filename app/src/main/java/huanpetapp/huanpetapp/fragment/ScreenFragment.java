package huanpetapp.huanpetapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import huanpetapp.huanpetapp.CityScreeningActivity;
import huanpetapp.huanpetapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScreenFragment extends Fragment implements View.OnClickListener {


    private TextView but;
    private ImageView select;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_screen, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        but = (TextView) view.findViewById(R.id.but);
        select = (ImageView) view.findViewById(R.id.select);

        but.setOnClickListener(this);
        select.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:

                break;
            case R.id.select:
                Intent intent = new Intent(getActivity(), CityScreeningActivity.class);
                getActivity().startActivity(intent);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
    }
}
