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

public class WeChatLoginActivity extends AppCompatActivity {

    private Button btnWechatClose;
    private Button btnWechatAdmit;
    private Button btnWechatRefuse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_wechat_login);

        btnWechatClose = (Button)findViewById(R.id.btn_wechat_close);
        btnWechatAdmit = (Button)findViewById(R.id.btn_wechat_admit);
        btnWechatRefuse = (Button)findViewById(R.id.btn_wechat_refuse);

        btnWechatClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnWechatAdmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(WeChatLoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnWechatRefuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        SingleStatuBar statuBar = SingleStatuBar.getInstance();
        statuBar.setStatusBar(getWindow(), R.color.colorWhite);

    }
}
