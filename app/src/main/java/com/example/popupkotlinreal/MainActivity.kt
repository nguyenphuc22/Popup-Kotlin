package com.example.popupkotlinreal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(btnPopup)

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu_item,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.item_1 -> Toast.makeText(this,"Item 1", Toast.LENGTH_SHORT).show()
            R.id.item_2 -> Toast.makeText(this,"Item 2", Toast.LENGTH_SHORT).show()
            R.id.item_3 -> Toast.makeText(this,"Item 3", Toast.LENGTH_SHORT).show()
            R.id.item_4 -> Toast.makeText(this,"Item 4", Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }

}