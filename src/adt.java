// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class adt
    implements adx
{

    private final String a;
    private final List b;

    public adt(String s, List list)
    {
        a = s;
        b = list;
    }

    public adz a()
    {
        return adz.n;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof adt))
        {
            return false;
        }
        obj = (adt)obj;
        if (!TextUtils.equals(a, ((adt) (obj)).a))
        {
            return false;
        }
        if (b == null)
        {
            return ((adt) (obj)).b == null;
        }
        int j = b.size();
        if (j != ((adt) (obj)).b.size())
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (!TextUtils.equals((CharSequence)b.get(i), (CharSequence)((adt) (obj)).b.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    public int hashCode()
    {
        int i;
        int j;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            Iterator iterator = b.iterator();
            do
            {
                j = i;
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (s != null)
                {
                    j = s.hashCode();
                } else
                {
                    j = 0;
                }
                i = j + i * 31;
            } while (true);
        } else
        {
            j = i;
        }
        return j;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = a;
        stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 24)).append("android-custom: ").append(s).append(", data: ").toString());
        if (b == null)
        {
            s = "null";
        } else
        {
            s = Arrays.toString(b.toArray());
        }
        stringbuilder.append(s);
        return stringbuilder.toString();
    }
}
