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

public final class ekn
    implements elo
{

    private final ele a;

    public ekn(ele ele1)
    {
        a = ele1;
    }

    private void a(eln eln1)
    {
        a.a(eln1);
        ejv ejv1 = a.a(eln1.e());
        if (!ejv1.d() && a.f.containsKey(eln1.e()))
        {
            eln1.c(new Status(17));
            return;
        } else
        {
            eln1.b(ejv1);
            return;
        }
    }

    private ekl b(ekl ekl)
    {
        try
        {
            a(ekl);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new eko(this, this));
            return ekl;
        }
        return ekl;
    }

    public ekl a(ekl ekl)
    {
        return b(ekl);
    }

    public void a()
    {
        while (!a.c.isEmpty()) 
        {
            try
            {
                a((eln)a.c.remove());
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
        for (Iterator iterator = a.l.iterator(); iterator.hasNext(); ((eln)iterator.next()).b(new Status(8, "The connection to Google Play services was lost"))) { }
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

    public void a(ConnectionResult connectionresult, ejs ejs, int i)
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
