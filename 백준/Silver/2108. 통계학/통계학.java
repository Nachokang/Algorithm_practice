import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int N;
    static int[] numbers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];

        for(int i=0; i<N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        double mean = 0;
        int median = 0;
        int mode = 0;
        int range = 0;

        Arrays.sort(numbers);

        mean = findMean(numbers);
        median = numbers[N/2];
        mode = findMode(numbers);
        range = findRange(numbers);

        System.out.println(Math.round(mean));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }

    static double findMean(int[] numbers) {
        int mean = 0;
        for(int n : numbers) {
            mean += n;
        }
        return mean/(double)N;
    }

    static int findMode(int[] numbers) {
        Map<Integer, Integer> modeMap = new HashMap<>();
        for(int n : numbers) {
            modeMap.put(n, modeMap.getOrDefault(n, 0) + 1);
        }

        int maxMode = Collections.max(modeMap.values());
        List<Integer> modes = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : modeMap.entrySet()) {
            if(entry.getValue() == maxMode) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);
        if(modes.size() > 1) {
            return modes.get(1);
        }
        else {
            return modes.get(0);
        }
    }

    static int findRange(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for(int n : numbers) {
            max = Math.max(max, n);
        }
        int min = Integer.MAX_VALUE;
        for(int n : numbers) {
            min = Math.min(min, n);
        }
        return max - min;
    }
}