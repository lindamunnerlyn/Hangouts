// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

final class dqz extends bgs
{

    final cuy d;
    private final Context e;
    private final int f;
    private final hjk g;
    private final arf h;
    private final String i;

    protected dqz(Context context, int j, hjk hjk1, arf arf, cuy cuy, String s)
    {
        e = context;
        f = j;
        g = hjk1;
        h = arf;
        i = s;
        d = cuy;
    }

    public String a()
    {
        return e.getResources().getString(l.X);
    }

    protected void a(did did)
    {
        super.a(did);
        ard.b(f, h, d);
    }

    protected void a(Exception exception)
    {
        super.a(exception);
        g.a(i);
        g.b(g.f()[g.b(i)]);
    }

    public int b()
    {
        g.a(dcn.e(f), 1594);
        return ard.a(f, h, d);
    }

    public void c()
    {
        if (!j())
        {
            Toast.makeText(e, l.Z, 0).show();
            return;
        } else
        {
            Toast.makeText(e, l.Y, 0).show();
            return;
        }
    }

    public Class e()
    {
        return cux;
    }

    public Class f()
    {
        return dad;
    }
}
