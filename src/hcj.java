// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hcj
    implements Runnable
{

    final int a;
    final hci b;

    hcj(hci hci1, int i)
    {
        b = hci1;
        a = i;
        super();
    }

    public void run()
    {
        b.a(a, new String[0], new int[0]);
    }
}
