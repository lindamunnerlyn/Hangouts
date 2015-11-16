// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class dgj
{

    private static final boolean a = false;
    public final dcl b;
    final dgk c;
    public String d;

    protected dgj(Parcel parcel)
    {
        b = (dcl)parcel.readParcelable(dcl.getClassLoader());
        c = new dgk();
    }

    public dgj(aoa aoa)
    {
        b = new dcl(aoa);
        c = new dgk();
    }

    public void a()
    {
    }

    protected final void a(Parcel parcel, int i)
    {
        parcel.writeParcelable(b, i);
    }

    public final void a(dmf dmf1)
    {
        c.a(dmf1);
    }

    public boolean a(dcw dcw1, int i)
    {
        return a(dcw1, i, null);
    }

    public boolean a(dcw dcw1, int i, dls dls)
    {
        List list = j();
        if (list.isEmpty())
        {
            return false;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((dmf)iterator.next()).b(d)) { }
        if (a)
        {
            int l = list.size();
            String s = String.valueOf(getClass().getSimpleName());
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 76)).append("sendRequestsToServer: sending ").append(l).append(" requests from executing operation ").append(s).toString());
        }
        dcw1.a(list, i, dls);
        return true;
    }

    public int b()
    {
        return 1;
    }

    protected final int b(alt alt1)
    {
        a();
        a(b.c, alt1.a());
        return aly.c;
    }

    public Object c()
    {
        return null;
    }

    public List j()
    {
        return c.c();
    }

    protected final void k()
    {
        c.c().clear();
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
