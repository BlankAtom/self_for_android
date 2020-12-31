package luck7.com.self;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by ASUS on 2020/12/28.
 */

public class QQLoginActivity extends AppCompatActivity {

    private Button btnQQClose;
    private Button btnQQAdmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_qq_login);

        btnQQClose = (Button)findViewById(R.id.btn_qq_close);
        btnQQAdmit = (Button)findViewById(R.id.btn_qq_admit);

        btnQQClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnQQAdmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(QQLoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        SingleStatuBar statuBar = SingleStatuBar.getInstance();
        statuBar.setStatusBar(getWindow(), R.color.colorWhite);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
