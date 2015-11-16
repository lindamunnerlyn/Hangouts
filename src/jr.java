// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jr
{

    static final ju a;

    public static boolean a(Object obj)
    {
        return a.a(obj);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new jt();
        } else
        {
            a = new js();
        }
    }
}
