// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jmc extends jkz
{

    final jlk b;
    final jmb c;

    jmc(jmb jmb, jlk jlk1)
    {
        c = jmb;
        b = jlk1;
        super();
    }

    jle c()
    {
        return c;
    }

    public Object get(int i)
    {
        return ((java.util.Map.Entry)b.get(i)).getValue();
    }
}
