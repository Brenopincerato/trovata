package com.example.trovata.data.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context) : SQLiteOpenHelper(context, "database.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        // Criação das tabelas
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Atualização do banco de dados
    }
}
