// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public final class duf
    implements dha
{

    private final List a = new ArrayList();
    private final Handler b = new Handler();

    public duf()
    {
    }

    static List a(duf duf1)
    {
        return duf1.a;
    }

    public void a(dha dha1)
    {
        g.w();
        a.add(dha1);
    }

    public void a(gmw gmw, cxi cxi)
    {
        b.post(new dug(this, gmw, cxi));
    }

    public void b(dha dha1)
    {
        g.w();
        a.remove(dha1);
    }
}
