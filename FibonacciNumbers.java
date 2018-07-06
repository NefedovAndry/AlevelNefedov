import java.util.Scanner;

public class FibonacciNumbers {

	public static int fiboNumberCycle(int n){
		int aN1 = 0;
		int aN2 = 1;
		int aN = 0;
		for (int i = 1; i < n; i++){
			aN = aN1 + aN2;
			aN1 = aN2;
			aN2 = aN;
		}
		return aN;
	}
	
	public static int fiboNumberRecursion(int n){
		int result = 0;
		if (n == 1) {
			result = 1;
		} else if (n < 1) {
			result = 0;
		} else {
			result = fiboNumberRecursion(n - 1) + fiboNumberRecursion(n - 2);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("╟Σ≡αΓ±≥Γ≤Θ≥σ! ┼±δΦ ⌡ε≥Φ≥σ ≤τφα≥ⁿ τφα≈σφΦσ ≈Φ±δα ╘Φßεφα≈≈Φ ∩ε σπε ∩ε≡ ΣΩεΓε∞≤ φε∞σ≡≤ ΓσΣΦ≥σ Φ±Ωε∞√Θ φε∞σ≡:");
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		System.out.println(inputNumber <= 0 ? ("├δ≤∩ε!") : ("╚±Ωε∞εσ ≈Φ±δε ╘Φßεφα≈≈Φ: " + fiboNumberCycle(inputNumber)));
		System.out.println("└ ≥σ∩σ≡ⁿ ∩≡εΓσ≡Φ∞ ≡σΩ≤≡±Φ■. ┬ΓσΣΦ ∩ε≡ ΣΩεΓ√Θ φε∞σ≡ ≈Φ±δα ╘Φßεφα≈≈Φ:");
		inputNumber = scan.nextInt();
		System.out.println(inputNumber <= 0 ? ("├δ≤∩ε!") : ("╚±Ωε∞εσ ≈Φ±δε ╘Φßεφα≈≈Φ: " + fiboNumberRecursion(inputNumber)));
	}
	
}
