// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cnl extends coj
{

    final cna a;

    cnl(cna cna1, String s)
    {
        a = cna1;
        super(s);
    }

    public void a()
    {
        if (cna.a(a))
        {
            (new Thread(new cnm(this))).start();
        }
    }
}
