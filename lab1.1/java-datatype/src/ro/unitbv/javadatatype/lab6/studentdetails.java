package ro.unitbv.javadatatype.lab6;

import java.awt.geom.Arc2D.Double;
import java.util.ArrayList;



public class studentdetails {
	private String nume, prenume;
	private double noterom;
	private double notemate;

	public studentdetails(String nume, String prenume, double noterom, double notemate) {
		this.nume = nume;
		this.prenume = prenume;
		this.notemate= notemate;
		this.noterom = noterom;

	}

	public void setNoterom(double noterom) {
		this.noterom = noterom;
	}

	public void setNotemate(double notemate) {
		this.notemate = notemate;
	}
	@Override
	public String toString() {
		return "Nume:" + nume + ", Prenume: " + prenume + ", noteromana:[" + noterom + "] ,notemate:[" + notemate + "]";
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public double getNoterom() {
		return noterom;
	}

	public double getNotemate() {
		return noterom;

	}

}
