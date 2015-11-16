// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class hmb extends hpb
    implements hls
{

    private hok j;
    public final hlp q = new hlp();

    public hmb()
    {
    }

    public void a(Bundle bundle)
    {
        q.a(new hmf(this, r));
    }

    public hlp getBinder()
    {
        return q;
    }

    public void onCreate(Bundle bundle)
    {
        hlp hlp1 = hlp.b(getApplicationContext());
        q.a(this);
        q.a(hlp1);
        a(bundle);
        for (Iterator iterator = q.c(hmj).iterator(); iterator.hasNext(); ((hmj)iterator.next()).a(this, r)) { }
        q.a();
        j = r.a(new hmc(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        r.b(j);
        super.onDestroy();
    }
}
