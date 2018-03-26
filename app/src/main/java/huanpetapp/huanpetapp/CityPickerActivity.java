package huanpetapp.huanpetapp;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import huanpetapp.huanpetapp.fragment.NearbyFragment;
import huanpetapp.huanpetapp.fragment.ScreenFragment;
import huanpetapp.huanpetapp.fragment.TypeFragment;

public class CityPickerActivity extends AppCompatActivity {

    private RadioButton radio_Nearby;
    private RadioButton radio_Type;
    private RadioButton radio_Screen;
    private RadioGroup radio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_picker);
        initView();
        initData();

    }

    private void initData() {

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.radio_Nearby:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new NearbyFragment()).commit();
                        break;
                    case R.id.radio_Type:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new TypeFragment()).commit();
                        break;
                    case R.id.radio_Screen:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ScreenFragment()).commit();
                        break;
                }
            }
        });

    }

    private void initView() {
        radio_Nearby = (RadioButton) findViewById(R.id.radio_Nearby);
        radio_Type = (RadioButton) findViewById(R.id.radio_Type);
        radio_Screen = (RadioButton) findViewById(R.id.radio_Screen);
        radio = (RadioGroup) findViewById(R.id.radio);
    }
}
