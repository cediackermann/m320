package silviobraendle.trapping_rain_water_ii;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] heightMap = {
                { 122, 120, 51, 39, 14, 63, 28, 100, 84, 37, 56, 19, 127, 93, 58, 16, 97, 78, 46, 31 },
                { 91, 14, 51, 35, 75, 47, 30, 83, 124, 100, 8, 81, 78, 53, 28, 115, 111, 150, 80, 83 },
                { 69, 135, 31, 76, 35, 111, 70, 75, 47, 49, 74, 126, 111, 4, 83, 17, 111, 74, 108, 141 },
                { 56, 35, 144, 42, 62, 64, 22, 46, 109, 123, 115, 32, 96, 133, 71, 67, 136, 83, 48, 115 },
                { 30, 31, 66, 14, 105, 116, 31, 148, 77, 94, 126, 111, 87, 140, 124, 25, 21, 84, 38, 49 },
                { 84, 72, 128, 120, 54, 78, 67, 121, 138, 85, 63, 8, 144, 138, 68, 119, 123, 27, 6, 128 },
                { 119, 4, 3, 118, 31, 68, 86, 32, 68, 42, 101, 72, 14, 121, 61, 133, 78, 95, 6, 15 },
                { 99, 113, 31, 74, 119, 35, 133, 41, 43, 48, 100, 27, 45, 81, 114, 141, 128, 64, 91, 36 },
                { 61, 91, 130, 133, 130, 91, 127, 52, 33, 41, 46, 88, 55, 71, 77, 45, 92, 49, 94, 9 },
                { 65, 94, 148, 49, 36, 24, 89, 73, 15, 98, 104, 69, 42, 75, 49, 26, 98, 144, 82, 132 },
                { 26, 79, 22, 45, 13, 138, 61, 126, 128, 25, 19, 25, 136, 50, 83, 145, 34, 72, 60, 25 },
                { 35, 4, 39, 104, 63, 61, 62, 20, 53, 138, 24, 107, 138, 134, 0, 27, 53, 13, 40, 83 },
                { 36, 83, 15, 117, 81, 101, 32, 95, 1, 44, 0, 141, 89, 14, 128, 68, 95, 2, 15, 133 },
                { 108, 85, 57, 58, 19, 68, 141, 132, 100, 78, 101, 86, 135, 91, 15, 36, 94, 71, 139, 115 },
                { 9, 107, 26, 13, 93, 147, 119, 124, 123, 45, 68, 53, 140, 87, 135, 34, 45, 120, 36, 127 },
                { 44, 36, 38, 147, 48, 10, 60, 32, 51, 6, 78, 137, 1, 130, 132, 80, 17, 132, 12, 41 },
                { 52, 77, 7, 135, 107, 134, 26, 150, 95, 76, 95, 52, 74, 23, 50, 72, 110, 4, 1, 62 },
                { 73, 66, 132, 88, 147, 74, 51, 146, 84, 73, 87, 94, 58, 120, 52, 0, 58, 10, 41, 59 },
                { 60, 18, 49, 101, 7, 2, 80, 147, 101, 26, 3, 9, 4, 13, 118, 54, 50, 106, 1, 75 },
                { 77, 98, 112, 92, 55, 3, 66, 133, 18, 39, 83, 117, 12, 131, 28, 4, 116, 101, 22, 70 },
        };
        int answer = solution.trapRainWater(heightMap);
        System.out.println(answer);
    }
}