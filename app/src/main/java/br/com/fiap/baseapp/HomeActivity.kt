package br.com.fiap.baseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import br.com.fiap.baseapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val actionBar: ActionBar? = getSupportActionBar()
        if (actionBar != null)
            actionBar.setTitle("Home")

        val username = intent.getStringExtra("username")

        binding.tvUsername.text = username
    }

    fun sair(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun irContatos(view: View) {
        val intent = Intent(this, ContatosActivity::class.java)
        startActivity(intent)
    }

    fun irEstados(view: View) {
        val intent = Intent(this, EstadosActivity::class.java)
        startActivity(intent)
    }

}