// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public final class dxn
    implements dij
{

    final List a = new ArrayList();
    private final Handler b = new Handler();

    public dxn()
    {
    }

    public void a(dij dij1)
    {
        g.v();
        a.add(dij1);
    }

    public void a(grd grd, czm czm)
    {
        b.post(new dxo(this, grd, czm));
    }

    public void b(dij dij1)
    {
        g.v();
        a.remove(dij1);
    }
}
