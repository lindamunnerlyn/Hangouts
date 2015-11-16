// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class hhj extends hkg
    implements hha
{

    private hjr j;
    public final hgx p = new hgx();

    public hhj()
    {
    }

    static hkk a(hhj hhj1)
    {
        return hhj1.q;
    }

    public void a(Bundle bundle)
    {
        p.a(new hhn(this, q));
    }

    public hgx getBinder()
    {
        return p;
    }

    public void onCreate(Bundle bundle)
    {
        hgx hgx1 = hgx.b(getApplicationContext());
        p.a(this);
        p.a(hgx1);
        a(bundle);
        for (Iterator iterator = p.c(hhr).iterator(); iterator.hasNext(); ((hhr)iterator.next()).a(this, q)) { }
        p.a();
        j = q.a(new hhk(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        q.b(j);
        super.onDestroy();
    }
}
