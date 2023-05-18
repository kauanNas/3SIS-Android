package br.com.fiap.movies
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.movies.databinding.ActivityTela1Binding

class Tela1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTela1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnContinuar.setOnClickListener {
            val inputValor = binding.inputValor.text.toString()
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("valor", inputValor)
            startActivity(intent)
        }
    }
}
