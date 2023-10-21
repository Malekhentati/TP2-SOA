package service;

public class Compte {

	   private int code;
	    private int solde;
	    private String dateCreation;

	    public Compte(int code, double d, String dateCreation) {
	        super();
	        this.code = code;
	        this.solde = (int) d;
	        this.dateCreation = dateCreation;
	    }

	    public int getCode() {
	        return code;
	    }

	    public void setCode(int code) {
	        this.code = code;
	    }

	    public int getSolde() {
	        return solde;
	    }

	    public void setSolde(int solde) {
	        this.solde = solde;
	    }

	    public String getDateCreation() {
	        return dateCreation;
	    }

	    public void setDateCreation(String dateCreation) {
	        this.dateCreation = dateCreation;
	    }
}
