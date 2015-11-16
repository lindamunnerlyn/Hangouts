// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dou
    implements fsn, hka
{

    private final hfa a;
    private final gmu b;
    private final String c;
    private final String d;
    private final String e;

    public dou(hfa hfa1, gmu gmu1, String s, String s1, String s2)
    {
        a = hfa1;
        b = gmu1;
        c = s;
        d = s1;
        e = s2;
    }

    public void E_()
    {
        String s;
        int i;
        boolean flag;
        boolean flag1;
        if (c != null)
        {
            flag = b.a(c, true);
        } else
        {
            flag = true;
        }
        s = b.a(e, "ANY_RINGTONE_NOT_SILENT");
        flag1 = b.a(d, true);
        if (!flag)
        {
            i = l.hs;
        } else
        if (s != null && flag1)
        {
            i = l.ii;
        } else
        if (s != null)
        {
            i = l.ij;
        } else
        if (flag1)
        {
            i = l.tr;
        } else
        {
            i = l.jY;
        }
        a.h(i);
    }
}
