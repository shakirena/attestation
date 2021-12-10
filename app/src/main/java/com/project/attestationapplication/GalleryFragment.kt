package com.project.attestationapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

private const val LAST_INDEX = "index"
class GalleryFragment : Fragment() {

    lateinit var imageView: ImageView
    lateinit var nextButton: Button
    var index: Int=1

    private val imageList: List<Int> = listOf(
        R.drawable.horse1,
        R.drawable.lion,
        R.drawable.pngwing
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        imageView = view.findViewById(R.id.image_view)
        nextButton = view.findViewById(R.id.next_button)
        index = savedInstanceState?.getInt(LAST_INDEX) ?: 1


        nextButton.setOnClickListener{
            imageView.setImageResource(imageList[index])
            if (index==imageList.count()-1) index=0;
                else index++

        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_INDEX,index)
    }


}