package luck7.com.self.ui.me

import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import luck7.com.self.R

/**
 *   @Auther: 罗庆宏
 *   @Date: 2020/12/31/14:05
 *   @Description:
 */
class MeAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_me_add)

        val btn_back = findViewById<Button>(R.id.me_add_back)
        btn_back.setOnClickListener{
            finish()
        }

        val btn_save = findViewById<Button>(R.id.me_add_save)
        btn_back.setOnClickListener{
            finish()
        }
    }
}