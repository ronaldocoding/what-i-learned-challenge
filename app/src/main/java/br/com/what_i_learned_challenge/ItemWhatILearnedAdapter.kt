package br.com.what_i_learned_challenge

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.what_i_learned_challenge.databinding.ItemWhatILearnedBinding

class ItemWhatILearnedAdapter(
    private val context: Context,
    whatILearnedList: List<ItemWhatILearned>
) : RecyclerView.Adapter<ItemWhatILearnedAdapter.ViewHolder>() {

    private val items = whatILearnedList.toMutableList()

    class ViewHolder(binding: ItemWhatILearnedBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val title = binding.whatILearnedItemTitle
        private val content = binding.whatILearnedItemContent
        private val icon = binding.whatILearnedIcon
        private val faceFrameLayout = binding.faceFrameLayout

        fun bind(whatILearnedItem: ItemWhatILearned) {
            title.text = whatILearnedItem.title
            content.text = whatILearnedItem.content
            icon.setImageResource(whatILearnedItem.icon)
            faceFrameLayout.setBackgroundColor(whatILearnedItem.color)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemWhatILearnedBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun update(items: List<ItemWhatILearned>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

}