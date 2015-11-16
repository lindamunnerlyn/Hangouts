// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class rv
    implements to
{

    final rs a;
    private boolean b;

    rv(rs rs1)
    {
        a = rs1;
        super();
    }

    public void a(sy sy, boolean flag)
    {
        if (b)
        {
            return;
        }
        b = true;
        a.a.k();
        if (a.c != null)
        {
            a.c.onPanelClosed(108, sy);
        }
        b = false;
    }

    public boolean a(sy sy)
    {
        if (a.c != null)
        {
            a.c.onMenuOpened(108, sy);
            return true;
        } else
        {
            return false;
        }
    }
}
