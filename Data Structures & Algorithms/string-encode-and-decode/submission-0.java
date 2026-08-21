class Solution {

    public String encode(List<String> strs) {
        return strs.stream().map(s -> s.length() + "#" + s).collect(Collectors.joining());

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        char[] sCharArray = str.toCharArray();
        String k = "";
        for(int i=0; i<sCharArray.length; i++){
            
            if (sCharArray[i] == '#'){
                // take next k elements and put it into result
                Integer len = Integer.parseInt(k);
                //skip "#"
                i = i+1;
                //read k next char and add it to result 
                char[] r = new char[len]; 
                for (int j = 0 ; j< len ;j++){
                    r[j]=sCharArray[i];
                    i++;
                }
                i--;
                result.add(new String(r));
                k="";
                continue;
            }
            k = k + sCharArray[i];
        }
        return result;

    }
}
