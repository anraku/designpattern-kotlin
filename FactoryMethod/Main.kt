package main

import framework.*
import idcard.*

fun main(){
  val factory = IDCardFactory()
  val card1 = factory.create("user1")
  val card2 = factory.create("user2")
  val card3 = factory.create("user3")
  card1.use()
  card1.use()
  card1.use()
}