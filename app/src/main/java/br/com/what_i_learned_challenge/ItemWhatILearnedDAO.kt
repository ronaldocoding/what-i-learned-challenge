package br.com.what_i_learned_challenge

class ItemWhatILearnedDAO {

    fun addItems(items: List<ItemWhatILearned>) {
        whatILearnedList.addAll(items)
    }

    fun returnAll(): List<ItemWhatILearned> = whatILearnedList.toList()

    companion object {
        private var whatILearnedList = mutableListOf<ItemWhatILearned>()
    }

}