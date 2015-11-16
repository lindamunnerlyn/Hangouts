// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class jls
{

    jlv a[];
    int b;

    public jls()
    {
        this((byte)0);
    }

    private jls(byte byte0)
    {
        a = new jlv[4];
        b = 0;
    }

    public jlr a()
    {
        switch (b)
        {
        default:
            return new jqa(b, a);

        case 0: // '\0'
            return jlr.h();

        case 1: // '\001'
            return jlr.b(a[0].getKey(), a[0].getValue());
        }
    }

    public jls a(Object obj, Object obj1)
    {
        int i = b + 1;
        if (i > a.length)
        {
            a = (jlv[])jpo.b(a, jlg.a(a.length, i));
        }
        obj = jlr.c(obj, obj1);
        obj1 = a;
        i = b;
        b = i + 1;
        obj1[i] = obj;
        return this;
    }
}
