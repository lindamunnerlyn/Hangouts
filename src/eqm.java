// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class eqm
{

    private static final Object a = new Object();
    private static eqm b;

    public eqm()
    {
    }

    public static eqm a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new eqn(context.getApplicationContext());
            }
        }
        return b;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public abstract boolean a(ComponentName componentname, ServiceConnection serviceconnection, String s);

    public abstract boolean a(String s, ServiceConnection serviceconnection, String s1);

    public abstract void b(ComponentName componentname, ServiceConnection serviceconnection, String s);

    public abstract void b(String s, ServiceConnection serviceconnection, String s1);

}
