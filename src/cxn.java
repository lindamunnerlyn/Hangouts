// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cxn extends cwm
{

    private static final long serialVersionUID = 1L;
    private byte a[];
    private Map b;
    private boolean c;

    public cxn(byte abyte0[], Map map, boolean flag)
    {
        a = abyte0;
        b = map;
        c = flag;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "UpdateFavoriteContactRequest()");
        }
        jfr jfr1 = new jfr();
        jfr1.requestHeader = cvu.a(null, true, s, i, j, h);
        jfr1.b = a;
        jfr1.a = new izq[b.size()];
        s = b.entrySet().iterator();
        for (i = 0; s.hasNext(); i++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)s.next();
            izq izq1 = new izq();
            izq1.b = Boolean.valueOf(c);
            izp izp1 = new izp();
            izp1.a = new jce();
            izp1.a.b = (String)entry.getKey();
            izp1.c = (Integer)entry.getValue();
            izq1.a = izp1;
            jfr1.a[i] = izq1;
        }

        return jfr1;
    }

    public String f()
    {
        return "contacts/updatefavoritecontact";
    }

    boolean q()
    {
        return c;
    }

    Collection r()
    {
        return b.keySet();
    }
}
