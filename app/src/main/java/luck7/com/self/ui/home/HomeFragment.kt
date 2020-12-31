/**
 * @author hong
 * @date  2020/12/29
 * */
package luck7.com.self.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import luck7.com.self.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val view = root.findViewById<View>(R.id.relativeLayout3)
        view.setOnClickListener{
            startActivity(Intent(this.activity, HomePlanViewActivity::class.java))
        }

        val view2 = root.findViewById<View>(R.id.relativeLayout4)
        view2.setOnClickListener{
            startActivity(Intent(this.activity, HomePlanViewActivity::class.java))
        }
        return root
    }
}