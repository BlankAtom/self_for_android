/**
 * @author hong
 * @date  2020/12/29
 * */

package luck7.com.self.ui.home

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import luck7.com.self.R
import luck7.com.self.ui.plan.PlanAdapter

class HomePlanViewActivity : AppCompatActivity() {
    private lateinit var homePlanViewModel: HomePlanViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_now_plan)

        homePlanViewModel = ViewModelProviders.of(this).get(HomePlanViewModel::class.java)

        val rvView = findViewById<RecyclerView>(R.id.home_now_plan_view)
        val adapter = PlanAdapter(this, homePlanViewModel.plans)

        rvView.layoutManager = LinearLayoutManager(this )
        rvView.adapter = adapter

        val button = findViewById<Button>(R.id.home_btn_back_to_home)
        button.setOnClickListener{
//            startActivity(Intent(this, HomeFragment::class.java))
            finish()
        }

    }
}