import java.util.Arrays;

public class SuccessfullPairOfSpells {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        int max = 0;
        for (int i = 0; i < potions.length; i++) {
            if (max < potions[i]) {
                max = potions[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < potions.length; i++) {
            count[potions[i]]++;
        }
        int sum = 0;
        for (int i = max; i >= 0; i--) {
            sum += count[i];
            count[i] = sum;
        }

        for (int i = 0; i < spells.length; ++i) {
            int spell = spells[i];
            long thres = (success + spell - 1) / spell;
            if (thres <= max) {
                res[i] = count[(int) thres];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        SuccessfullPairOfSpells s = new SuccessfullPairOfSpells();
        int[] res = s.successfulPairs(spells,potions,7);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}
