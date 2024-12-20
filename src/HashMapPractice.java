import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class HashMapPractice {
    public static int[][] highFive(int[][] items) {
        HashMap<Integer, List<Integer>> scoremap = new HashMap<>();
        List<List<Integer>> output = new ArrayList<>();

        for(int i = 0;i<items.length;i++){
            int[] item = items[i];
            int index = item[0];
            int score = item[1];
            List<Integer> scorelist = null;
            if(!scoremap.containsKey(index)){
                scorelist  = new ArrayList<>();
                scorelist.add(score);
                scoremap.put(index, scorelist);
            } else {
                scorelist = scoremap.get(index);
                scorelist.add(score);
                scoremap.put(index, scorelist);
            }

        }
        for(int key : scoremap.keySet()){

            List<Integer> avgscore = new ArrayList<>();
            System.out.print("key " + key);
            int sum = 0;
            int average = 0;
            List<Integer> list = scoremap.get(key);
            list.sort(Comparator.reverseOrder());
            for(int i = 0;i<list.size();i++){

                sum = sum + list.get(i);
                if(i == 4){
                    average = sum/5;
                    System.out.println("average " + average);
                    break;
                }
            }
            avgscore.add(key);
            avgscore.add(average);
            output.add(avgscore);
            System.out.println();
        }

        int rows = output.size();
        int cols = output.get(0).size();

        int[][] highfiveArray = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                highfiveArray[i][j] = output.get(i).get(j);
            }
        }
        return highfiveArray;

    }

    public static String getHint (String secret, String guess)
    {
        String hint = "xAyB";
        int bulls = 0;
        int cows = 0;
        HashMap<Integer, Character> secretmap = new HashMap<>();
        for(int i = 0;i<secret.length();i++){
            secretmap.put(i, secret.charAt(i));
        }
        for(int j = 0;j<guess.length();j++){
            if(guess.charAt(j) == secretmap.get(j)){
                bulls++;
            } else {
                if(secretmap.containsValue(guess.charAt(j))){
                    cows++;
                }
            }

        }

        System.out.println("bulls " + bulls);
        System.out.println("cows " + cows);

        return bulls +"A" + cows + "B";
    }
}
