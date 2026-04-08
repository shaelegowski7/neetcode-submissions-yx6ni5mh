class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            anagrams.putIfAbsent(sortedS, new ArrayList<>());
            anagrams.get(sortedS).add(s);
        }
        return new ArrayList<>(anagrams.values());
        }
    }

