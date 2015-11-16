// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jof extends job
{

    jof(String s)
    {
        super(s, 3);
    }

    public boolean a(Object obj)
    {
        return obj != null;
    }

    public String toString()
    {
        return "Predicates.notNull()";
    }
}
