package com.example.tenantmanagementsystemgroupa

import java.io.Serializable

// Serializable lets Safe Args pack a whole Tenant into the Fragment arguments
data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) : Serializable {
    // Shown in the layout with @{tenant.summary()}
    fun summary(): String = "$name\nPhone: $phone\nRent: KSh $rent"
}
