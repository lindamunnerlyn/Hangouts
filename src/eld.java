// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

public final class eld
    implements elo
{

    private final ele a;

    public eld(ele ele1)
    {
        a = ele1;
    }

    public ekl a(ekl ekl)
    {
        a.c.add(ekl);
        return ekl;
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

    public void a(ConnectionResult connectionresult, ejs ejs, int i)
    {
    }

    public void b()
    {
        for (Iterator iterator = a.c.iterator(); iterator.hasNext(); ((eln)iterator.next()).b()) { }
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
