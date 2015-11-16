// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class eno
    implements eop
{

    private final eof a;

    public eno(eof eof1)
    {
        a = eof1;
    }

    private void a(eoo eoo1)
    {
        a.a(eoo1);
        emw emw1 = a.a(eoo1.f());
        if (!emw1.d() && a.f.containsKey(eoo1.f()))
        {
            eoo1.c(new Status(17));
            return;
        } else
        {
            eoo1.b(emw1);
            return;
        }
    }

    private enm b(enm enm)
    {
        try
        {
            a(enm);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new enp(this, this));
            return enm;
        }
        return enm;
    }

    public enm a(enm enm)
    {
        return b(enm);
    }

    public void a()
    {
        while (!a.c.isEmpty()) 
        {
            try
            {
                a((eoo)a.c.remove());
            }
            catch (DeadObjectException deadobjectexception) { }
        }
    }

    public void a(int i)
    {
        if (i == 1)
        {
            a.l();
        }
        for (Iterator iterator = a.l.iterator(); iterator.hasNext(); ((eoo)iterator.next()).b(new Status(8, "The connection to Google Play services was lost"))) { }
        a.a(null);
        a.b.a(i);
        a.b.a();
        if (i == 2)
        {
            a.b();
        }
    }

    public void a(Bundle bundle)
    {
    }

    public void a(ConnectionResult connectionresult, emt emt, int i)
    {
    }

    public void b()
    {
        a.f.clear();
        a.g();
        a.a(null);
        a.b.a();
    }

    public void c()
    {
    }

    public String d()
    {
        return "CONNECTED";
    }
}
