package br.com.fiap.movies
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.movies.databinding.ActivityTela2Binding


class Tela2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTela2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val valor = intent.getStringExtra("valor")
        val frase = "Para quem você deseja enviar R$${valor}?"

        binding.textValor.text = frase

        binding.btnContinuar.setOnClickListener {
            val chavePix = binding.inputChavePix.text.toString()
            val intent = Intent(this, Tela3Activity::class.java)
            intent.putExtra("valor", valor)
            intent.putExtra("chavePix", chavePix)
            startActivity(intent)
        }
    }
}
