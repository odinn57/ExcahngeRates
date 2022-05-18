package com.odinn.excahngerates.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.odinn.excahngerates.data.repository.Repository
import com.odinn.excahngerates.model.Curr
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FirstViewModel:ViewModel() {
    private var currency: MutableLiveData<Curr> = MutableLiveData()
    private val repository:Repository = Repository()
    init {
        viewModelScope.launch {
            currency.value = repository.getCurr()
        }
    }
    fun updateCurr(){
        viewModelScope.launch {
            currency.value = repository.getCurr()
        }
    }

    fun getCurrency() = currency



}