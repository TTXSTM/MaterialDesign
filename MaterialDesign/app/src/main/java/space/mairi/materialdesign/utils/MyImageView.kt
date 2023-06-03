package space.mairi.materialdesign.utils

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class MyImageView @JvmOverloads constructor(
    context: Context,
    attributesSet: AttributeSet? = null,
    defStyle: Int = 0
) : AppCompatImageView(context, attributesSet, defStyle){

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int){
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
    }
}