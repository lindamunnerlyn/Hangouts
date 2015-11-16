// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

public final class enq
    implements ServiceConnection
{

    final enp a;

    public enq(enp enp1)
    {
        a = enp1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = enn.a(a.f);
        hashmap;
        JVM INSTR monitorenter ;
        a.c = ibinder;
        a.e = componentname;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_78;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        a.b = 1;
        hashmap;
        JVM INSTR monitorexit ;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = enn.a(a.f);
        hashmap;
        JVM INSTR monitorenter ;
        a.c = null;
        a.e = componentname;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_74;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        a.b = 2;
        hashmap;
        JVM INSTR monitorexit ;
    }
}
