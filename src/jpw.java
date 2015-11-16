// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jpw extends jkz
{

    final jpv b;

    jpw(jpv jpv1)
    {
        b = jpv1;
        super();
    }

    jle c()
    {
        return b;
    }

    public Object get(int i)
    {
        jlu jlu = jps.a(b.a.a)[i];
        return jpc.a(jlu.getValue(), jlu.getKey());
    }
}
