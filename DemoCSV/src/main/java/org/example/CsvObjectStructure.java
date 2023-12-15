package org.example;



public class CsvObjectStructure {
    private  int id;
    private String ideaName;
    private String ideaDesc;
    private int voteCount;
    private String topic1;
    private String topic2;
    private String topic3;
    private String status;
    private String authorsName;
    private String authorsEmail;

    public CsvObjectStructure(){

    }
    public CsvObjectStructure(
            int id,
            String ideaName,
            String ideaDesc,
            int voteCount,
            String topic1,
            String topic2,
            String topic3,
            String status,
            String authorsName,
            String authorsEmail
            )
    {
        this.id = id;
        this.ideaName= ideaName;
        this.ideaDesc = ideaDesc;
        this.voteCount = voteCount;
        this.topic1 = topic1;
        this.topic2 = topic2;
        this.topic3 = topic3;
        this.status = status;
        this.authorsName = authorsName;
        this.authorsEmail = authorsEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdeaName(){
        return ideaName;
    }

    public void setIdeaName(String ideaName){
        this.ideaName = this.ideaName;
    }
    public String getIdeaDesc(){
        return ideaDesc;
    }

    public void setIdeaDesc(String ideaDesc){
        this.ideaDesc = this.ideaDesc;
    }

    public Integer getVoteCount(){
        return voteCount;
    }

    public void setVoteCount(String voteCount){
        this.voteCount = this.voteCount;
    }

    public String getTopic1(){
        return topic1;
    }

    public void setTopic1(String topic1){
        this.topic1 = this.topic1;
    }
    public String getTopic2(){
        return topic2;
    }

    public void setTopic2(){
        this.topic2 = topic2;
    }

    public String getTopic3(){
        return topic3;
    }

    public void setTopic3(){
        this.topic3 = topic3;
    }

    public String getStatus(){
        return status;
    }
    public  void setStatus(){
        this.status = status;
    }
    public String getAuthorsName(){
        return authorsName;
    }
    public void setAuthorsName(){
        this.authorsName = authorsName;
    }

    public String getAuthorsEmail(){
        return authorsEmail;
    }

    public void  setAuthorsEmail(){
        this.authorsEmail = authorsEmail;
    }

}