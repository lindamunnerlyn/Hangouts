// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import java.math.BigDecimal;

public final class uk
{

    public final ComponentName a;
    public final long b;
    public final float c;

    public uk(ComponentName componentname, long l, float f)
    {
        a = componentname;
        b = l;
        c = f;
    }

    public uk(String s, long l, float f)
    {
        this(ComponentName.unflattenFromString(s), l, f);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (uk)obj;
            if (a == null)
            {
                if (((uk) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((uk) (obj)).a))
            {
                return false;
            }
            if (b != ((uk) (obj)).b)
            {
                return false;
            }
            if (Float.floatToIntBits(c) != Float.floatToIntBits(((uk) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return ((i + 31) * 31 + (int)(b ^ b >>> 32)) * 31 + Float.floatToIntBits(c);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        stringbuilder.append("; activity:").append(a);
        stringbuilder.append("; time:").append(b);
        stringbuilder.append("; weight:").append(new BigDecimal(c));
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
