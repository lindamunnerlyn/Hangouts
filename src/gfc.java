// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class gfc
{

    public gff a;
    public Map b;
    public gff c;
    public Map d;
    public gff e;
    public gff f;
    public gff g;
    final gey h;

    public gfc(gey gey)
    {
        h = gey;
        super();
        a = null;
        b = new HashMap();
        c = null;
        d = new HashMap();
        e = null;
        f = null;
        g = null;
    }

    public void a()
    {
        a = null;
        b.clear();
        c = null;
        d.clear();
        e = null;
        f = null;
        g = null;
    }

    public boolean b()
    {
        return a == null && b.isEmpty() && c == null && d.isEmpty() && e == null && f == null;
    }

    public List c()
    {
        List list = d();
        if (g != null)
        {
            list.add(g);
        }
        Collections.sort(list, new gfd(this));
        return list;
    }

    public List d()
    {
        ArrayList arraylist = new ArrayList(b.size() + d.size() + 5);
        if (a != null)
        {
            arraylist.add(a);
        }
        arraylist.addAll(b.values());
        if (c != null)
        {
            arraylist.add(c);
        }
        arraylist.addAll(d.values());
        if (e != null)
        {
            arraylist.add(e);
        }
        if (f != null)
        {
            arraylist.add(f);
        }
        Collections.sort(arraylist, new gfe(this));
        return arraylist;
    }
}
