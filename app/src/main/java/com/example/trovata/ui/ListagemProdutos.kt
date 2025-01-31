package com.example.trovata.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trovata.R
import com.example.trovata.databinding.ActivityListagemProdutosBinding

class ListagemProdutos : AppCompatActivity() {

    private lateinit var binding: ActivityListagemProdutosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListagemProdutosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura o botão de voltar
        binding.buttonVoltar.setOnClickListener {
         startActivity(Intent(this, MainActivity::class.java))
        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}