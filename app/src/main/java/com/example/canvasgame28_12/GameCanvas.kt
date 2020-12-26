package com.example.canvasgame28_12

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.TableLayout
import android.widget.TableRow
import androidx.constraintlayout.solver.widgets.Rectangle


class GameCanvas : View {
    private var startX = 0F
    private var startY = 0F
    private var stopX = 600F
    private var stopY = 600F
    private var paint = Paint()
    private var rowWidth = 200
    private var rowHeight = 200
    private var rowMargin = 5
    private var rectanglesList: List<Rect> = mutableListOf()
    var winCoordinates: Array<Int> = Array(3, { 3 })

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.BLUE

//        canvas?.drawLine(30F, 30F, 630F, 30F, paint)//topLine
//        canvas?.drawLine(30F, 30F, 30F, 630F, paint)//LeftLine
//        canvas?.drawLine(630F, 30F, 630F, 630F, paint)//RightLine
//        canvas?.drawLine(30F, 630F, 630F, 630F, paint)//BottomLine
//        canvas?.drawLine(30F, 230F, 630F, 230F, paint)
//        canvas?.drawLine(30F, 430F, 630F, 430F, paint)
//        canvas?.drawLine(230F, 30F, 230F, 630F, paint)
//        canvas?.drawLine(430F, 30F, 430F, 630F, paint)


        for (i in 0 until 3) {
            for (j in 0 until 3) {
                canvas?.drawRect(
                    (i * rowWidth).toFloat() + rowMargin,
                    (j * rowHeight).toFloat() + rowMargin,
                    ((i * rowWidth) + rowWidth).toFloat(),
                    (j * rowHeight) + rowHeight.toFloat(),
                    paint
                )
            }
        }
    }
}