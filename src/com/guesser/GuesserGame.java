package com.guesser;

import java.util.Scanner;

class Guesser {

	int guessNum;

	int guessingNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser! kindly guess the number");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Player {
	int guessNum;

	int guessingNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player! Kindly Guess the number");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Empire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessingNumber();
	}

	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessingNumber();
		numFromPlayer2 = p2.guessingNumber();
		numFromPlayer3 = p3.guessingNumber();
	}

	void compare() {
		if (numFromGuesser == numFromPlayer1) {

			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("You all are Winner");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player1 and Player2 both are Winner");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player1 and Player3 both are Winner");
			} else {
				System.out.println("Only player1 won the Game");
			}

		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player2 and Player3 both are won the match");
			} else {
				System.out.println("Only Player2 won the match");
			}

		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Only Player3 won the match");
		} else {
			System.out.println("You all Loose your game...Try next time");
		}
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		System.out.println("Game started");

		Empire emp = new Empire();
		emp.collectNumFromGuesser();
		emp.collectNumFromPlayers();
		emp.compare();
	}
}
