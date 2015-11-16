// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jlz extends jkz
{

    final jlk b;
    final jly c;

    jlz(jly jly, jlk jlk1)
    {
        c = jly;
        b = jlk1;
        super();
    }

    jle c()
    {
        return c;
    }

    public Object get(int i)
    {
        return ((java.util.Map.Entry)b.get(i)).getKey();
    }
}
