class Solution {

    public String encode(List<String> strs) {
        return strs.stream().map(s -> s.length() + "#" + s).collect(Collectors.joining());

    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i=0;
    while ( i < str.length()){
        int j = i;
        while (str.charAt(j) != '#') j++;
        int len = Integer.parseInt(str.substring(i,j));
        result.add(str.substring(j+1, j+1+len));
        i = j+1+len;
    }
    return result;
}
}
