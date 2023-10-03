package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource

class DogCardAdapter(val context: Context,val layout:Int):RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>(){
    private val listDogs = DataSource.getData()
    class DogCardViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.image)
        val name = itemView.findViewById<TextView>(R.id.txtName)
        val age = itemView.findViewById<TextView>(R.id.txtAge)
        val hobbit = itemView.findViewById<TextView>(R.id.txtHobbit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        var view:View? = null
        if(layout==Layout.HORIZONTAL||layout==Layout.VERTICAL) {
             view = LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item,parent,false)
        }
        else{
            view = LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,parent,false)
        }
        return DogCardViewHolder(view!!)
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        holder.image.setImageResource(listDogs[position].image)
        holder.name.setText(listDogs[position].name)
        holder.age.setText("Age: ${listDogs[position].age}")
        holder.hobbit.setText("Hobbies: ${listDogs[position].hobbies}")
    }

    override fun getItemCount(): Int {
        return  listDogs.size
    }
}