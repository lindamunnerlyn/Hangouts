// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jxh extends jry
{

    final jxg a;

    jxh(jxg jxg1)
    {
        a = jxg1;
        super();
    }

    jsd b()
    {
        return a;
    }

    public Object get(int i)
    {
        java.util.Map.Entry entry = jxe.d(a.a.b)[i];
        return jwd.a(entry.getValue(), entry.getKey());
    }
}
