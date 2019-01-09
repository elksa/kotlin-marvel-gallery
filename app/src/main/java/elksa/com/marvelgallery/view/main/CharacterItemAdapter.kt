package elksa.com.marvelgallery.view.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import elksa.com.marvelgallery.R
import elksa.com.marvelgallery.model.MarvelCharacter
import elksa.com.marvelgallery.view.common.ItemAdapter
import elksa.com.marvelgallery.view.common.bindView
import elksa.com.marvelgallery.view.common.loadImage

class CharacterItemAdapter(
    val character: MarvelCharacter
) : ItemAdapter<CharacterItemAdapter.ViewHolder>(R.layout.item_character) {

    override fun onCreateViewHolder(itemView: View) = ViewHolder(itemView)

    override fun ViewHolder.onBindViewHolder() {
        textView.text = character.name
        imageView.loadImage(character.imageURL)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val textView by bindView<TextView>(R.id.textView)
        val imageView by bindView<ImageView>(R.id.imageView)
    }
}