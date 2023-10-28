import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class Adapter(private var context: Context, var items: List<Item>) :
    RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_user, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameView.setText(items[position].burgerName)
        holder.priceView.setText(items[position].price)
        holder.imageView.setImageResource(items[position].image)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
