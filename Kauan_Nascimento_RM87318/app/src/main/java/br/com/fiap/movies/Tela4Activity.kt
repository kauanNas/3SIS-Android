package br.com.fiap.movies
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.movies.databinding.ActivityTela4Binding

class Tela4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTela4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val valor = intent.getStringExtra("valor") ?: ""
        val chavePix = intent.getStringExtra("chavePix") ?: ""

        val mensagem = "R$$valor enviados para a chave pix $chavePix"
        binding.textView.text = mensagem
    }
}



