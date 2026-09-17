package com.pemmob.zainab.data.dummy

import com.pemmob.zainab.data.model.Category
import com.pemmob.zainab.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Makanan
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Krenyes Gurih", price = 15000.0, stock = 20, img = "dummy_product"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Mendoan Hangat Gurih/Bumbu", price = 20000.0, stock = 15, img = "dummy_product"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Manis Legit", price = 25000.0, stock = 10, img = "dummy_product"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Manis Gurih", price = 30000.0, stock = 12, img = "dummy_product"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Manis Manis Kenyal", price = 18000.0, stock = 25, img = "dummy_product"),

        // Minuman
        Product(id = 6, category_id = 2, category = categories[1], name = "Es Dawet", description = "Segar Manis", price = 10000.0, stock = 30, img = "dummy_product"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Kopi Robusta", description = "Kopi Lokal", price = 25000.0, stock = 18, img = "dummy_product"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Wedang Jahe", description = "Penghangat Tubuh", price = 12000.0, stock = 22, img = "dummy_product"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Es Kelapa", description = "Es Segar", price = 8000.0, stock = 40, img = "dummy_product"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Sirup Pala", description = "Olahan Khas", price = 35000.0, stock = 15, img = "dummy_product"),

        // Kerajinan
        Product(id = 11, category_id = 3, category = categories[2], name = "Batik Purbalingga", description = "Kain Batik", price = 150000.0, stock = 5, img = "dummy_product"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu Awet", price = 20000.0, stock = 50, img = "dummy_product"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Tas Anyaman", description = "Tas Lokal", price = 75000.0, stock = 8, img = "dummy_product"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Kerajinan Bambu", description = "Anyaman Bambu", price = 45000.0, stock = 10, img = "dummy_product"),
        Product(id = 15, category_id = 3, category = categories[2], name = "Ukir Kayu", description = "Hiasan Dinding", price = 120000.0, stock = 4, img = "dummy_product")
    )
}