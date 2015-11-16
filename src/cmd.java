// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cmd extends cmu
{

    final cls a;

    cmd(cls cls1, String s)
    {
        a = cls1;
        super(s);
    }

    public void a()
    {
        if (cls.a(a))
        {
            (new Thread(new cme(this))).start();
        }
    }
}
