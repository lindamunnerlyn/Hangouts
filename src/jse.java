// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class jse extends jsf
{

    Object a[];
    int b;

    jse(int i)
    {
        g.c(4, "initialCapacity");
        a = new Object[4];
        b = 0;
    }

    private void a(int i)
    {
        if (a.length < i)
        {
            a = jxa.a(a, a(a.length, i));
        }
    }

    public jse a(Object obj)
    {
        n.b(obj);
        a(b + 1);
        Object aobj[] = a;
        int i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public transient jsf a(Object aobj[])
    {
        jxa.b(aobj, aobj.length);
        a(b + aobj.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), b, aobj.length);
        b = b + aobj.length;
        return this;
    }

    public jsf b(Object obj)
    {
        return a(obj);
    }
}
