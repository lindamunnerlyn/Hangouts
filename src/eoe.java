// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

public final class eoe
    implements eop
{

    private final eof a;

    public eoe(eof eof1)
    {
        a = eof1;
    }

    public enm a(enm enm)
    {
        a.c.add(enm);
        return enm;
    }

    public void a()
    {
        a.h();
        a.g = Collections.emptySet();
    }

    public void a(int i)
    {
    }

    public void a(Bundle bundle)
    {
    }

    public void a(ConnectionResult connectionresult, emt emt, int i)
    {
    }

    public void b()
    {
        for (Iterator iterator = a.c.iterator(); iterator.hasNext(); ((eoo)iterator.next()).c()) { }
        a.c.clear();
        a.f.clear();
        a.g();
    }

    public void c()
    {
        a.i();
    }

    public String d()
    {
        return "DISCONNECTED";
    }
}
