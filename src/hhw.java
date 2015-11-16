// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class hhw extends hkj
    implements hha
{

    private hjr j;
    public final hgx k = new hgx();

    public hhw()
    {
    }

    static hkk a(hhw hhw1)
    {
        return hhw1.l;
    }

    public void a(Bundle bundle)
    {
        k.a(new hhn(this, l));
    }

    public hgx getBinder()
    {
        return k;
    }

    public void onCreate(Bundle bundle)
    {
        hgx hgx1 = hgx.b(getApplicationContext());
        k.a(this);
        k.a(hgx1);
        a(bundle);
        for (Iterator iterator = k.c(hhr).iterator(); iterator.hasNext(); ((hhr)iterator.next()).a(this, l)) { }
        k.a();
        j = l.a(new hhx(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        l.b(j);
        super.onDestroy();
    }
}
