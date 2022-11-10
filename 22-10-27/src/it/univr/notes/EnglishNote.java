package it.univr.notes;

public class EnglishNote extends Note {
	
	public EnglishNote(int semitone) {
		super(semitone);
	}

	private final static String[] name = {
		"C", "C#", "D", "D#", "E", "F",
		"F#", "G", "G#", "A", "A#", "B"
	};
	
	public String toString() {
		return name[getSemitone()];
	}
	
	
}
