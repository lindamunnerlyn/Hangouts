// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class css
{

    private final vl a = new vl((byte)0);

    css()
    {
    }

    public cuz a(int i, String s)
    {
        cuz cuz1 = new cuz(i, s);
        a.a(s, cuz1);
        return cuz1;
    }

    public cuz a(int i, String s, boolean flag)
    {
        cuz cuz1;
label0:
        {
            cuz cuz2 = (cuz)a.a(s);
            if (cuz2 != null)
            {
                cuz1 = cuz2;
                if (cuz2.a == i)
                {
                    break label0;
                }
            }
            cuz1 = null;
        }
        cuz cuz3 = cuz1;
        if (cuz1 == null)
        {
            cuz3 = cuz1;
            if (flag)
            {
                cuz3 = a(i, s);
            }
        }
        return cuz3;
    }
}
