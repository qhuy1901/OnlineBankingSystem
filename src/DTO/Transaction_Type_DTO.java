package DTO;

public class Transaction_Type_DTO 
{
    private int id;
    private String name;
    private int fee;

    public Transaction_Type_DTO() {
    }

    public Transaction_Type_DTO(int id, String name, int fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFee() {
        return fee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
