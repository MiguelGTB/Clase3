package dam.pmdm.clase3

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dam.pmdm.clase3.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mensaje = intent.getStringExtra("character").toString()
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

        when (mensaje) {
            "Axel Blaze" -> {
                binding.imageview.setImageResource(R.drawable.axel_29)
                binding.titleTextView.text = "Axel Blaze"
            }
            "Xavier Foster" -> {
                binding.imageview.setImageResource(R.drawable.xavier)
                binding.titleTextView.text = "Xavier Foster"
            }
            "Jude Sharp" -> {
                binding.imageview.setImageResource(R.drawable.jude_sharp)
                binding.titleTextView.text = "Jude Sharp"
            }
            "Shawn Frost" -> {
                binding.imageview.setImageResource(R.drawable.shawn_frost)
                binding.titleTextView.text = "Shawn Frost"
            }

        }
    }

}