package com.example.tictactoegame
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.tictactoegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var game : Game


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun playGameButton(view: View) {

        val player1 = binding.editTextPlayerName1.text.toString()
        val player2 = binding.editTextPlayerName2.text.toString()

        if(fieldsAreNotEmpty(player1, player2)){
            game = Game(player1, player2, binding)
            view.isClickable = false
            binding.gameGrid.visibility = View.VISIBLE
        }

    }

    private fun fieldsAreNotEmpty(player1: String, player2: String): Boolean {

        if(player1.isEmpty() || player2.isEmpty()){

            Toast.makeText(this, "Fill all fields!!", Toast.LENGTH_LONG).show()
            return false
        }

        return true
    }

    fun gameplayButton(view: View) {

        view.isClickable = false
        game.numberOfClicks++
        printPlayerNameOnButton(view)
        game.determineWinner(applicationContext)
    }

    private fun printPlayerNameOnButton(view: View){

        if(game.isItPlayerOneTurn){

            when (view.id) {
                R.id.button1 -> {
                    binding.button1.text = game.player1
                }
                R.id.button2 -> {
                    binding.button2.text = game.player1
                }
                R.id.button3 -> {
                    binding.button3.text = game.player1
                }
                R.id.button4 -> {
                    binding.button4.text = game.player1
                }
                R.id.button5 -> {
                    binding.button5.text = game.player1
                }
                R.id.button6 -> {
                    binding.button6.text = game.player1
                }
                R.id.button7 -> {
                    binding.button7.text = game.player1
                }
                R.id.button8 -> {
                    binding.button8.text = game.player1
                }
                R.id.button9 -> {
                    binding.button9.text = game.player1
                }
            }

        }
        else{

            when (view.id) {
                R.id.button1 -> {
                    binding.button1.text = game.player2
                }
                R.id.button2 -> {
                    binding.button2.text = game.player2
                }
                R.id.button3 -> {
                    binding.button3.text = game.player2
                }
                R.id.button4 -> {
                    binding.button4.text = game.player2
                }
                R.id.button5 -> {
                    binding.button5.text = game.player2
                }
                R.id.button6 -> {
                    binding.button6.text = game.player2
                }
                R.id.button7 -> {
                    binding.button7.text = game.player2
                }
                R.id.button8 -> {
                    binding.button8.text = game.player2
                }
                R.id.button9 -> {
                    binding.button9.text = game.player2
                }
            }

        }
    }

}




