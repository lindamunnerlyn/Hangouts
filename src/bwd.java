// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bwd
    implements brk
{

    final brj a;
    final bwc b;

    bwd(bwc bwc, brj brj1)
    {
        b = bwc;
        a = brj1;
        super();
    }

    public void a(gmt gmt1)
    {
        int i = 0;
        boolean flag;
        if (a.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (gmt1.d() != flag)
        {
            brj brj1 = a;
            if (!gmt1.d())
            {
                i = 8;
            }
            brj1.setVisibility(i);
        }
    }
}
