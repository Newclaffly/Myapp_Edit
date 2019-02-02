package com.example.my_application_one

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Aboutme_Activity : AppCompatActivity() {
    private var firstname: TextView? = null
    private var lastname: TextView? = null
    private var id: TextView? = null
    private var address: TextView? = null
    private var job: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme_)
        var intent = getIntent()

        firstname = findViewById(R.id.textViewa) as TextView
        lastname = findViewById(R.id.textViewb) as TextView
        id = findViewById(R.id.textViewc) as TextView
        address = findViewById(R.id.textViewd) as TextView
        job = findViewById(R.id.textViewe) as TextView
        // echo
        firstname!!.text = intent.getStringExtra("firstname")
        lastname!!.text = intent.getStringExtra("lastname")
        id!!.text = intent.getStringExtra("id")
        address!!.text = intent.getStringExtra("address")
        job!!.text = intent.getStringExtra("job")
    }

    fun goback(view: View) {
        finish()
    }
}
