class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            map.putIfAbsent(c,0);
            map.put(c,map.get(c)+1);
        }
        for (char c:t.toCharArray()) {
            if(map.containsKey(c)&&map.get(c)>0){
                int cnt = map.get(c);
                if(cnt==1){
                    map.remove(c);
                }else
                map.put(c, cnt -1);
            }else return false;
        }
        return map.isEmpty();
    }
}
