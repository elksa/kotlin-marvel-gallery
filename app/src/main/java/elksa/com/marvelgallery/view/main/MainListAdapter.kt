package elksa.com.marvelgallery.view.main

import elksa.com.marvelgallery.view.common.AnyItemAdapter
import elksa.com.marvelgallery.view.common.RecyclerListAdapter

class MainListAdapter(items: List<AnyItemAdapter>): RecyclerListAdapter(items) {

    fun add(itemAdapter: AnyItemAdapter) {
        items += itemAdapter
        val index = items.indexOf(itemAdapter)
        if (index == -1) return
        notifyItemInserted(index)
    }

    fun delete(itemAdapter: AnyItemAdapter) {
        val index = items.indexOf(itemAdapter)
        if (index == -1) return
        items -= itemAdapter
        notifyItemRemoved(index)
    }
}