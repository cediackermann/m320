package silviobraendle.trapping_rain_water_ii;

public class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;

        int maxLevel = findMaxLevel(heightMap);

        int waterSum = 0;

        for (int level = maxLevel; level > 0; level--) {
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                findPath(i, 0, visited, heightMap, level);
                findPath(i, n - 1, visited, heightMap, level);
            }
            for (int j = 1; j < n - 1; j++) {
                findPath(0, j, visited, heightMap, level);
                findPath(m - 1, j, visited, heightMap, level);
            }

            waterSum += sumLevel(heightMap, level, visited);
        }

        return waterSum;
    }

    private int sumLevel(int[][] heightMap, int level, boolean[][] visited) {
        int m = heightMap.length;
        int n = heightMap[0].length;

        int levelSum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) {
                    continue;
                }

                if (heightMap[i][j] >= level) {
                    continue;
                }

                levelSum++;
            }
        }
        
        return levelSum;
    }

    private void findPath(int i, int j, boolean[][] visited, int[][] heightMap, int level) {
        int m = visited.length;
        int n = visited[0].length;

        if (!isInBounds(i, j, m, n)) {
            return;
        }

        if (visited[i][j]) {
            return;
        }

        if (heightMap[i][j] >= level) {
            return;
        }

        visited[i][j] = true;

        findPath(i + 1, j, visited, heightMap, level); // inc i
        findPath(i - 1, j, visited, heightMap, level); // dec i
        findPath(i, j + 1, visited, heightMap, level); // inc j
        findPath(i, j - 1, visited, heightMap, level); // dec j
    }

    private boolean isInBounds(int i, int j, int m, int n) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }

    private int findMaxLevel(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;

        int maxLevel = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = heightMap[i][j];
                if (value > maxLevel) {
                    maxLevel = value;
                }
            }
        }

        return maxLevel;
    }
}
