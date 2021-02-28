package landavazo.maria.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnColdDrinks: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHotDrinks: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweets: Button = findViewById(R.id.button_sweeties) as Button
        var btnSalties: Button = findViewById(R.id.button_salties) as Button

        btnColdDrinks.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        btnHotDrinks.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity_hotDrinks::class.java)
            startActivity(intent)
        }

        btnSweets.setOnClickListener{
            var intent: Intent = Intent(this,ProductosActivity_sweets::class.java)
            startActivity(intent)
        }
        btnSalties.setOnClickListener{
            var intent: Intent =Intent(this, ProductosActivity_salties::class.java)
            startActivity(intent)
        }

    }
}