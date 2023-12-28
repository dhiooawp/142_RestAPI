package com.example.kontakrestapi.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.kontakrestapi.KontakApplikation
import com.example.kontakrestapi.kontak.viewmodel.InsertViewModel
import com.example.kontakrestapi.ui.home.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiKontak().container.kontakRepository)
        }
        initializer { InsertViewModel(aplikasiKontak().container.kontakRepository) }
    }
}

fun CreationExtras.aplikasiKontak(): KontakApplikation =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakApplikation)