package com.nirflection.tests

// You are building a Music Player app.
// You need to implement the MusicPlayer class,
// which should hold the track names as Strings in an array. The array is already defined in the given code.
// The player should support the following functions:

// add: add the given argument track to the tracks array.
// show: output all track names in the player on separate lines.
// play: start playing the first track by outputting "Playing name" where name is the first track name.
//
// You can add a new item to an array using +=, for example: tracks += track

class MusicPlayer {
    private var songs: Array<String> = arrayOf()

    //your code goes here

    fun add(name:String){
        songs += name
    }
    fun show(){
        songs.forEach(){
                item -> println(item)
        }
    }
    fun play(){

        println("Playing "+ songs[0])
    }
}
fun main(args: Array<String>) {
    val m = MusicPlayer()

    while(true) {
        var input = readLine()!!
        if(input == "stop") {
            break
        }
        m.add(input)
    }
    m.show()
    m.play()
}