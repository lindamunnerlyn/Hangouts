// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class rz
    implements tq
{

    final ru a;

    rz(ru ru1)
    {
        a = ru1;
        super();
    }

    public void a(ta ta, boolean flag)
    {
        if (a.c != null)
        {
            a.c.onPanelClosed(0, ta);
        }
    }

    public boolean a(ta ta)
    {
        if (ta == null && a.c != null)
        {
            a.c.onMenuOpened(0, ta);
        }
        return true;
    }
}
