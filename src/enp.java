// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class enp
{

    final Set a = new HashSet();
    int b;
    IBinder c;
    final eno d;
    ComponentName e;
    final enn f;
    private final enq g = new enq(this);
    private boolean h;

    public enp(enn enn1, eno eno1)
    {
        f = enn1;
        super();
        d = eno1;
        b = 2;
    }

    public void a()
    {
        enn.c(f).a(enn.b(f), g);
        h = false;
        b = 2;
    }

    public void a(ServiceConnection serviceconnection)
    {
        enn.c(f).b(enn.b(f), serviceconnection);
        a.remove(serviceconnection);
    }

    public void a(ServiceConnection serviceconnection, String s)
    {
        enn.c(f).a(enn.b(f), serviceconnection, s, d.a());
        a.add(serviceconnection);
    }

    public void a(String s)
    {
        h = enn.c(f).a(enn.b(f), s, d.a(), g);
        if (h)
        {
            b = 3;
            return;
        }
        try
        {
            enn.c(f).a(enn.b(f), g);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public boolean b()
    {
        return h;
    }

    public boolean b(ServiceConnection serviceconnection)
    {
        return a.contains(serviceconnection);
    }

    public int c()
    {
        return b;
    }

    public boolean d()
    {
        return a.isEmpty();
    }

    public IBinder e()
    {
        return c;
    }

    public ComponentName f()
    {
        return e;
    }
}
