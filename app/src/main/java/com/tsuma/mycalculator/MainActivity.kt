package com.tsuma.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNumber1:TextInputLayout
    lateinit var etNumber1: EditText
    lateinit var tilNumber2:TextInputLayout
    lateinit var etNumber2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMulty: Button
    lateinit var btnDivide: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumber1=findViewById(R.id.tilNumber1)
        etNumber1 = findViewById(R.id.etNumber1)
        tilNumber2=findViewById(R.id.tilNumber2)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMulty = findViewById(R.id.btnMulty)
        btnDivide = findViewById(R.id.btnDivide)
        tvResult = findViewById(R.id.tvResult)



        btnAdd.setOnClickListener {
            var plus = etNumber1.text.toString().toInt()
            var plus2 = etNumber2.text.toString().toInt()
            getResult(plus, plus2)

        }


    btnSub.setOnClickListener {
        var minus = etNumber1.text.toString().toInt()
        var minus2 = etNumber2.text.toString().toInt()
        answer(minus, minus2)

    }
    btnMulty.setOnClickListener {
        var multiply = etNumber1.text.toString().toInt()
        var multiply2 = etNumber2.text.toString().toInt()
        result(multiply, multiply2)

    }
    btnDivide.setOnClickListener {
        var div = etNumber1.text.toString().toInt()
        var div2 = etNumber2.text.toString().toInt()
        output(div, div2)

    }
}


fun getResult(plus: Int, plus2: Int) {
    var addition = plus
    var addition2 = plus2 + addition
    tvResult.text = addition2.toString()
}

fun answer(minus: Int, minus2: Int) {
    var remove = minus
    var remove2 =  remove-minus2
    tvResult.text = remove2.toString()


}

fun result(multiply: Int, multiply2: Int) {
    var times = multiply
    var times2 = multiply2 * times
    tvResult.text = times2.toString()


}
fun output(div: Int, div2: Int) {
    var division = div
    var div2 = div2 % division
    tvResult.text = div2.toString()

}
}








