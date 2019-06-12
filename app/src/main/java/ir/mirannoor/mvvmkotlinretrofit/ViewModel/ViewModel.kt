package ir.mirannoor.mvvmkotlinretrofit.ViewModel

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ir.mirannoor.mvvmkotlinretrofit.Model.Model

class ViewModel : ViewModel() {

    //3.Create instance of Model for send data to
    val repository = Model()

    //4.Define LiveData to send data to View.
    val observer = MutableLiveData<String>()


    @SuppressLint("CheckResult")
    fun getDatafromModel() {
        //5.Create Subscriber to get data from Model.
        repository.getDatafromDB().subscribe({
            observer.value = it
        }, {
            Log.d("onError", it.message)
        }, {
            Log.d("onComplete", "Completed")
        })
    }
}