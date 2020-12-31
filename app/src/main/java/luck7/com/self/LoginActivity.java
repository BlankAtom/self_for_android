package luck7.com.self;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by ASUS on 2020/12/27.
 */

public class LoginActivity extends AppCompatActivity {

    private Button btnWechatLogin;
    private Button btnQQLogin;
    private Button btnWeiBoLogin;
    private Button btnPNLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        btnWechatLogin = (Button) findViewById(R.id.btn_wechat);
        btnQQLogin = (Button) findViewById(R.id.btn_qq);
        btnWeiBoLogin = (Button) findViewById(R.id.btn_weibo);
        btnPNLogin = (Button)findViewById(R.id.btn_login);

        btnWechatLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(LoginActivity.this, WeChatLoginActivity.class);
                startActivity(intent);
            }
        });

        btnQQLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(LoginActivity.this, QQLoginActivity.class);
                startActivity(intent);
            }
        });

        btnWeiBoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(LoginActivity.this, WeiBoLoginActivity.class);
                startActivity(intent);
            }
        });

        btnPNLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(LoginActivity.this, PNLoginActivity.class);
                startActivity(intent);
            }
        });

        SingleStatuBar statuBar = SingleStatuBar.getInstance();
        statuBar.setStatusBar(getWindow(), R.color.colorBack);

    }
}