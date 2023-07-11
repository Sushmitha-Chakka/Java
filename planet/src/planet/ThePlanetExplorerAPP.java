package planet;
import java.util.Scanner;
public class ThePlanetExplorerAPP {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			double radius=scan.nextDouble();
			ThePlanetExplorer explorer=new ThePlanetExplorer();
			System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
			scan.close();
		}
}
