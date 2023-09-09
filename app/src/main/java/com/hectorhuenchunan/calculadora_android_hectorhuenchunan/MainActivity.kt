package com.hectorhuenchunan.calculadora_android_hectorhuenchunan
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //0->nada; 1->suma; 2->resta; 3->mult; 4->div
    var oper: Int = 0
    var numero1: Double = 0.0
    lateinit var num1: TextView
    lateinit var num2: TextView
    lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIgual: Button = findViewById(R.id.btnIgual)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)

        num1 = findViewById(R.id.Textview_1)
        num2 = findViewById(R.id.Textview_2)
        result = findViewById(R.id.Textview_Result)

    }



    fun SelectionNumber(view: View){
        var aux_num2 = num2.text.toString()

        when(view.id){
            R.id.btn0 -> num2.setText(aux_num2+"0")
            R.id.btn1 -> num2.setText(aux_num2+"1")
            R.id.btn2 -> num2.setText(aux_num2+"2")
            R.id.btn3 -> num2.setText(aux_num2+"3")
            R.id.btn4 -> num2.setText(aux_num2+"4")
            R.id.btn5 -> num2.setText(aux_num2+"5")
            R.id.btn6 -> num2.setText(aux_num2+"6")
            R.id.btn7 -> num2.setText(aux_num2+"7")
            R.id.btn8 -> num2.setText(aux_num2+"8")
            R.id.btn9 -> num2.setText(aux_num2+"9")
            R.id.btnPunto -> num2.setText(aux_num2+".")
        }
    }

    fun SeleccionOperacion(view: View){
        var aux_num2 = num2.text.toString()
        numero1 = num2.toString().toDouble()
        num2.setText("")
        when(view.id){
            R.id.btnSumar -> {
                num1.setText(aux_num2+"+")
                oper = 1
            }
            R.id.btnRestar ->{
                num1.setText(aux_num2+"-")
                oper = 2
            }
            R.id.btnMult ->{
                num1.setText(aux_num2+"*")
                oper = 3
            }
            R.id.btnDividir -> {
                num1.setText(aux_num2+"/")
                oper = 4
            }
        }
    }


}