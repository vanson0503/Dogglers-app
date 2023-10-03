package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

object DataSource{
    fun getData():ArrayList<Dog>{
        val dogs = arrayListOf<Dog>()
        dogs.add(Dog(R.drawable.bella,"Bella",2,"Bella"))
        dogs.add(Dog(R.drawable.faye,"Faye",1,"Faye"))
        dogs.add(Dog(R.drawable.frankie,"Frankie",2,"Frankie"))
        dogs.add(Dog(R.drawable.nox,"Nox",4,"Nox"))
        dogs.add(Dog(R.drawable.bella,"Bella",2,"Bella"))
        dogs.add(Dog(R.drawable.faye,"Faye",1,"Faye"))
        dogs.add(Dog(R.drawable.frankie,"Frankie",2,"Frankie"))
        dogs.add(Dog(R.drawable.nox,"Nox",4,"Nox"))


        return dogs
    }
}
