class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int continuity = 0;
        int maxHealth = health;
        int maxt = attacks[attacks.length - 1][0];

        for (int i = 1; i <= maxt; i++) {
            boolean attacked = false;
            for(int j = 0; j<attacks.length; j++) {
                if(i == attacks[j][0]) {
                    continuity = 0;
                    health -= attacks[j][1];
                    attacked = true;
                }
            }

            if(health<=0) {
                break;
            }

            if(!attacked) {
                continuity++;
                if (health < maxHealth) {
                    health += bandage[1];
                    if (continuity == bandage[0]) {
                        health += bandage[2];
                        continuity = 0;
                    }
                }
                else if(health >= maxHealth) {
                    health = maxHealth;
                }
            }
        }
        if (health <= 0) {
            return -1;
        }
        return health;
    }
}