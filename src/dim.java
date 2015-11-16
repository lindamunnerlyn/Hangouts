// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dim extends dgj
{

    private final String a;
    private final int e;
    private final int f[];

    public dim(aoa aoa, String s, boolean flag, boolean flag1, boolean flag2)
    {
        super(aoa);
        a = s;
        int i;
        int j;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        e = i;
        if (flag2)
        {
            i = 2;
        } else
        {
            i = 0;
        }
        if (flag1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        f = (new int[] {
            i, j
        });
    }

    public void a()
    {
        aow aow1 = new aow(g.nU, super.b.a);
        if (e == 1)
        {
            aow1.ad(a);
        } else
        {
            aoq.a(aow1, a);
        }
        a(((dmf) (new cwu(a, e, f))));
    }
}
