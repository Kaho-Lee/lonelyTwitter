package ca.ualberta.cs.lonelytwitter;

public class importantTweet extends Tweet {

    public void importantTweet(String message){
        this.message = message;
    }

    public void setMessage(String firstMessage, String secondMessage){

        message = firstMessage;
        message2 = secondMessage;


    }

//    @Override
    public String getSomeThing() {

        return null;
    }

    public int isImportant(){
        return 1;
    }
}
