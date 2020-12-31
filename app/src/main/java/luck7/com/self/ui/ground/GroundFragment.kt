/**
 * @author hong
 * @date  2020/12/29
 * */
package luck7.com.self.ui.ground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import luck7.com.self.R

class GroundFragment : Fragment(R.layout.fragment_ground)  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_ground, container, false)

        return root
    }
}