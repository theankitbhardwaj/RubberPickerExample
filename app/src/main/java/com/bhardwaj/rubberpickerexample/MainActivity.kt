package com.bhardwaj.rubberpickerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextSwitcher
import android.widget.TextView
import com.jem.rubberpicker.RubberRangePicker

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val priceRangeLeft: TextView = findViewById(R.id.price_range_left)
        val priceRangeRight: TextView = findViewById(R.id.price_range_right)
        val rubberRangePicker: RubberRangePicker = findViewById(R.id.rubberpicker)
        priceRangeLeft.setText("₹"+rubberRangePicker.getCurrentStartValue())
        priceRangeRight.setText("₹"+rubberRangePicker.getCurrentEndValue())
        rubberRangePicker.setOnRubberRangePickerChangeListener(object: RubberRangePicker.OnRubberRangePickerChangeListener{
            override fun onProgressChanged(
                rangePicker: RubberRangePicker,
                startValue: Int,
                endValue: Int,
                fromUser: Boolean
            ) {
                priceRangeLeft.setText("₹ "+rubberRangePicker.getCurrentStartValue())
                priceRangeRight.setText("₹ "+rubberRangePicker.getCurrentEndValue())
            }
            override fun onStartTrackingTouch( //Not implemented
                rangePicker: RubberRangePicker,
                isStartThumb: Boolean
            ) {

            }
            override fun onStopTrackingTouch( //Not implemented
                rangePicker: RubberRangePicker,
                isStartThumb: Boolean
            ) {

            }
        })
    }
}
