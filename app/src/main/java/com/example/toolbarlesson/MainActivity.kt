package com.example.toolbarlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.toolbarlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.star -> {
                    Toast.makeText(this, "Star", Toast.LENGTH_SHORT).show()
                }
                R.id.camera -> {
                    Toast.makeText(this, "Camera", Toast.LENGTH_SHORT).show()
                }
                R.id.money -> {
                    Toast.makeText(this, "Money", Toast.LENGTH_SHORT).show()
                }
                R.id.restart -> {
                    Toast.makeText(this, "Restart", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Menu"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> finish()
            R.id.sync -> {
                Toast.makeText(this, "Sync", Toast.LENGTH_SHORT).show()
            }
            R.id.save -> {
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            }
            R.id.del -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
            }
            R.id.search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }

}