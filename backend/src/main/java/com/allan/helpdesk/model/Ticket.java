package com.allan.helpdesk.model;

public class Ticket {
    private Long id;
    private Boolean Diduturnoffnon;
    private String Tittle;
    private String Status;
    private String Description;

    public Ticket (){

    }
    public Ticket (Long id, Boolean Diduturnoffnon, String tittle, String status, String description ) {
        this.id = id;
        this.Diduturnoffnon = Diduturnoffnon;
        this.Tittle = tittle;
        this.Status = status;
        this.Description = Description;
    }
    public Long getid (){
        return id;
    }
    public void setid(Long id){
        this.id = id;
    }
    public Boolean getDiduturnoffnon(){
        return Diduturnoffnon;
    }

    public void setDiduturnoffnon(Boolean diduturnoffnon) {
        Diduturnoffnon = diduturnoffnon;
    }
    public String getTittle(){
        return Tittle;
    }
    public void setTittle(String Tittle){
        this.Tittle = Tittle;
    }
    public String getStatus (){
        return Status;
    }
    public void setStatus(String Status){
        this.Status = Status;
    }
    public String getDescription(){
        return Description;
    }
    public void setDescription(){
        this.Description = Description;
    }
}

