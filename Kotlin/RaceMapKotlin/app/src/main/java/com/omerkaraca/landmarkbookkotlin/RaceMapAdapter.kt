package com.omerkaraca.landmarkbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.omerkaraca.landmarkbookkotlin.databinding.ActivityMainBinding
import com.omerkaraca.landmarkbookkotlin.databinding.RecyclerRowBinding

class RaceMapAdapter(val raceMapList : ArrayList<RaceMap>) : RecyclerView.Adapter<RaceMapAdapter.RaceMapHolder>() {

    class RaceMapHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RaceMapHolder {
        //ilk oluştrulduğunda ne olacak? layout ile bağlama işlemi (viewbinding kullanarak)
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RaceMapHolder(binding)


    }

    override fun onBindViewHolder(holder: RaceMapHolder, position: Int) {
        //bağlandıktan sonra ne olacak hangi textte hangi veriyi kullanıcaz?
        holder.binding.recyclerViewTextView.text = raceMapList.get(position).name

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("racemap",raceMapList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        //kaç tane oluşturacağız bundan?
        return raceMapList.size
    }


}