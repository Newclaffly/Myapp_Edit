package com.example.my_application_one

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView

class Aboutme_Activity : AppCompatActivity() {
    private var firstname : TextView? = null
    private var lastname : TextView? = null
    private var id : TextView? = null
    private var address : TextView? = null
    private var job : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme_)
        firstname = findViewById(R.id.firstname) as TextView
        lastname = findViewById(R.id.lastname) as TextView
        id = findViewById(R.id.id) as TextView
        address = findViewById(R.id.address) as TextView
        job = findViewById(R.id.job) as TextView

        var textWatcher = object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        }//end Watcher
    }//end onCreate


    fun gotoedit(view:View){
        var intent = Intent(this,Edit_Activity::class.java)
        intent.putExtra("first" ,firstname!!.text.toString())
        intent.putExtra("last" ,lastname!!.text.toString())
        intent.putExtra("id" ,id!!.text.toString())
        intent.putExtra("add" ,address!!.text.toString())
        intent.putExtra("job" ,job!!.text.toString())
        startActivity(intent)
    }
    fun goback(view: View){
        finish()
    }
}
