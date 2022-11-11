package com.example.cryptocurrencylist.overview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptocurrencylist.R
import com.example.cryptocurrencylist.database.CryptoDetails

class CryptoDetailsAdapter : ListAdapter<CryptoDetails, CryptoDetailsAdapter.ViewHolder>(CryptoDetailDiffCallback()) {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    // private constructor because ViewHolder instances are created from within the class inside companion object.
    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        /* storing references of views inside itemView with properties allows us to avoid searching for views
        everytime with findViewById. Especially when the same ViewHolder is recycled and reused by RecyclerView
        ItemView -> the constraint layout blueprint for each item in recyclerview */
        private val rank: TextView = itemView.findViewById(R.id.rank_text)
        private val logo: ImageView = itemView.findViewById(R.id.logo_image)
        private val ticker: TextView = itemView.findViewById(R.id.ticker_text)
        private val currentPrice: TextView = itemView.findViewById(R.id.price_text)
        private val change: TextView = itemView.findViewById(R.id.change_text)
        private val marketCap: TextView = itemView.findViewById(R.id.marketcap_text)

        // this method is called inside onBindViewHolder by an instance of viewHolder, for which the recyclerView asks the adapter to bind data
        fun bind(
            item: CryptoDetails
        ) {
            rank.text = item.rank.toString()
            logo.setImageResource(item.logoImageResource)
            ticker.text = item.ticker
            currentPrice.text = item.currentPrice.toString()
            change.text = item.percentageChange.toString()
            marketCap.text = item.marketCap.toString()
        }

        /* from method is used to create and return instances of ViewHolder so as to encapsulate inflation & which layout to inflate inside the
        ViewHolder class and not directly inside adapter. Companion object is used to access the "from" function using <ClassName.function> syntax
        (like static) inside onCreateViewHolder*/
        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.list_item_overview, parent, false)
                return ViewHolder(view)
            }
        }
    }
}

class CryptoDetailDiffCallback: DiffUtil.ItemCallback<CryptoDetails>() {
    override fun areItemsTheSame(oldItem: CryptoDetails, newItem: CryptoDetails): Boolean {
        return oldItem.rank == newItem.rank
    }

    override fun areContentsTheSame(oldItem: CryptoDetails, newItem: CryptoDetails): Boolean {
        return oldItem == newItem
    }
}