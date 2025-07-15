package com.example.randompet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class PetAdapter(private val petList: List<Pet>) : RecyclerView.Adapter<PetAdapter.ViewHolder>() {
     {
        class PetAdapter(private val petList: List<String>)
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val petImage: ImageView

            init {
                // Find our RecyclerView item's ImageView for future use
                petImage = view.findViewById(R.id.pet_image)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetAdapter.ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pet_item, parent, false)

        return RecyclerView.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PetAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolder {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = petList.size
}