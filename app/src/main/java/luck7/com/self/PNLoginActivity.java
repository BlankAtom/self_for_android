package luck7.com.self;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by ASUS on 2020/12/28.
 */

public class PNLoginActivity extends AppCompatActivity {
    private Spinner countryNumberSpinner = null;
    ArrayAdapter<String> countryNumberAdapter = null;
    private int countryNumberPosition = 0;


    //省级选项值
    private String[] countryNumber = new String[]{"+86", "+1", "+852", "+81", "+886"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.pn_login);

        setSpinner();
    }


    /*
     * 设置下拉框
     */
    private void setSpinner() {
        countryNumberSpinner = (Spinner) findViewById(R.id.spin_country_number);

        countryNumberAdapter = new ArrayAdapter<String>(PNLoginActivity.this,
                android.R.layout.simple_spinner_item, countryNumber);
        countryNumberSpinner.setAdapter(countryNumberAdapter);
        countryNumberSpinner.setSelection(0, true);

        countryNumberSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            // 表示选项被改变的时候触发此方法，主要实现办法：动态改变地级适配器的绑定值
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                String s = countryNumber[position];
                countryNumberAdapter = new ArrayAdapter<String>(PNLoginActivity.this,
                        android.R.layout.simple_spinner_item, countryNumber);
                countryNumberSpinner.setAdapter(countryNumberAdapter);
                countryNumberSpinner.setSelection(position, true);
                countryNumberPosition = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });


    }
}
