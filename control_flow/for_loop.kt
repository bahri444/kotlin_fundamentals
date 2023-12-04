fun main(){
    val mybilanagan = 1.rangeTo(12) step 2
    mybilanagan.forEachIndexed{index, nilai
        ->println("index ke - $index, nilainya adalah = $nilai")
    }

    // jika tidak ingin menggunakan nilai dari variabel maka deklarasikan dengan underscore ( _ )
    val myBilanganDua = 1.rangeTo(12) step 2
    myBilanganDua.forEachIndexed{index, _
        ->println("index ke - $index .")
    }
}