/**
 * @author hong
 * @date  2020/12/29
 * */
package luck7.com.self.ui.home

import androidx.lifecycle.ViewModel
import luck7.com.self.ui.plan.PlanItem

class HomePlanViewModel : ViewModel() {
    var plans: ArrayList<PlanItem> = ArrayList()

    init {
        plans.add(PlanItem("New"))
        plans.add(PlanItem("New"))
        plans.add(PlanItem("New"))
    }
}