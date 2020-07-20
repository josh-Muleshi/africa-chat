package com.example.africachat

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import eightbitlab.com.blurview.RenderScriptBlur
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Slip", "Slip something here", R.drawable.img1))
        list.add(Model("Slip", "Slip something here", R.drawable.img2))
        list.add(Model("Slip", "Slip something here", R.drawable.img3))
        list.add(Model("Slip", "Slip something here", R.drawable.img4))
        list.add(Model("Slip", "Slip something here", R.drawable.img5))
        list.add(Model("Slip", "Slip something here", R.drawable.img6))

        listView.adapter = MyAddapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0){
                Toast.makeText(this@HomeActivity, "you clicked on slip 1", Toast.LENGTH_SHORT).show()
            }
            if (position == 1){
                Toast.makeText(this@HomeActivity, "you clicked on slip 2", Toast.LENGTH_SHORT).show()
            }
            if (position == 2){
                Toast.makeText(this@HomeActivity, "you clicked on slip 3", Toast.LENGTH_SHORT).show()
            }
            if (position == 3){
                Toast.makeText(this@HomeActivity, "you clicked on slip 4", Toast.LENGTH_SHORT).show()
            }
            if (position == 4){
                Toast.makeText(this@HomeActivity, "you clicked on slip 5", Toast.LENGTH_SHORT).show()
            }
            if (position == 5){
                Toast.makeText(this@HomeActivity, "you clicked on slip 5", Toast.LENGTH_SHORT).show()
            }
        }
    }
}