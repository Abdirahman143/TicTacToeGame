package com.madoobe142.tictactoeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun butClick(view:View)
    {
        val butSelected:Button = view as Button
        var CellID = 0
        when(butSelected.id)
        {
            R.id.but1-> CellID=1
            R.id.but2-> CellID=2
            R.id.but3-> CellID=3
            R.id.but4-> CellID=4
            R.id.but5-> CellID=5
            R.id.but6-> CellID=6
            R.id.but7-> CellID=7
            R.id.but8-> CellID=8
            R.id.but9-> CellID=9



        }
       // Log.d("Click Button : " , butSelected.id.toString())
       // Log.d("butClick CellID: " ,CellID.toString())
        playGame(CellID, butSelected)



    }
    var ActivePlayer = 1;
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    fun playGame(CellID:Int ,butSelected:Button ) {
        if(ActivePlayer==1)
        {
            butSelected.text = "X"
            butSelected.setBackgroundResource(R.color.blue)
            player1.add(CellID)
            ActivePlayer =2
        }
        else
        {
            butSelected.text = "0"
            butSelected.setBackgroundResource(R.color.darkGreen)
            player2.add(CellID)
            ActivePlayer=1



        }

        butSelected.isEnabled = false
        checkWinner()


    }


     fun checkWinner()
     {

         var winner = -1
         //row 1

         if(player1.contains(1) && player1.contains(1) && player1.contains(3)){
             winner = 1
         }
         if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
             winner = 1
         }

         //row2
         if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
             winner = 1
         }
         if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
             winner = 1
         }

         //row 3

         if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
             winner = 1
         }
         if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
             winner = 1
         }

         // CoL1

         if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
             winner = 1
         }
         if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
             winner = 1
         }

         // COL2

         if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
             winner = 1
         }
         if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
             winner = 1
         }


         // COL3

         if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
             winner = 1
         }
         if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
             winner = 1
         }


         if(winner==1)
         {
             Toast.makeText(this, "Player 1 win the game " , Toast.LENGTH_LONG).show()
         }else if(winner==2){
             Toast.makeText(this,"Player 2 win the game : ", Toast.LENGTH_LONG).show()
         }
     }


}
