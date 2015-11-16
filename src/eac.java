// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class eac
{

    public final boolean a;
    public final int b;
    public final int c;

    eac(boolean flag, int i, int j)
    {
        a = flag;
        b = i;
        c = j;
    }

    public boolean a(int i, int j)
    {
        return a && b > i && c > j;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass() == obj.getClass())
        {
            if (a == ((eac) (obj = (eac)obj)).a && b == ((eac) (obj)).b && c == ((eac) (obj)).c)
            {
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        return String.format(Locale.US, "is connected: %b, signal level: %d%%, link speed: %dMbps", new Object[] {
            Boolean.valueOf(a), Integer.valueOf(b), Integer.valueOf(c)
        });
    }
}
