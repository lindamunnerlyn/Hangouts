// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class eqp
{

    final Set a = new HashSet();
    int b;
    IBinder c;
    final eqo d;
    ComponentName e;
    final eqn f;
    private final eqq g = new eqq(this);
    private boolean h;

    public eqp(eqn eqn1, eqo eqo1)
    {
        f = eqn1;
        super();
        d = eqo1;
        b = 2;
    }

    public void a()
    {
        eqn.c(f).a(eqn.b(f), g);
        h = false;
        b = 2;
    }

    public void a(ServiceConnection serviceconnection)
    {
        eqn.c(f).b(eqn.b(f), serviceconnection);
        a.remove(serviceconnection);
    }

    public void a(ServiceConnection serviceconnection, String s)
    {
        eqn.c(f).a(eqn.b(f), serviceconnection, s, d.a());
        a.add(serviceconnection);
    }

    public void a(String s)
    {
        h = eqn.c(f).a(eqn.b(f), s, d.a(), g);
        if (h)
        {
            b = 3;
            return;
        }
        try
        {
            eqn.c(f).a(eqn.b(f), g);
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
