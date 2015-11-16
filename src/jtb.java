// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jtb extends jyh
{

    final jyh a;
    final jta b;

    jtb(jta jta1)
    {
        b = jta1;
        super();
        a = b.a.d().a();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return ((java.util.Map.Entry)a.next()).getValue();
    }
}
