public class ReverseWords {
    public String reverseWords(String s) {
        String rever ="";
        if ("".equals(s)){
            return rever;
        }
        String[] set = s.trim().split("\\s+");
        if(set.length>0){
            for(int i=set.length-1;i>0;i--){
                rever += set[i]+" ";
            }
            rever += set[0];
        }
        return rever;
    }
}
