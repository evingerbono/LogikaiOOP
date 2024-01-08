package logikaioop;

import java.util.Arrays;

public class Allitasok
{
    private final String[] allitasok;
    
    public Allitasok(String[] allitasok)
    {
        this.allitasok = allitasok;
    }

    public String[] getAllitasok()
    {
        return allitasok;
    }

    @Override public String toString()
    {
        return "Allitasok{" + "allitasok=" + Arrays.toString(allitasok) + '}';
    }

    @Override public int hashCode()
    {
        int hash = 5;
        hash = 79 * hash + Arrays.deepHashCode(this.allitasok);
        return hash;
    }

    @Override public boolean equals(Object obj)
    {
        if (obj instanceof String[] s)
        {
            int i = 0;
            while (i < allitasok.length && allitasok[i].equals(s[i]))
            {
                i++;
            }
            return i >= allitasok.length;
        }
        else
        {
            return false;
        }
    }
}
