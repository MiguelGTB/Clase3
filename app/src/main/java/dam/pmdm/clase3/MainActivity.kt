package dam.pmdm.clase3

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dam.pmdm.clase3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.xavierCardview.root.setOnClickListener { changeActivity("Xavier Foster") }
        binding.axelCardview.root.setOnClickListener { changeActivity("Axel Blaze") }
        binding.judeCardview.root.setOnClickListener { changeActivity("Jude Sharp") }
        binding.shawnCardview.root.setOnClickListener { changeActivity("Shawn Frost") }
    }
    private fun changeActivity(character: String) {
        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("character", character)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.contextual_menu, menu)
        return true
    }


}