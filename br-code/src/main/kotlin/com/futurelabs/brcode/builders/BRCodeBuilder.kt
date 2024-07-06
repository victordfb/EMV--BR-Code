package com.futurelabs.brcode.builders

import com.futurelabs.brcode.BRCode
import com.futurelabs.brcode.domain.*

class BRCodeBuilder {

    private lateinit var merchantName: MerchantName
    private lateinit var pixKey: PixKey
    private lateinit var city: MerchantCity
    private var value: Brl? = null

    fun setMerchantName(name: String): BRCodeBuilder {
        this.merchantName = MerchantName(name)
        return this
    }

    fun setPixKey(pixKey: String): BRCodeBuilder {
        this.pixKey = Cpf.of(pixKey)
        return this
    }

    fun setCity(city: String): BRCodeBuilder {
        this.city = MerchantCity(city)
        return this
    }

    fun setValue(value: String): BRCodeBuilder {
        this.value = Brl.of(value)
        return this
    }

    fun build() = BRCode(this.merchantName, this.pixKey, this.city, this.value)

    companion object {
        fun newBuilder() = BRCodeBuilder()
    }
}
