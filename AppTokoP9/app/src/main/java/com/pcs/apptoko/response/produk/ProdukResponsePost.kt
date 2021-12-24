package com.pcs.apptoko.response.produk

data class ProdukResponsePost (
    val `data`: Produk,
    val message: String,
    val success: Boolean
    )