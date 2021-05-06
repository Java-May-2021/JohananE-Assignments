public class StringManipulator{
    public String trimAndConcat(String firstMessage, String secondMessage){
        return firstMessage.trim().concat(secondMessage.trim());
    }
    public Integer getIndexOrNull(String firstMessage, char x ){
        if(firstMessage.indexOf(x) == -1){
            return null;
        }
        return firstMessage.indexOf(x);
    }
    public Integer getIndexOrNull(String startMessage, String subMessage){
        if(startMessage.indexOf(subMessage)== -1){
            return null;
        }
        return startMessage.indexOf(subMessage);
    }
    public String concatSubstring(String start, int beginIndex, int endIndex, String end){
        String main = start.substring(beginIndex, endIndex);
        return main.concat(end);
    }
}
