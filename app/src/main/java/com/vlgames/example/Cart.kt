package com.vlgames.example

class Cart {
    var client = ArrayList<Person>()
    var products = ArrayList<Product>()



    val product1 = Product(6.1, "bread", 1561564, "Japan", 5)
    val product2 = Product(8.0, "beer", 1561554, "Israel",2)
    val product3 = Product(16.0, "milk", 1561574, "Japan",7)
    val product4 = Product(20.0, "cookies", 1561564, "Israel",9)
    val product5 = Product(6.0, "water", 1561584, "Japan",4)
    val product6 = Product(3.0, "cola", 1561594, "Israel",1)
    val product7 = Product(8.0, "honey", 1561504, "Japan",6)
    val product8 = Product(11.0, "iceCream", 1561264, "Israel",8)
    val product9 = Product(6.0, "bun", 1561544, "Israel",4)
    var product10 = Product(199.0, "meat", 1567864, "Japan",2)


    fun getProductMadeInIsrael(): ArrayList<Product> {
        val israelProdacts = ArrayList<Product>()

        for (i in 0 until products.size) {
            val products = products[i]
            if (products.madeIn == "Israel") {
                israelProdacts.add(products)
            }
        }

        return israelProdacts
    }

    fun getTotalCost():Double{
        var pCost = ArrayList<Double>()
        var num = 0.0
        for (i in 0 until products.size){
            var coastOfProduct = products[i]
            var amountOfProducts = products[i]
            num = (coastOfProduct.price)*(amountOfProducts.amountOfProduct)
        }
            return num
    }

    fun getTotalItems():Int{
        var pItem = ArrayList<Int>()
        var sum = 0
        for (i in 0 until products.size){
            var product = products[i]
            sum = sum+product.amountOfProduct
        }
            return  sum
    }

}