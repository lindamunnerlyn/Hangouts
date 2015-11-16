// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;

final class hgo
    implements hgn, hhc, hma, hor, hou, hoy
{

    hgz a;
    private gtz b;
    private final SparseArray c = new SparseArray();
    private Context d;

    hgo(hof hof1)
    {
        hof1.a(this);
    }

    static void a(hgo hgo1, int i, hgt hgt1)
    {
        hgo1 = (hgw)hgo1.c.get(i);
        if (hgo1 != null)
        {
            hgo1.a(hgt1.a());
        }
    }

    public void G_()
    {
        a.a(this);
        b.a(new hgp(this));
    }

    public hgn a(int i, hgw hgw1)
    {
        if (c.get(i) != null)
        {
            hgw1 = String.valueOf("Cannot register more than one handler for a given  id: ");
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(hgw1).length() + 11)).append(hgw1).append(i).toString());
        } else
        {
            c.put(i, hgw1);
            return this;
        }
    }

    public void a()
    {
        a.b(this);
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        d = context;
        a = (hgz)hlp1.a(hgz);
        b = (gtz)hlp1.a(gtz);
    }

    public void a(hgv hgv, int i, List list)
    {
        b.a(i);
        if ((hgw)c.get(i) == null)
        {
            throw new IllegalStateException((new StringBuilder(115)).append("You must register a result handler for request code").append(i).append(" before requesting permissions with that request code").toString());
        } else
        {
            i = b.b(i);
            a.a(hgv, i, list);
            return;
        }
    }

    public boolean a(hgt hgt1)
    {
        return b.a(hgt1.a, new hgq(this, hgt1));
    }
}
