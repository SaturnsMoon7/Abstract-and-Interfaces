package Piece;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Practice Problem #1");
        System.out.println();

        King newKing = new King();
        newKing.move();
        System.out.println("Position of the king is: " + newKing.getPosition());

        System.out.println();

        Queen newQueen = new Queen();
        newQueen.move();

        System.out.println();

        Pawn newPawn = new Pawn();
        newPawn.move();
        
        System.out.println();
    }
}