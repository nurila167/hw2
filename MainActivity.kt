package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val items: MutableList<Item> = ArrayList()
        items.add(Item("Cheese burger", "2 500 tg", R.drawable.cheese_burger))
        items.add(Item("Beef_hamburger", "1 800 tg", R.drawable.beef_hamburger))
        items.add(Item("Chicken burger", "2 200 tg", R.drawable.chicken_hamburger))
        items.add(Item("Nuggets burger", "2 000 tg", R.drawable.nuggets_burger))
        items.add(Item("Nuggets burger", "2 400 tg", R.drawable.whooper_junior))
        items.add(Item("Hrust burger beef", "2 300 tg", R.drawable.hrust_burger_beef))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(applicationContext, items)

    }


}
