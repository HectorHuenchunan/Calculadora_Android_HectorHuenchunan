package com.hectorhuenchunan.calculadora_android_hectorhuenchunan
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //0->nada; 1->suma; 2->resta; 3->mult; 4->div
    var oper: Int = 0
    var numero1: Double = 0.0
    lateinit var num1: TextView
    lateinit var num2: TextView
    lateinit var result: TextView
    lateinit var Operacion: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.Textview_1)
        num2 = findViewById(R.id.Textview_2)
        result = findViewById(R.id.Textview_Result)
        Operacion = findViewById(R.id.Textview_Operacion)

    }



    fun SeleccionNumero(view: View){
        var num1_aux: String = num1.text.toString()

        when(view.id){
            R.id.btn0 -> num1.setText(num1_aux + "0")
            R.id.btn1 -> num1.setText(num1_aux + "1")
            R.id.btn2 -> num1.setText(num1_aux + "2")
            R.id.btn3 -> num1.setText(num1_aux + "3")
            R.id.btn4 -> num1.setText(num1_aux + "4")
            R.id.btn5 -> num1.setText(num1_aux + "5")
            R.id.btn6 -> num1.setText(num1_aux + "6")
            R.id.btn7 -> num1.setText(num1_aux + "7")
            R.id.btn8 -> num1.setText(num1_aux + "8")
            R.id.btn9 -> num1.setText(num1_aux + "9")
        }
    }

    fun SeleccionOperacion(view: View){

        var num1_aux : String = num1.text.toString()

        num1.setText("")

        when(view.id){
            R.id.btnSumar ->{
                num2.setText(num1_aux)
                Operacion.setText("+")
                result.setText("")
                oper = 1
            }
            R.id.btnRestar ->{
                num2.setText(num1_aux)
                Operacion.setText("-")
                result.setText("")
                oper = 2
            }
            R.id.btnMult ->{
               num2.setText(num1_aux)
                Operacion.setText("*")
                result.setText("")
                oper = 3
            }
            R.id.btnMult ->{
               num2.setText(num1_aux)
                Operacion.setText("/")
                result.setText("")
                oper = 4
            }

        }


    }

    fun Resultado (view: View){
        var num1_aux = num1.text.toString().toDouble()
        var num2_aux = num2.text.toString().toDouble()
        var res: Double = 0.0
        when(oper){
            1-> res =  num2_aux + num1_aux
            2-> res = num2_aux - num1_aux
            3-> res = num2_aux * num1_aux
            4-> res = num2_aux / num1_aux
        }
        result.setText(res.toString())
        num1.setText(res.toString())
        num2.setText("")
        Operacion.setText("")

    }

        fun Borrar (view: View){
            var txt1: TextView = findViewById(R.id.Textview_1)
            var txt2: TextView = findViewById(R.id.Textview_2)
            var txt3: TextView = findViewById(R.id.Textview_Result)
            var txt4: TextView = findViewById(R.id.Textview_Operacion)

            txt1.setText("")
            txt2.setText("")
            txt3.setText("")
            txt4.setText("")
        }
    }



