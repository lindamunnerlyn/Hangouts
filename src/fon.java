// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import java.util.concurrent.ConcurrentHashMap;

abstract class fon
{

    private final ConcurrentHashMap a = new ConcurrentHashMap();
    private final Resources b;

    public fon(Resources resources)
    {
        b = resources;
    }

    public String a(int i)
    {
        String s;
        if (i == 0)
        {
            s = null;
        } else
        {
            String s2 = (String)a.get(Integer.valueOf(i));
            s = s2;
            if (s2 == null)
            {
                String s1 = a(b, i);
                a.put(Integer.valueOf(i), s1);
                return s1;
            }
        }
        return s;
    }

    protected abstract String a(Resources resources, int i);
}
