public class PracticeProblem {

public static void main(String args[]) {
}
    
public static void insertionSort(char[] characters) {
        for (int x = 1; x < characters.length; x++) {
        char key = characters[x];  
        int y = x - 1;
	while (y >= 0 && characters[y] > key) {
        characters[y + 1] = characters[y];
        y = y - 1;
		}
	characters[y + 1] = key;
        }
    }
}
