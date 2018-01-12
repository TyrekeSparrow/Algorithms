package com.pop900.algorithm.strings;

/**
 * Created by michael on 16-10-12.
 */
public class KeyIndextedCount {
    public static void main(String[] args) {
        Section[] a = {
            new Section("Anderson", 2),
            new Section("Brown   ", 3),
            new Section("Davis   ", 3),
            new Section("Garcia  ", 4),
            new Section("Harris  ", 1),
            new Section("Jackson ", 3),
            new Section("Johnson ", 3),
            new Section("Johnson ", 4),
            new Section("Martin  ", 1),
            new Section("Martinez", 2),
            new Section("Miller  ", 2),
            new Section("Moore   ", 1),
            new Section("Robinson", 2),
            new Section("Smith   ", 4),
            new Section("Taylor  ", 3),
            new Section("Thomas  ", 4),
            new Section("Thompson", 4),
            new Section("White   ", 2),
            new Section("Williams", 3),
            new Section("Wilson  ", 4),
        };

        int N = a.length;
        // [0, R)
        int R = 5;
        // count
        int[] count = new int[R + 1];
        // aux
        Section[] aux = new Section[N];

        // compute frequency counts
        for (int i = 0; i < N; i++) {
            count[a[i].key() + 1]++;
        }
        // transform frequency to indices
        for (int r = 0; r < R; r++) {
            count[r + 1] += count[r];
        }
        // distribute the records
        for (int n = 0; n < N; n++) {
            aux[count[a[n].key()]++] = a[n];
        }
        // copy back
        for (int n = 0; n < N; n++) {
            a[n] = aux[n];
        }
        for (Section s : a) {
            System.out.println(s);
        }
    }






}

class Section {
    private final String name;
    private final int section;

    public Section(String name, int section) {
        this.name = name;
        this.section = section;
    }

    public int key() {
        return section;
    }

    @Override
    public String toString() {
        return name + "    " + section;
    }
}
