import java.util.HashMap;

public class SlidingWindow {
    // minimum window substring sliding window
    public static String minWindow(String s, String t) {
        if(t.length() == 0) {
            return null;
        }
        int left = 0;
        HashMap<Character, Integer> mapreq = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(char c : t.toCharArray()){
            mapreq.put(c, mapreq.getOrDefault(c, 0) + 1);
        }
        int minlength = Integer.MAX_VALUE;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for(char c : mapreq.keySet()){
            System.out.println("key " + c + "" + "value " + mapreq.get(c));
        }
        int required = mapreq.size();
        int current = 0;
        System.out.println("required " + required);
        for(int right = 0;right < s.length();right++){
            char c = s.charAt(right);
            if(mapreq.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c) == mapreq.get(c)){
                    current++;
                }

                while(current == required){
                    result[0] = left;
                    result[1] = right;
                    if(minlength > right-left+1){
                        minlength = right-left+1;
                    }

                    if(window.containsKey(s.charAt(left))){
                        window.put(s.charAt(left), window.get(s.charAt(left)) -1);
                        if(window.get(s.charAt(left)) < mapreq.get(s.charAt(left))){
                            current--;
                        }
                    }
                    left++;

                }
            }

        }
        return s.substring(result[0], result[1]+1);
    }
}
