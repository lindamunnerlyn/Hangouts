// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class awl
    implements bse
{

    final avv a;

    awl(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a(boolean flag, boolean flag1)
    {
        if (!flag1)
        {
            Object obj = a;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            avv.a(((avv) (obj)), flag1);
            if (flag)
            {
                eco.a(a.getView());
            } else
            {
                eco.a(a.getView(), false);
            }
        }
        obj = egb.a;
        if (obj != null)
        {
            ((egb) (obj)).a(flag);
        }
    }
}
