package ru.netology

fun main() {
    val likes: Int = 2291
    val human: String = if (likes === 1 || (likes % 10 === 1 && likes != 11 && likes % 100 != 11) ) "человеку" else "людям"
    println("Понравилось $likes $human")
}