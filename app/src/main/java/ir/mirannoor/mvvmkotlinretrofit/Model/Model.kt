package ir.mirannoor.mvvmkotlinretrofit.Model

import io.reactivex.Observable

class Model {

    //6.Create an Observable to send data to ViewModel.
    fun getDatafromDB(): Observable<String> {
        return Observable.just("MVVM Kotlin Retrofit")
    }
}