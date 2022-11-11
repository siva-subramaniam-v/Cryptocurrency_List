package com.example.cryptocurrencylist.database

data class CryptoDetails(
    var rank: Long,
    var logoImageResource: Int,
    var ticker: String,
    var currentPrice: Long,
    var percentageChange: Double,
    var marketCap: Long
)