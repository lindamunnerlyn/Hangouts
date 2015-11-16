// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class jlf extends jlg
{

    Object a[];
    int b;

    jlf(int i)
    {
        g.c(4, "initialCapacity");
        a = new Object[4];
        b = 0;
    }

    private void a(int i)
    {
        if (a.length < i)
        {
            a = jpo.b(a, a(a.length, i));
        }
    }

    public jlf a(Object obj)
    {
        n.b(obj);
        a(b + 1);
        Object aobj[] = a;
        int i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public transient jlg a(Object aobj[])
    {
        jpo.a(aobj);
        a(b + aobj.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), b, aobj.length);
        b = b + aobj.length;
        return this;
    }

    public jlg b(Object obj)
    {
        return a(obj);
    }
}
