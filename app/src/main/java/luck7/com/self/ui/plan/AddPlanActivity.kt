/*
 * Create by Hong in 2020/12/29
 */

package luck7.com.self.ui.plan

import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import luck7.com.self.R

class AddPlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_add_plan)

//        setFeatureDrawableResource(Window.FEATURE_CUSTOM_TITLE, R.layout.title_add_plan)
//        window.setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_add_plan)

        val button = findViewById<Button>(R.id.add_task_back)
        button.setOnClickListener{
            //startActivity(Intent(this, PlanFragment::class.java))
            finish()
        }

        val submit = findViewById<Button>(R.id.plan_btn_add_submit)
        button.setOnClickListener{
            finish()
        }
    }

}