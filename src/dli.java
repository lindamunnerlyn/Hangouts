// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dli
    implements Runnable
{

    final String a;
    final aoh b;
    final dlg c;

    dli(dlg dlg1, String s, aoh aoh)
    {
        c = dlg1;
        a = s;
        b = aoh;
        super();
    }

    public void run()
    {
        dlg.a(c, a, b);
    }
}
