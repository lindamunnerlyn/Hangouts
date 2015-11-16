// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class drn
    implements hou, hoy
{

    private final hjr a;
    private final grb b;
    private final String c;
    private final String d;
    private final String e;

    public drn(hjr hjr1, grb grb1, String s, String s1, String s2)
    {
        a = hjr1;
        b = grb1;
        c = s;
        d = s1;
        e = s2;
    }

    public void G_()
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
            i = l.hb;
        } else
        if (s != null && flag1)
        {
            i = l.hC;
        } else
        if (s != null)
        {
            i = l.hD;
        } else
        if (flag1)
        {
            i = l.sJ;
        } else
        {
            i = l.jr;
        }
        a.h(i);
    }
}
