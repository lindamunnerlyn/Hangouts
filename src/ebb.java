// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ebb
{

    private final vj a = new vj((byte)0);

    ebb()
    {
    }

    public csw a(int i, String s)
    {
        csw csw1 = new csw(i, s);
        a.a(s, csw1);
        return csw1;
    }

    public csw a(int i, String s, boolean flag)
    {
        csw csw1;
label0:
        {
            csw csw2 = (csw)a.a(s);
            if (csw2 != null)
            {
                csw1 = csw2;
                if (csw2.a == i)
                {
                    break label0;
                }
            }
            csw1 = null;
        }
        csw csw3 = csw1;
        if (csw1 == null)
        {
            csw3 = csw1;
            if (flag)
            {
                csw3 = a(i, s);
            }
        }
        return csw3;
    }
}
