package luck7.com.self;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ASUS on 2020/12/27.
 */

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);

        SingleStatuBar statuBar = SingleStatuBar.getInstance();
        statuBar.setStatusBar(getWindow(), R.color.colorWhite);

        TimerTask delayTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = null;
                intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(delayTask,3000);//延时
    }
}
