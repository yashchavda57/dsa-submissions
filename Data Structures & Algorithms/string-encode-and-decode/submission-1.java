class Solution {

    public String encode(List<String> strs) {
        return strs.stream().map(s -> s.length() + "#" + s).collect(Collectors.joining());

    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        int j = i;
        while (str.charAt(j) != '#') j++;      // find the delimiter
        int len = Integer.parseInt(str.substring(i, j));
        result.add(str.substring(j + 1, j + 1 + len));  // exact slice
        i = j + 1 + len;                        // jump past this chunk
    }
    return result;
}
}
