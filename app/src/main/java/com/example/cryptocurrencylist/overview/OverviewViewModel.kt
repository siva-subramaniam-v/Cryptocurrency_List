package com.example.cryptocurrencylist.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptocurrencylist.R
import com.example.cryptocurrencylist.database.CryptoDetails

class OverviewViewModel : ViewModel() {
    private val _cryptoList = MutableLiveData(
        listOf(
            CryptoDetails(1, R.drawable.bitcoin_btc_logo, "BTC", 1577093, 0.2, 30249582947585),
            CryptoDetails(2, R.drawable.ethereum_eth_logo, "ETH", 105861, 0.7, 12750169868600),
            CryptoDetails(3, R.drawable.tether_usdt_logo, "USDT", 1577093, 0.2, 5640727278180),
            CryptoDetails(4, R.drawable.usd_coin_usdc_logo, "USDC", 1577093, 0.2, 3711521020321),
            CryptoDetails(5, R.drawable.bnb_logo, "BNB", 1577093, 0.2, 3633137010245),
            CryptoDetails(6, R.drawable.xrp_logo, "XRP", 1577093, 0.2, 1989849543015),
            CryptoDetails(7, R.drawable.binance_usd_busd_logo, "BUSD", 1577093, 0.2, 1761992311701),
            CryptoDetails(8, R.drawable.cardano_ada_logo, "ADA", 1577093, 0.2, 1025134279247),
            CryptoDetails(9, R.drawable.solana_sol_logo, "SOL", 1577093, 0.2, 878781637617),
            CryptoDetails(10, R.drawable.dogecoin_doge_logo, "DOGE", 1577093, 0.2, 663833936142),
            CryptoDetails(11, R.drawable.polkadot_new_dot_logo, "DOT", 1577093, 0.2, 30249582947585),
            CryptoDetails(12, R.drawable.shiba_inu_shib_logo, "SHIB", 105861, 0.7, 12750169868600),
            CryptoDetails(13, R.drawable.multi_collateral_dai_dai_logo, "DAI", 1577093, 0.2, 5640727278180),
            CryptoDetails(14, R.drawable.polygon_matic_logo, "MATIC", 1577093, 0.2, 3711521020321),
            CryptoDetails(15, R.drawable.tron_trx_logo, "TRX", 1577093, 0.2, 3633137010245),
            CryptoDetails(16, R.drawable.steth_steth_logo, "STETH", 1577093, 0.2, 1989849543015),
            CryptoDetails(17, R.drawable.wrapped_bitcoin_wbtc_logo, "WBTC", 1577093, 0.2, 1761992311701),
            CryptoDetails(18, R.drawable.avalanche_avax_logo, "AVAX", 1577093, 0.2, 1025134279247),
            CryptoDetails(19, R.drawable.uniswap_uni_logo, "UNI", 1577093, 0.2, 878781637617),
            CryptoDetails(20, R.drawable.okb_okb_logo, "OKB", 1577093, 0.2, 663833936142),
        )
    )

    val cryptoList: LiveData<List<CryptoDetails>>
        get() = _cryptoList
}