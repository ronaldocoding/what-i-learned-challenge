package br.com.what_i_learned_challenge

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.what_i_learned_challenge.databinding.ItemWhatILearnedBinding

class ItemWhatILearnedAdapter(
    private val context: Context,
    private val whatILearnedList: List<ItemWhatILearned>
) : RecyclerView.Adapter<ItemWhatILearnedAdapter.ViewHolder>() {

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
        holder.bind(whatILearnedList[position])
    }

    override fun getItemCount(): Int = whatILearnedList.size

}