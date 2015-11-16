// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class hmo extends hpe
    implements hls
{

    private hok j;
    public final hlp k = new hlp();

    public hmo()
    {
    }

    public void a(Bundle bundle)
    {
        k.a(new hmf(this, l));
    }

    public hlp getBinder()
    {
        return k;
    }

    public void onCreate(Bundle bundle)
    {
        hlp hlp1 = hlp.b(getApplicationContext());
        k.a(this);
        k.a(hlp1);
        a(bundle);
        for (Iterator iterator = k.c(hmj).iterator(); iterator.hasNext(); ((hmj)iterator.next()).a(this, l)) { }
        k.a();
        j = l.a(new hmp(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        l.b(j);
        super.onDestroy();
    }
}
