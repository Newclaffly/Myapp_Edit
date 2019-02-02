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
    private var textview: TextView? = null
    private var edit: EditText? = null
    private var firstname: EditText? = null
    private var lastname: EditText? = null
    private var id: EditText? = null
    private var address: EditText? = null
    private var job: EditText? = null
    private var btnsubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_)
        edit = findViewById(R.id.firstname) as EditText
        firstname = findViewById(R.id.firstname) as EditText
        lastname = findViewById(R.id.lastname) as EditText
        id = findViewById(R.id.id) as EditText
        address = findViewById(R.id.address) as EditText
        job = findViewById(R.id.job) as EditText
        btnsubmit = findViewById(R.id.submit) as Button

        var textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                btnsubmit!!.isEnabled = if (edit!!.toString().length > 0) {
                    true
                } else {
                    false
                }
            }//end if
        }// end Watcher
        edit!!.addTextChangedListener(textWatcher)
        btnsubmit!!.isEnabled = false
    }//end oncreate

    fun gotoabout(view: View) {
        var intent = Intent(this, Aboutme_Activity::class.java)
        intent.putExtra("firstname", firstname!!.text.toString())
        intent.putExtra("lastname", lastname!!.text.toString())
        intent.putExtra("id", id!!.text.toString())
        intent.putExtra("address", address!!.text.toString())
        intent.putExtra("job", job!!.text.toString())
        startActivity(intent)
    }
    fun backtoabout(view:View){
        finish()
    }
}//end class
