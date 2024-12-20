import java.util.*;

public class LeetCodePracticeHashTable {

    //O(N) time complexity and O(N) space
    public int[] twoSumUsingHashTable(int[] numsArray, int targetSum) {
        Map<Integer, Integer> twoSumMap = new HashMap<>();
        int[] indices = new int[2];
        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray[i] <= targetSum) {
                if (twoSumMap.get(targetSum - numsArray[i]) == null) {
                    twoSumMap.put(numsArray[i], i);
                } else {
                    int j = twoSumMap.get(targetSum - numsArray[i]);
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    //O(N) time complexity and O(N) space
    public boolean containsDuplicates(Integer[] inputArray) {
        Map<Integer, Integer> duplicateMap = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (duplicateMap.containsKey(inputArray[i])) {
                return true;
            } else {
                duplicateMap.put(inputArray[i], 1);
            }
        }
        return false;
    }

    // the letters in s1 and s2 should be same. The words can be jumbled.
    // The frequency of each letter in both words should be the same
    //O(N) time complexity and O(N) space
    public boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            s1Map.put(s1.charAt(i), i);
            s2Map.put(s2.charAt(i), i);
        }
        for (int i = 0; i < s1.length(); i++) {
            if (!s2Map.containsKey(s1.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram1(String s1, String s2) {
        char[] s2array = s2.toCharArray();
        char[] s1array = s1.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s2array);
        return Arrays.equals(s1array, s2array);
    }

    // sorting - o(nlogn)
    // two loops o(n2)
    // o(nlogn) + o(n2)
    public List<List<Integer>> threeSum(Integer[] inputArray, Integer targetSum) {
        Map<Integer, Integer> threeSumSet;
        List<Map<Integer, Integer>> threeSumlist = new ArrayList<>();
        Integer fast, slow;
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 1; i++) {
            Integer desiredSum = targetSum - inputArray[i];
            fast = i + 1;
            slow = inputArray.length - 1;
            while (fast != slow) {
                Integer sum = inputArray[i] + inputArray[fast] + inputArray[slow];
                if (sum == targetSum) {
                    threeSumSet = new HashMap<>();
                    threeSumSet.put(i, inputArray[i]);
                    threeSumSet.put(fast, inputArray[fast]);
                    threeSumSet.put(slow, inputArray[slow]);
                    threeSumlist.add(threeSumSet);
                    fast = fast + 1;
                } else if (inputArray[fast] + inputArray[slow] > desiredSum) {
                    slow = slow - 1;
                } else if (inputArray[fast] + inputArray[slow] <= desiredSum) {
                    fast = fast + 1;
                }
            }
            if (inputArray[i] == inputArray[i + 1]) {
                i = i + 1;
            }
        }
        ListIterator<Map<Integer, Integer>> L = threeSumlist.listIterator();
        for (int i = 0; i < threeSumlist.size(); i++) {
            Map<Integer, Integer> threesumSet = threeSumlist.get(i);
            for (Integer val : threesumSet.values()) {
                System.out.print(" set elements are " + val + " ");
            }
        }
        return null;
    }

    // o(nlogn)+o(n2) - non optimized solution
    public int findLongestConsecutiveSeq(int[] inputArray) {
        Arrays.sort(inputArray);
        int count = 1, maxcount = 1;
        for (int j = 0; j < inputArray.length - 1; j++) {
            if (inputArray[j + 1] == inputArray[j] + 1) {
                count++;
            } else {
                if (count > maxcount) {
                    maxcount = count;
                    count = 1;
                }
            }
            if (j + 1 == inputArray.length - 1) {
                if (count > maxcount) {
                    maxcount = count;
                }
            }
        }
        return maxcount;
    }

    //0(n) optimized
    public int findLongestConsecutiveSeq1(int[] inputArray) {
        Map<Integer, Integer> inputMap = new HashMap<>();
        int count = 0;
        int maxcount = 1;
        int searchindex = 0;
        boolean beforeFlag = true;
        boolean afterFlag = true;
        for (int i = 0; i < inputArray.length; i++) {
            inputMap.put(i, inputArray[i]);
        }
        int currentvalue = inputArray[0];
        if (inputMap.containsValue(currentvalue)) {
            afterFlag = true;
            beforeFlag = true;
            searchindex = 0;
            count++;
        }

        for (int j = 0; j < inputArray.length; j++) {
            if (inputMap.containsValue(currentvalue - 1) && beforeFlag) {
                afterFlag = false;
                beforeFlag = true;
                currentvalue = currentvalue - 1;
                count++;
                for (Map.Entry<Integer, Integer> entry : inputMap.entrySet()) {
                    if (entry.getValue().equals(currentvalue)) {
                        searchindex = entry.getKey();
                    }
                }
            } else if (inputMap.containsValue(currentvalue + 1) && afterFlag) {
                count++;
                afterFlag = true;
                beforeFlag = false;
                currentvalue = currentvalue + 1;
                for (Map.Entry<Integer, Integer> entry : inputMap.entrySet()) {
                    if (entry.getValue().equals(currentvalue)) {
                        searchindex = entry.getKey();
                    }
                }
            } else {
                if (count > maxcount) {
                    maxcount = count;
                    count = 1;
                }
                beforeFlag = true;
                afterFlag = true;
                if (j + 1 != inputArray.length) {
                    searchindex = j + 1;
                }
                currentvalue = inputArray[searchindex];
                if (inputMap.containsValue(currentvalue)) {
                    afterFlag = true;
                    beforeFlag = true;
                }
            }
            if (j + 1 == inputArray.length - 1) {
                if (count > maxcount) {
                    maxcount = count;
                }
            }
        }
        return maxcount;
    }

    // optimized o(n) time space complexity O(1) space
    // if an element is not negative or 0 or not greater than length of the array, find its correct spot
    //eg array index starts from 0. At 0, 1 should be present, at index 1, 2 should be present.
    // at ith index i+1 should be present
    // first iteration arrange all the numbers at the correct position. once you swap the new position contains correct number.
    // the current position which got swapped by a new number may not have that number in its correct indes so once again check and swap
    // second iteration find the number which is not at the correct spot.
    public int firstMissingPositive(int[] inputArray) {
        int length = inputArray.length;
        int min = inputArray[0];
        int firstMissingPositive = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
            if (min > 1) {
                firstMissingPositive = 1;
                break;
            }
        }
        int temp;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0 && inputArray[i] <= length && inputArray[i] > 0) {
                if (inputArray[i] != i + 1) {
                    temp = inputArray[inputArray[i] - 1];
                    inputArray[inputArray[i] - 1] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
            printArray(inputArray);
            if (inputArray[i] != 0 && inputArray[i] <= length && inputArray[i] > 0) {
                if (inputArray[i] != i + 1) {
                    temp = inputArray[inputArray[i] - 1];
                    inputArray[inputArray[i] - 1] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] != i + 1) {
                    firstMissingPositive = i + 1;
                    break;
                }
        }
        System.out.println("first missing positive " + firstMissingPositive);
        return firstMissingPositive;
    }

    private void printArray(int[] inputArray) {
        for(int k =0;k<inputArray.length;k++){
            System.out.print( inputArray[k]+" ");
        }
    }
}
