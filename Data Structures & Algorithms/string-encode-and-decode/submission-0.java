class Solution {

    public String encode(List<String> strs) {
        if(strs == null || strs.isEmpty()) {
            return "";
        }
        StringBuilder encodedBuilder = new StringBuilder();
        for(String str : strs) {
            encodedBuilder.append(str.length()).append("#").append(str);
        }
        return encodedBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        if(str == null || str.isEmpty()) {
            return decodedList;
        }
        int position = 0;
        while (position < str.length()) { 
            int delimiterPosition = str.indexOf("#",position);
            int length = Integer.parseInt(str.substring(position, delimiterPosition));
            position = delimiterPosition + 1;
            decodedList.add(str.substring(position, position + length));
            position += length;
        }
        return decodedList;
    }
}
