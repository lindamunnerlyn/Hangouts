// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class rx
    implements to
{

    final rs a;

    rx(rs rs1)
    {
        a = rs1;
        super();
    }

    public void a(sy sy, boolean flag)
    {
        if (a.c != null)
        {
            a.c.onPanelClosed(0, sy);
        }
    }

    public boolean a(sy sy)
    {
        if (sy == null && a.c != null)
        {
            a.c.onMenuOpened(0, sy);
        }
        return true;
    }
}
