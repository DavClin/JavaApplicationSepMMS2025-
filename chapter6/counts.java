// a) Set 10 elements of counts to zero
int[] counts = new int[10];
Arrays.fill(counts, 0);

// b) Add one to each of 15 elements of bonus
int[] bonus = new int[15];
for (int i = 0; i < bonus.length; i++) bonus[i]++;

// c) Display 5 values of bestScores in column format
int[] bestScores = {90, 85, 78, 92, 88};
for (int score : bestScores) System.out.println(score);
