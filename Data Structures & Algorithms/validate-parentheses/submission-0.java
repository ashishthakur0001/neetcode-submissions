class Solution {
    public boolean isValid(String str) {
        while(str.contains("()")|| str.contains("{}")|| str.contains("[]")) {
            str=str.replace("()","");
        str=str.replace("{}","");
            str=str.replace("[]","");
        }
        return str.isEmpty();
        
    }
}
