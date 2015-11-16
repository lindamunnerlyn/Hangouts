// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cva
{

    long a;
    Object b;

    cva(Object obj, long l)
    {
        b = obj;
        a = l;
    }

    boolean a(Object obj)
    {
        return obj == b || obj != null && obj.equals(b);
    }
}
