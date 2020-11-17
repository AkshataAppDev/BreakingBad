package com.example.breakingbad.util

import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.breakingbad.R
import com.example.breakingbad.adapter.CharacterListAdapter
import com.example.breakingbad.database.APIStatus
import com.example.breakingbad.database.CharacterModel

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<CharacterModel>?) {

//    using binding adapter automatically observes live data for char items list
    val adapter = recyclerView.adapter as CharacterListAdapter
    if(data != null) {
        adapter.submitList(data)
    }
}

@BindingAdapter("urlToImage")
fun bindImage(imgView: ImageView, imgUrl: String?) {

    // Use of Glide library for efficiently downloading and displaying images in imageview.
    imgUrl?.let {
        val imageUri = imgUrl.toUri().buildUpon().scheme("https").build()

        //TODO : Use Glide dependency here.
        Glide.with(imgView.context)
            .load(imageUri)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.loading_animation)
                    .error(R.drawable.ic_broken_image)
            )
            .into(imgView)
    }
}

@BindingAdapter("apiStatus")
fun bindStatus(progressBar: ProgressBar, status: APIStatus?) {

    // to show status to user in case of data being downloaded/ offline/ error
    when (status) {
        APIStatus.LOADING -> {
            progressBar.visibility = View.VISIBLE
        }

        APIStatus.DONE -> {
            progressBar.visibility = View.GONE
        }

        APIStatus.ERROR -> {
            progressBar.visibility = View.GONE
        }
    }
}


