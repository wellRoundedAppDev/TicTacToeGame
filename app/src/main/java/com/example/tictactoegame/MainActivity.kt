package com.example.tictactoegame
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.tictactoegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var player1 : String = ""
    var player2: String = ""
    var isItPlayerOneTurn = true
    var numberOfClicks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun playGameButton(view: View) {

        player1 = binding.editTextPlayerName1.text.toString()
        player2 = binding.editTextPlayerName2.text.toString()
        view.isClickable = false
        binding.gameGrid.visibility = View.VISIBLE
    }

    fun gameplayButton(view: View) {

        view.isClickable = false
        numberOfClicks++
        printPlayerNameOnButton(view)
        determineWinner()

    }

    fun printPlayerNameOnButton(view: View){

        if(isItPlayerOneTurn){

            when (view.id) {
                R.id.button1 -> {
                    binding.button1.text = player1
                }
                R.id.button2 -> {
                    binding.button2.text = player1
                }
                R.id.button3 -> {
                    binding.button3.text = player1
                }
                R.id.button4 -> {
                    binding.button4.text = player1
                }
                R.id.button5 -> {
                    binding.button5.text = player1
                }
                R.id.button6 -> {
                    binding.button6.text = player1
                }
                R.id.button7 -> {
                    binding.button7.text = player1
                }
                R.id.button8 -> {
                    binding.button8.text = player1
                }
                R.id.button9 -> {
                    binding.button9.text = player1
                }
            }

        }
        else{

            when (view.id) {
                R.id.button1 -> {
                    binding.button1.text = player2
                }
                R.id.button2 -> {
                    binding.button2.text = player2
                }
                R.id.button3 -> {
                    binding.button3.text = player2
                }
                R.id.button4 -> {
                    binding.button4.text = player2
                }
                R.id.button5 -> {
                    binding.button5.text = player2
                }
                R.id.button6 -> {
                    binding.button6.text = player2
                }
                R.id.button7 -> {
                    binding.button7.text = player2
                }
                R.id.button8 -> {
                    binding.button8.text = player2
                }
                R.id.button9 -> {
                    binding.button9.text = player2
                }
            }

        }
    }

    fun determineWinner(){

        if(isItPlayerOneTurn) {

            isItPlayerOneTurn = false

            if ((binding.button1.text == player1) && (binding.button2.text == player1) && (binding.button3.text == player1)) {
                Toast.makeText(this, player1 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button1.text == player1) && (binding.button4.text == player1) && (binding.button7.text == player1)) {
                Toast.makeText(this, player1 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button1.text == player1) && (binding.button5.text == player1) && (binding.button9.text == player1)) {
                Toast.makeText(this, player1 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button4.text == player1) && (binding.button5.text == player1) && (binding.button6.text == player1)) {
                Toast.makeText(this, player1 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button7.text == player1) && (binding.button5.text == player1) && (binding.button3.text == player1)) {
                Toast.makeText(this, player1 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button7.text == player1) && (binding.button8.text == player1) && (binding.button9.text == player1)) {
                Toast.makeText(this, player1 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button2.text == player1) && (binding.button5.text == player1) && (binding.button8.text == player1)) {
                Toast.makeText(this, player1 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button3.text == player1) && (binding.button6.text == player1) && (binding.button9.text == player1)) {
                Toast.makeText(this, player1 + " won", Toast.LENGTH_LONG).show();
                finish();
            }
            else if(numberOfClicks == 9) {
                Toast.makeText(this, "draw", Toast.LENGTH_LONG).show();
                finish();
            }

        }
        else if(!isItPlayerOneTurn) {

            isItPlayerOneTurn = true

            if ((binding.button1.text == player2) && (binding.button2.text == player2) && (binding.button3.text == player2)) {
                Toast.makeText(this, player2 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button1.text == player2) && (binding.button4.text == player2) && (binding.button7.text == player2)) {
                Toast.makeText(this, player2 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button1.text == player2) && (binding.button5.text == player2) && (binding.button9.text == player2)) {
                Toast.makeText(this, player2 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button4.text == player2) && (binding.button5.text == player2) && (binding.button6.text == player2)) {
                Toast.makeText(this, player2 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button7.text == player2) && (binding.button5.text == player2) && (binding.button3.text == player2)) {
                Toast.makeText(this, player2 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button7.text == player2) && (binding.button8.text == player2) && (binding.button9.text == player2)) {
                Toast.makeText(this, player2 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button2.text == player2) && (binding.button5.text == player2) && (binding.button8.text == player2)) {
                Toast.makeText(this, player2 + " won", Toast.LENGTH_LONG).show();
                finish();
            } else if ((binding.button3.text == player2) && (binding.button6.text == player2) && (binding.button9.text == player2)) {
                Toast.makeText(this, player2 + " won", Toast.LENGTH_LONG).show();
                finish();
            }
        }

    }




}