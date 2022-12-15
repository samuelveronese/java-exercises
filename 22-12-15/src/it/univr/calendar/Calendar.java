package it.univr.calendar;

import java.util.Iterator;

public class Calendar implements Iterable<Calendar.Date>{
    private final int year; // l'anno del calendario

    public Calendar(int year) {
        // costruisce il calendario per l'anno indicato
        this.year = year;
    }

    public boolean isLeapYear() {
        // determina se il calendario è per un anno bisestile
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        return false;
    }

    public Date getStart() {
        // restituisce la prima data del calendario (primo gennaio)
        return new Date(0);
    }

    public Date getEnd() {
        // restituisce l'ultima data del calendario (31 dicembre)
        if (isLeapYear())
            return new Date(365);
        return new Date(364);
    }

    // classe interna
    public class Date {
        // 0 = primo gennaio, 364 = 31 dicembre (per i bisestili: 365 = 31 dicembre)
        private final int daysFromStart;

        private int[] daysInMonth = { 31, isLeapYear() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        private Date(int daysFromStart) {
            this.daysFromStart = daysFromStart;
        }

        // ritorna il giorno di questa data, tra 1 e 31
        public int getDay() {
            int month = 0;
            int days = daysFromStart;
            while(days >= daysInMonth[month]) {
                days -= daysInMonth[month];
                month++;
            }
            return days + 1;
        }

        // ritorna il mese di questa data tra 1 e 12
        public int getMonth() {
            int month = 0;
            int days = daysFromStart;
            while(days >= daysInMonth[month]) {
                days -= daysInMonth[month];
                month++;
            }
            return month + 1;
        }

        // ritorna l'anno di questa data
        public int getYear() {
            return year;
        }

        public String toString() {
            return String.format("%d/%d/%d", getDay(), getMonth(), getYear());
        }
    }

    @Override
    public Iterator<Date> iterator() {
        return new Iterator<Date>() {
            private Date current = getStart();

            @Override
            public boolean hasNext() {
                return current.daysFromStart <= getEnd().daysFromStart;
            }

            @Override
            public Date next() {
                Date result = current;
                current = new Date(current.daysFromStart + 1);
                return result;
            }
        };
    }

}