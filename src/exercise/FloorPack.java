package exercise;

public class FloorPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(canPack(1, 0, 4));
//		System.out.println(canPack(1, 0, 5));
//		System.out.println(canPack(0, 5, 4));
//		System.out.println(canPack(2, 2, 11));
//		System.out.println(canPack(1, 0, 6));
		System.out.println(canPack(2, 1, 5));

	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
			int packBig = bigCount * 5;
			int packSmall = smallCount * 1;
			if (packBig + packSmall == goal)
				return true;
			else {
				for (int i = 0; i <= bigCount; i++) {
					for (int j = 0; j <= smallCount; j++) {
						if ((i * 5) + (j * 1) == goal) {
							return true;
						}
					}
				}

			}
		}

		return false;

	}

}
