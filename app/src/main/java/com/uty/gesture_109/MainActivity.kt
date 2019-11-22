package com.uty.gesture_109

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    // variabel untuk mendeteksi Gesture yang diberi nilai awal yaitu null
    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // membuat class turunan GestureDetectorCompat
        this.gDetector = GestureDetectorCompat(this, this)
        // mendeteksi ketukan ganda
        gDetector?.setOnDoubleTapListener(this)
    }

    // mencegah sentuhan/tap dan meneruskannya ke instance GestureDetectorCompat
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        // memastikan untuk memanggil implementasi superclass
        return super.onTouchEvent(event)
    }

    // implementasi untuk ketukan kebawah
    override fun onDown(e: MotionEvent?): Boolean {
        gesture_status.text = "onDown"
        return true
    }

    // implementasi ketukan melempar atau fling
    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        gesture_status.text = "onFling"
        return true
    }

    // implementasi untuk ketukan lama atau onLongPress
    override fun onLongPress(e: MotionEvent?) {
        gesture_status.text = "onLongPress"
    }

    // implementasi melakukan scroll atau onScroll
    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        gesture_status.text = "onScroll"
        return true
    }

    // implementasi untuk menekan atau onShowPress
    override fun onShowPress(e: MotionEvent?) {
        gesture_status.text = "onShowPress"
    }

    // implementasi untuk sekali ketuk atau onSingleTapUp
    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        gesture_status.text = "onSingleTapUp"
        return true
    }

    // implementasi untuk ketukan berulang dua kali atau onDoubleTap
    override fun onDoubleTap(e: MotionEvent?): Boolean {
        gesture_status.text = "onDoubleTap"
        return true
    }

    // implementasi ketkan berulang-ulang atau onDoubleTapEvent
    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        gesture_status.text = "onDoubleTapEvent"
        return true
    }

    // implementasi untuk satu kali ketukan dikonfirmasi atau onSingleTapConfirmed
    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        gesture_status.text = "onSingleTapConfirmed"
        return true
    }
}
