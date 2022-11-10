package it.univr.notes;

public class Note {
	private final int semitone;

	public Note(int semitone) {
		this.semitone = semitone;

		if (semitone < 0 || semitone > 11)
			System.out.println("illegal semitone");
	}

	public final int getSemitone() {
		return semitone;
	}

	public String toString() {
		return "nota di semitono " + semitone;
	}

	/*
	 * public boolean equals(Note other) {
	 * return semitone == other.semitone;
	 * }
	 */

	public boolean equals(Object other) {
		// una nota e' semanticamente uguale a un'altra nota che abbia lo stesso
		// semitono

		// semitoni diversi no
		// una durata ed una no no
		// no durata entrambi si
		// stessa durata si

		if (other instanceof Note) {
			Duration thisDuration = null;
			Duration otherDuration = null;

			if (other instanceof ItalianNoteWithDuration)
				otherDuration = ((ItalianNoteWithDuration) other).getDuration();
			if (other instanceof EnglishNoteWithDuration)
				otherDuration = ((EnglishNoteWithDuration) other).getDuration();

			if (this instanceof ItalianNoteWithDuration)
				thisDuration = ((ItalianNoteWithDuration) this).getDuration();
			if (this instanceof EnglishNoteWithDuration)
				thisDuration = ((EnglishNoteWithDuration) this).getDuration();

			if (semitone != ((Note) other).semitone)
				return false;

			if (thisDuration != null && otherDuration == null)
				return false;
			if (thisDuration == null && otherDuration != null)
				return false;
			if(thisDuration != otherDuration)
				return false;

			return true;
		}
		return false;
	}
}
