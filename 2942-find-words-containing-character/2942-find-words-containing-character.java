class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;

        for (String word : words) {
            if (word.contains(""+x)) {
                list.addLast(index);
            }
                
            index++;
        }

        return list;
    }
}