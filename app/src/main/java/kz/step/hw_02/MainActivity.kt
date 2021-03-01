package kz.step.hw_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var login: String = "icarus"
    var password: String = "fallen"

    var editTextLogin: EditText? = null
    var editTextPassword: EditText? = null
    var textViewStatus: TextView? = null
    var buttonDelete: Button? = null
    var buttonCheck: Button? = null

    var isVisible: Boolean? = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }

    fun initializeViews(){

        editTextLogin = findViewById(R.id.activity_main_edittext_login)
        editTextPassword = findViewById(R.id.activity_main_edittext_password)
        textViewStatus = findViewById(R.id.activity_main_textview_status)
        buttonDelete = findViewById(R.id.activity_main_button_delete)
        buttonCheck = findViewById(R.id.activity_main_button_check)

    }

    fun initializeListeners(){
        buttonDelete?.setOnClickListener{

            if (isVisible == true){
                buttonDelete?.text="Показать элементы"
                editTextLogin?.visibility = View.INVISIBLE
                editTextLogin?.visibility = View.GONE

                editTextPassword?.visibility = View.INVISIBLE
                editTextPassword?.visibility = View.GONE

                textViewStatus?.visibility = View.INVISIBLE
                textViewStatus?.visibility = View.GONE

                buttonCheck?.visibility = View.INVISIBLE
                buttonCheck?.visibility = View.GONE

                isVisible = false
            }
            else{
                buttonDelete?.text="Скрыть элементы"
                editTextLogin?.visibility = View.VISIBLE
                editTextPassword?.visibility = View.VISIBLE
                textViewStatus?.visibility = View.VISIBLE
                buttonCheck?.visibility = View.VISIBLE

                isVisible = true
            }

        }
        buttonCheck?.setOnClickListener{
            if (editTextLogin?.text.toString() == login && editTextPassword?.text.toString() == password){
                textViewStatus?.text = "It is so sad =("
            }
        }
    }

}