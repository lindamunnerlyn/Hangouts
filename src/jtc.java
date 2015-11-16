// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jtc extends jry
{

    final jsh a;
    final jta b;

    jtc(jta jta, jsh jsh1)
    {
        b = jta;
        a = jsh1;
        super();
    }

    jsd b()
    {
        return b;
    }

    public Object get(int i)
    {
        return ((java.util.Map.Entry)a.get(i)).getValue();
    }
}
