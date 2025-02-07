import java.util.PriorityQueue;

public class TotalCostToHire {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        int frontIndex = 0;
        int backIndex = costs.length - 1;

        long res = 0;
        while (k-- > 0) {
            while (pq1.size() < candidates && frontIndex <= backIndex)
                pq1.add(costs[frontIndex++]);
            while (pq2.size() < candidates && frontIndex <= backIndex)
                pq2.add(costs[backIndex--]);

            Integer frontPeek = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            Integer backPeek = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;
            if (frontPeek <= backPeek)
                res += pq1.remove();
            else if (frontPeek > backPeek)
                res += pq2.remove();
        }
        return res;
    }
}
