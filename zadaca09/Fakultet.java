package zadaca09;

public class Fakultet {
private String ime;
private int brSmerovi,studenti;

public Fakultet(String ime, int brSmerovi, int studenti) {
	this.ime=ime;
	this.brSmerovi=brSmerovi;
	this.studenti=studenti;
}

public String getIme() {
	return ime;
}

public int getSmerovi() {
	return brSmerovi;
}

public int getStudenti() {
	return studenti;
}
}
