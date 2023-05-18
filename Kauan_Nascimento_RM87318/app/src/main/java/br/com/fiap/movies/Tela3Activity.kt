package br.com.fiap.movies
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.movies.databinding.ActivityTela3Binding


class Tela3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTela3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val valor = intent.getStringExtra("valor") ?: ""
        val chavePix = intent.getStringExtra("chavePix") ?: ""

        binding.textTransferindo.text = "Transferindo R$$valor"
        binding.textChavePix.text = "Chave pix: $chavePix"

        binding.btnConfirmarTransferencia.setOnClickListener {
            val intent = Intent(this, Tela4Activity::class.java)
            intent.putExtra("valor", valor)
            intent.putExtra("chavePix", chavePix)
            startActivity(intent)
        }

        binding.btnRevisarChavePix.setOnClickListener {
            onBackPressed()
        }
    }
}

