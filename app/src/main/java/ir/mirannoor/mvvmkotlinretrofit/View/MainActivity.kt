package ir.mirannoor.mvvmkotlinretrofit.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ir.mirannoor.mvvmkotlinretrofit.R
import ir.mirannoor.mvvmkotlinretrofit.ViewModel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ViewModel //ViewModel: name of ViewModel.java created in this project.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1.Instance of ViewModel to send data to ViewModel.
        viewModel = ViewModelProviders.of(this).get(ViewModel::class.java)


        //2.Create Observer to get data from ViewModel.
        viewModel.observer.observe(this, Observer { Toast.makeText(this@MainActivity, it, Toast.LENGTH_LONG).show() })



        btn.setOnClickListener { viewModel.getDatafromModel() }


    }
}
