
public class Main {

	public static void main(String[] args) {

		// 2D arrays = = > array of a arrays
		// ex. cars[i][j]

		String[][] cars = new String[3][3];

		cars[0][0] = "camero";
		cars[0][1] = "corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Tesla";
		cars[1][2] = "BMW";
		cars[2][0] = "VW";
		cars[2][1] = "Ferrari";
		cars[2][2] = "Lambo";

		// .length calculates the number of elements in the array
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.println(cars[i][j]);
				// System.out.println();
			}
		}

		// Other way of storing, making 2D arrays

		String[][] food = { { "Pizza", "Burger", "Fish" }, { "fries", "Tomato", "Crisps" },
				{ "Salad", "spaghetti", "Rice" } };
		
		for (int i = 0 ; i < food.length ; i ++) {
			System.out.println();
			for(int j = 0 ; j < food[i].length ; j ++) {
				System.out.println(food[i][j]);
			}
		}

	}

}
