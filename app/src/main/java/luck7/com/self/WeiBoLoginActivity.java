package luck7.com.self;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


/**
 * Created by ASUS on 2020/12/28.
 */

public class WeiBoLoginActivity extends AppCompatActivity {

    private Button btnWeiBoClose;
    private Button btnWeiBoAdmit;

    private Toolbar weiBoToolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        weiBoToolBar = findViewById(R.id.weibo_toolbar);
        setSupportActionBar(weiBoToolBar);
        setContentView(R.layout.activity_weibo_login);
        btnWeiBoClose = (Button)findViewById(R.id.btn_weibo_close);
        btnWeiBoAdmit = (Button)findViewById(R.id.btn_weibo_admit);

        btnWeiBoClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnWeiBoAdmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(WeiBoLoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        SingleStatuBar statuBar = SingleStatuBar.getInstance();
        statuBar.setStatusBar(getWindow(), R.color.colorWhite);
    }

}
