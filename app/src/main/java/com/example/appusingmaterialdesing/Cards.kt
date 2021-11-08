package com.example.appusingmaterialdesing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class Cards : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cards)
        setupChecking()
        //       setupDragging()
    }

    private fun setupChecking() {
        val card : MaterialCardView = findViewById(R.id.card)
        card.setOnLongClickListener {
            card.isChecked = !card.isChecked
            true
        }
    }

//    private fun setupDragging() {
//        val parentContainer : CoordinatorLayout = findViewById(R.id.parentContainer)
//        parentContainer.addDraggableChild(card)
//        parentContainer.setViewDragListener(object)
//            : DraggableCoordinatorLayout.ViewDragListener {
//
//            override fun onViewCaptured(view: View, pointerId: Int) {
//                card.isDragged = true
//            }
//
//            override fun onViewReleased(view: View, xVelocity: Float, yVelocity: Float) {
//                card.isDragged = false
//            }
//        })
//    }
}