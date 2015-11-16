// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cvj extends cui
{

    private static final long serialVersionUID = 1L;
    private byte a[];
    private Map b;
    private boolean c;

    public cvj(byte abyte0[], Map map, boolean flag)
    {
        a = abyte0;
        b = map;
        c = flag;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s1, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "UpdateFavoriteContactRequest()");
        }
        izm izm1 = new izm();
        izm1.requestHeader = ctq.a(null, true, s1, i, j, h);
        izm1.b = a;
        izm1.a = new itl[b.size()];
        s1 = b.entrySet().iterator();
        for (i = 0; s1.hasNext(); i++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)s1.next();
            itl itl1 = new itl();
            itl1.b = Boolean.valueOf(c);
            itk itk1 = new itk();
            itk1.a = new ivz();
            itk1.a.b = (String)entry.getKey();
            itk1.c = (Integer)entry.getValue();
            itl1.a = itk1;
            izm1.a[i] = itl1;
        }

        return izm1;
    }

    public String g()
    {
        return "contacts/updatefavoritecontact";
    }

    boolean r()
    {
        return c;
    }

    Collection s()
    {
        return b.keySet();
    }
}
