package com.example.my_application_one

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var showText : TextView? = null
    private  var name: EditText? = null
    private  var btnok: Button?  = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showText = findViewById(R.id.editText) as TextView
        name = findViewById(R.id.editText) as EditText
        btnok = findViewById(R.id.ok) as Button
        var textWatcher = object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                btnok!!.isEnabled = if(name!!.toString().length>0){
                    true
                }else{
                    false
                }//end else
            }//end if
        }//end TextWatcher
        name!!.addTextChangedListener(textWatcher)
        btnok!!.isEnabled = false
    }// end funcreate
    fun clickOK(view: View){
        showText!!.setText("Hello, ${name!!.text.toString()}")
    }
    fun gotoaboutme(view:View){
        var intent = Intent(this,Aboutme_Activity::class.java)
        intent.putExtra("val", name!!.text.toString())
        startActivity(intent)
    }
    fun gotoedit(view:View){
        var intent = Intent(this,Edit_Activity::class.java)
        startActivity(intent)
    }


}//end class
