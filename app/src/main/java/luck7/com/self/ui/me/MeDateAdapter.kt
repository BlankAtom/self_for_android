/**
 * @author hong
 * @date  2020/12/29
 * */
package luck7.com.self.ui.me

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import luck7.com.self.R

class MeDateAdapter(
    var context: Context?,
    var list: ArrayList<MeDateItem>,
)  : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.me_date_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = holder as ViewHolder
        item.bindHolder(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val wDay: TextView = itemView.findViewById(R.id.me_week_name)
        val day: TextView = itemView.findViewById(R.id.me_day_num)

        fun bindHolder(item: MeDateItem){
            wDay.text = item.weekday
            day.text = item.day
        }
    }


}