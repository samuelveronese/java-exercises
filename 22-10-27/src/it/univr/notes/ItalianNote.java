package it.univr.notes;

public class ItalianNote extends Note {
	
	public ItalianNote(int semitone) {
		super(semitone);
	}

	private final static String[] name = {
		"do", "do#", "re", "re#", "mi", "fa",
		"fa#", "sol", "sol#", "la", "la#", "si"
	};
	
	public String toString() {
		return name[getSemitone()];
	}
}
