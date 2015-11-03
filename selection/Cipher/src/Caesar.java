import java.util.Scanner;
/* The Caesar cipher is one of the earliest known and simplest ciphers. 
 * It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a 
 * certain number of places down the alphabet.
 */
public class Caesar {

	public static void main(String[] args) {
		
		// Declaring data needed at top... this is good housekeeping!
		String message, encryptedMessage = "";
		int shift; //how many numbers to shift by 
		
		// Get info needed from the user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a word to encrypt: ");
		message = keyboard.next().toLowerCase(); // there is no getChar() method... so we improvise!
		System.out.println("You entered" + message);
		
		System.out.print("Enter shift number between -26 & 26, not zero: ");
		shift = keyboard.nextInt();
		
		while(shift > 26 || shift < -26 || shift == 0){
			System.out.print("Invalid entry: Enter shift number between -26 & 26, not zero: ");
			shift = keyboard.nextInt();
		}
		
		
		int count;
		while(count < message.length()){
			// encrypt the character by applying the shift
			char letter = message.charAt(count);
			if (letter + shift > 122)
				encryptedMessage = (String)(letter + shift - 26);
			else if(letter + shift < 97
					)
				encryptedMessage = (String)(letter + shift + 26);
			else
				encryptedMessage = (char)(letter + shift);
			count++;
			
			System.out.println("Your encrypted message is: " + encryptedMessage);
			keyboard.close();
		}

}
