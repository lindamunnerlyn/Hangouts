// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class rx
    implements tq
{

    final ru a;
    private boolean b;

    rx(ru ru1)
    {
        a = ru1;
        super();
    }

    public void a(ta ta, boolean flag)
    {
        if (b)
        {
            return;
        }
        b = true;
        a.a.k();
        if (a.c != null)
        {
            a.c.onPanelClosed(108, ta);
        }
        b = false;
    }

    public boolean a(ta ta)
    {
        if (a.c != null)
        {
            a.c.onMenuOpened(108, ta);
            return true;
        } else
        {
            return false;
        }
    }
}
