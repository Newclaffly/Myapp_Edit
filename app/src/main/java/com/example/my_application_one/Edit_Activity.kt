package com.example.my_application_one

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Edit_Activity : AppCompatActivity() {
    private val REQUEST_MAIN = 11
    private var editfirst: TextView? = null
    private var editlast: TextView? = null
    private var editid: TextView? = null
    private var editaddress: TextView? = null
    private var editjob: TextView? = null
    private var btnsubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_)
        var intent = getIntent()
        editfirst = findViewById(R.id.editfirst) as EditText
        editlast = findViewById(R.id.editlast) as EditText
        editid = findViewById(R.id.editid) as EditText
        editaddress = findViewById(R.id.editaddress) as EditText
        editjob = findViewById(R.id.editjob) as EditText
        //echo
        editfirst!!.text = intent.getStringExtra("first")
        editlast!!.text = intent.getStringExtra("last")
        editid!!.text = intent.getStringExtra("id")
        editaddress!!.text = intent.getStringExtra("add")
        editjob!!.text = intent.getStringExtra("job")

        btnsubmit = findViewById(R.id.submit) as Button

        var textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                btnsubmit!!.isEnabled = if (editfirst!!.toString().length > 0) {
                    true
                } else {
                    false
                }
            }//end if
        }// end Watcher
        editfirst!!.addTextChangedListener(textWatcher)
        btnsubmit!!.isEnabled = true
    }//end oncreate


    fun gotoabout(view: View) {
        var intent = Intent(this, Aboutme_Activity::class.java)
////        intent.putExtra("firstname", firstname!!.text.toString())
////        intent.putExtra("lastname", lastname!!.text.toString())
////        intent.putExtra("id", id!!.text.toString())
////        intent.putExtra("address", address!!.text.toString())
////        intent.putExtra("job", job!!.text.toString())
        startActivity(intent)
    }

    fun backtoabout(view: View) {
        finish()
    }
}//end class
