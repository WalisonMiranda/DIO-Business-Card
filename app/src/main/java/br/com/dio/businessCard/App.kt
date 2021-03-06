package br.com.dio.businessCard

import android.app.Application
import br.com.dio.businessCard.data.AppDatabase
import br.com.dio.businessCard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}