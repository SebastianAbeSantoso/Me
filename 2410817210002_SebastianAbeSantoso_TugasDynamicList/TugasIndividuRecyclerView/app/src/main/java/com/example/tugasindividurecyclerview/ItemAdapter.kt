package com.example.tugasindividurecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasindividurecyclerview.databinding.ItemRowBinding

class ItemAdapter(private val itemList: List<ItemModel>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

        class ItemViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        val context = holder.itemView.context

        "Gambar ${item.number}".also { holder.binding.imageLabel.text = it }
        holder.binding.itemImage.setImageResource(item.image)
        holder.binding.titleText.text = item.title
        holder.binding.descText.text = item.description

        if (position % 2 == 1) {
            holder.binding.itemContainer.setBackgroundResource(R.drawable.bg_item_green)
        } else {
            holder.binding.itemContainer.setBackgroundResource(R.drawable.bg_item_normal)
        }

        holder.binding.itemSwitch.setOnCheckedChangeListener(null)
        holder.binding.itemSwitch.isChecked = item.isSwitchOn

        holder.binding.itemSwitch.setOnCheckedChangeListener { _, isChecked ->
            item.isSwitchOn = isChecked

            if (isChecked) {
                Toast.makeText(
                    context,
                    "Switch hidup pada item ${item.number}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        holder.binding.actionButton.setOnClickListener {
            Toast.makeText(
                context,
                "Tombol telah ditekan untuk tombol ${item.number}",
                Toast.LENGTH_SHORT
            ).show()
        }

        holder.binding.itemContainer.setOnClickListener {
            Toast.makeText(
                context,
                "Item telah ditekan untuk ${item.number}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}