package br.com.what_i_learned_challenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getColor
import br.com.what_i_learned_challenge.databinding.ActivityWhatILearnedBinding

class WhatILearnedActivity : AppCompatActivity() {

    private val items = ItemWhatILearnedDAO()
    private val adapter = ItemWhatILearnedAdapter(this, items.returnAll())
    private val binding by lazy {
        ActivityWhatILearnedBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        addItems()
        setUpRecyclerView()
    }

    override fun onResume() {
        super.onResume()
        adapter.update(items.returnAll())
    }


    private fun addItems() {
        items.addItems(
            listOf(
                ItemWhatILearned(
                    title = "Kotlin - Null safety",
                    content = "O sistema de tipos de Kotlin visa eliminar o perigo de referências nulas do código.",
                    icon = R.drawable.ic_cold_face,
                    color = getColor(this, R.color.red)
                ),
                ItemWhatILearned(
                    title = "Layout editor",
                    content = "O Design Editor exibe o layout em vários dispositivos e versões do Android. É possível criar e editar um layout usando apenas componentes visuais.",
                    icon = R.drawable.ic_smiling_face_with_sunglasses,
                    color = getColor(this, R.color.yellow)
                ),
                ItemWhatILearned(
                    title = "Git",
                    content = "É um sistema de controle de versão distribuído. Com ele é possível rastrear mudanças no código-fonte durante o desenvolvimento de software.",
                    icon = R.drawable.ic_smiling_face_with_sunglasses,
                    color = getColor(this, R.color.yellow)
                ),
                ItemWhatILearned(
                    title = "GroupView",
                    content = "É uma view especial que pode conter outras views (chamadas de filhos). É a classe base para layouts e contêineres de views.",
                    icon = R.drawable.ic_nerd_face,
                    color = getColor(this, R.color.green)
                ),
                ItemWhatILearned(
                    title = "Kotlin - Null safety",
                    content = "O sistema de tipos de Kotlin visa eliminar o perigo de referências nulas do código.",
                    icon = R.drawable.ic_cold_face,
                    color = getColor(this, R.color.red)
                ),
                ItemWhatILearned(
                    title = "Layout editor",
                    content = "O Design Editor exibe o layout em vários dispositivos e versões do Android. É possível criar e editar um layout usando apenas componentes visuais.",
                    icon = R.drawable.ic_smiling_face_with_sunglasses,
                    color = getColor(this, R.color.yellow)
                ),
                ItemWhatILearned(
                    title = "Git",
                    content = "É um sistema de controle de versão distribuído. Com ele é possível rastrear mudanças no código-fonte durante o desenvolvimento de software.",
                    icon = R.drawable.ic_smiling_face_with_sunglasses,
                    color = getColor(this, R.color.yellow)
                ),
                ItemWhatILearned(
                    title = "GroupView",
                    content = "É uma view especial que pode conter outras views (chamadas de filhos). É a classe base para layouts e contêineres de views.",
                    icon = R.drawable.ic_nerd_face,
                    color = getColor(this, R.color.green)
                ),
                ItemWhatILearned(
                    title = "Gitlab",
                    content = "É um gerenciador de repositório de software baseado em git, com suporte a Wiki, gerenciamento de tarefas e CI/CD.",
                    icon = R.drawable.ic_smiling_face_with_sunglasses,
                    color = getColor(this, R.color.yellow)
                ),
                ItemWhatILearned(
                    title = "Amplitude",
                    content = "É uma plataforma de análise de produtos que auxilia as empresas a monitorar os usuários do seu software com a ajuda de analíticas colaborativas",
                    icon = R.drawable.ic_cold_face,
                    color = getColor(this, R.color.red)
                )
            )
        )
    }

    private fun setUpRecyclerView() {
        val recyclerView = binding.whatILearnedRecyclerView
        recyclerView.adapter = adapter
    }

}
