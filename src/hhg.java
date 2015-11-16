// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class hhg extends hkf
    implements hha
{

    public final hgx a = new hgx();
    private hjr c;

    public hhg()
    {
    }

    static hiv a(hhg hhg1)
    {
        return hhg1.b;
    }

    public void a(Bundle bundle)
    {
        a.a(new hhn(this, b));
    }

    public hgx getBinder()
    {
        return a;
    }

    public void onCreate(Bundle bundle)
    {
        hgx hgx1 = hgx.b(getApplicationContext());
        a.a(this);
        a.a(hgx1);
        a(bundle);
        for (Iterator iterator = a.c(hhr).iterator(); iterator.hasNext(); ((hhr)iterator.next()).a(this, b)) { }
        a.a();
        c = b.a(new hhh(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        b.b(c);
        super.onDestroy();
    }
}
