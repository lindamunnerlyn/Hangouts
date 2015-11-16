// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class hly extends hpa
    implements hls
{

    public final hlp a = new hlp();
    private hok c;

    public hly()
    {
    }

    public void a(Bundle bundle)
    {
        a.a(new hmf(this, b));
    }

    public hlp getBinder()
    {
        return a;
    }

    public void onCreate(Bundle bundle)
    {
        hlp hlp1 = hlp.b(getApplicationContext());
        a.a(this);
        a.a(hlp1);
        a(bundle);
        for (Iterator iterator = a.c(hmj).iterator(); iterator.hasNext(); ((hmj)iterator.next()).a(this, b)) { }
        a.a();
        c = b.a(new hlz(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        b.b(c);
        super.onDestroy();
    }
}
