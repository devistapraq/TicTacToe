package com.example.tictactoe

import android.graphics.Color.blue
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

    fun buClick(view: View) {
        val buSelected = view as Button
        var celId =0
        when (buSelected.id){
            R.id.bu1 ->celId =1
            R.id.bu2 ->celId =2
            R.id.bu3 ->celId =3
            R.id.bu4 ->celId =4
            R.id.bu5 ->celId =5
            R.id.bu6 ->celId =6
            R.id.bu7 ->celId =7
            R.id.bu8 ->celId =8
            R.id.bu9 ->celId =9



        }
//        Log.d("buClick : celId",celId.toString())
        playGame(celId,buSelected)
    }
    fun playGame(celId :Int ,buSelected:Button) {
        var activePlayer=1
        var player1 =ArrayList<Int>()
        var player2 =ArrayList<Int>()

        if (activePlayer==1){
            buSelected.text="X"
            buSelected.setBackgroundResource(R.color.blue)
            player1.add(celId)
            activePlayer=2


        }else{
            buSelected.text="O"
            buSelected.setBackgroundResource(R.color.green)
            player2.add(celId)
            activePlayer =1
        }
//        buSelected.isEnabled=false
        
    fun  checkWinner() {
        var winer =-1

        //row 1
        if ( player1.contains(1)&&player1.contains(1)&&player1.contains(3)){
            winer=1}
        if ( player2.contains(1)&&player2.contains(1)&&player2.contains(3)){
            winer=2}



        //row 2
        if ( player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winer=1}
        if ( player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winer=2}

        //row 3
        if ( player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winer=1}
        if ( player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winer=2}


        //col 1
        if ( player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winer=1}
        if ( player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winer=2}

        //col 2
        if ( player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winer=1}
        if ( player2.contains(1)&&player2.contains(5)&&player2.contains(8)){
            winer=2}
        //col 1
        if ( player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winer=1}
        if ( player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winer=2}


        if (winer==1){
            Toast.makeText( this," Player 1 win the game " ,Toast.LENGTH_LONG).show()
        }
        else if (winer ==2 ){
            Toast.makeText( this," Player 2 win the game " ,Toast.LENGTH_LONG).show()


        }
    }

}
}
