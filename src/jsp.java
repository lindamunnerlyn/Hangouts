// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jsp extends jyh
{

    final jyh a;
    final jso b;

    jsp(jso jso, jyh jyh1)
    {
        b = jso;
        a = jyh1;
        super();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return ((java.util.Map.Entry)a.next()).getKey();
    }
}
